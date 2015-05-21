import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.Vector;

public class KinacInputGen {

	final String OUTFILEPATH = "C:\\scale6\\OrigenArp\\Output";
	//final String OUTFILEPATH = "Output";
	final String OUTBATHPATH = OUTFILEPATH +"\\out";

	String fOutName = "";
	String fuelType = "";
	
	double	uranium, uraniumE, uraniumI;
	double	enrichment, enrichmentE, enrichmentI;
	double	burnup, burnupE, burnupI;
	double	cycle;
	double	irradiation;
	int		library;
	
	int		[] libraries = new int[]{1,2,3};
	
	double	density;
	//int		coolingTime, coolingTimeE, coolingTimeI;
	double		coolingTime, coolingTimeE, coolingTimeI;
	
	double  [] coollingTimeArray = new double[]{ 0.1, 0.3, 1, 3, 10, 30 };
	double	average, averageE, averageI;
	
	int idx56 = 0;

	public KinacInputGen (final String loadfile) throws IOException, InterruptedException
	{
		uranium = uraniumE = uraniumI = 0.0;
		enrichment = enrichmentE = enrichmentI = 0.0;
		burnup = burnupE = burnupI = 0.0;
		cycle = 0.0;
		irradiation = 1000;
		library = 1;
		density = 0.71;
		coolingTime = coolingTimeE = coolingTimeI = 0;
		average = averageE = averageI;

		BufferedReader input;
		BufferedWriter out = null;
		String strline = "";
		File outFile = null;

		makeOutputDir();

		try {
			input = new BufferedReader(new FileReader(loadfile));
			
			int column = 0;
		
			input.readLine();
			while((strline = input.readLine()) != null) 
			{
				StringTokenizer tokenstr = new StringTokenizer(strline,",\t");
				String strelement = "";
	    		column = 0;
	    		while (tokenstr.hasMoreElements()) {
	    			strelement = tokenstr.nextElement().toString();
	    		
	    			switch(column)
	    			{
	    				case 0:
	    					fOutName = strelement;
	    					break;
	    				case 1:
	    					fuelType = strelement;
	    					break;
	    				case 2:
	    					burnup = Double.valueOf(strelement);
	    					break;
	    				case 3:
	    					uranium = Double.valueOf(strelement);
	    					break;
	    				case 4:
	    					enrichment = Double.valueOf(strelement);
	    					break;
	    				case 5:
	    					coolingTime = Double.valueOf(strelement);
	    					break;
	    				case 6:
	    					cycle = Integer.valueOf(strelement);
	    					break;
	    				case 7:
	    					average = Double.valueOf(strelement);
	    					break;
	    				case 8:
	    					library = Integer.valueOf(strelement);
	    					if(library == 0) library = 1;
	    					break;
	    			};
					column++;
	    		}

	    		String outfile = OUTFILEPATH + "\\" + fOutName + ".inp";
	    		outFile = new File(outfile);
	    		
	    		if(outFile.exists() == true) outFile.delete();
	    		
	    		out = new BufferedWriter(new FileWriter(outFile));
	    	
	    		createOutput (out);
	    		
	    		idx56 = 0;
	    		
	    		out.close();
	    		System.out.print("Title: " + fOutName);
				System.out.print(", Fuel Type: " + fuelType);
				System.out.print(", Burnup: " + burnup);
				System.out.print(", Uranium: " + uranium);
				System.out.print(", Enrichment: " + enrichment);
				System.out.print(", Colling Time: " + coolingTime);
				System.out.print(", Cycle: " + cycle);
				System.out.print(", Average: " + average);
				System.out.println(", Libraries: " + library);
	    	}

			Process pro;
			String command = "C:/scale6/OrigenArp/kinac.bat";
			//String command = "ExecBatch";
			
			
			try {
				pro = Runtime.getRuntime().exec(command);
				//pro = new ProcessBuilder("cmd", "/c", "ExecBatch").start();
				//pro.waitFor();
				
				System.out.println("Done");
				BufferedReader reader = new BufferedReader(new InputStreamReader(pro.getInputStream()));
				BufferedReader err = 
                        new BufferedReader(new InputStreamReader(pro.getErrorStream()));

                String line = "";			
                while ((line = reader.readLine())!= null) {
                	System.out.println(line);
                }
                
                while ((line = err.readLine())!= null) {
                	System.out.println(line);
                }
                
	 		} catch (IOException e) {
	 			System.out.println("Ioexecption*****");
				e.printStackTrace();
			} catch (IllegalMonitorStateException except) {
				System.out.println("IllegalMonitorStateException*****");
				except.printStackTrace();
			}
	 		
			input.close();
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	boolean createOutput (BufferedWriter out) throws FileNotFoundException 
	{
		try {
			makeSectionLibrary(out);
			makeSectionOrigen(out);
			makeSectionOpus(out);
			makeSectionShell(out);
			return true;

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;
		}
	}

	
	void makeOutputDir() 
	{
		File fileDir = new File(OUTFILEPATH);
		File outDir = new File(OUTBATHPATH);

		// if the directory does not exist, create it
		if (!fileDir.exists()) {
		    boolean result = false;

		    try{
		        fileDir.mkdir();
		        outDir.mkdir();
		        result = true;
		    } 
		    catch(SecurityException se){
		        //handle it
		    }
		    
		    if(result) {    
		        System.out.println("DIR created");  
		    }
		}
	}
	
	boolean openInput(FileInputStream pIn) throws IOException 
	{
		byte [] dummyStr = new byte[100]; 
		
		try {
			int content;
			pIn.read(dummyStr);
			System.out.println(dummyStr);
		
			return true;
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	void makeSectionLibrary(BufferedWriter output) throws IOException 
	{
		String strData = "";
		output.write("'This SCALE input file was generated by\n");
		output.write("'OrigenArp Version  5.1.01 March 22, 2007\n");
		output.write("=arp\n");
		
		strData = fuelType +"\n";
		output.write(strData);
		
		strData = String.valueOf(enrichment)+"\n";
		output.write(strData);
		
		strData = String.valueOf(cycle) +"\n";
		output.write(strData);
		
		for(int i = 0; i < cycle; i++) {	// Irradiation Period
			strData = String.valueOf(irradiation)+"\n";
			output.write(strData);
		}
		
		for(int i = 0; i < cycle; i++) {	// Average Power
			strData = String.valueOf(burnup/1000)+"\n";
			output.write(strData);
		}
		
		for(int i = 0; i < cycle; i++) {	// No. of libraries for each cycle
			strData = String.valueOf(library)+"\n";
			output.write(strData); 
		}
		
		strData = String.valueOf(density)+"\n";
		output.write(strData); // Moderator density
		output.write("ft33f001\n");			 // New library Nmme
		output.write("end\n");
		
		System.out.println("makeSectionLibrary********");
	}
	
	void makeSectionOrigen(BufferedWriter output) throws IOException 
	{
		String strData = "";
		output.write("#origens\n");
		output.write("0$$ a4 33 a11 71 e t\n");
		strData = fuelType+"\n";
		output.write(strData);
		output.write("3$$ 33 a3 1 0 a16 2 a33 0 e t\n");
		output.write("35$$ 0 t\n");
		output.write("56$$ 10 10 a10 0 a13 4 a15 3 a18 1 e\n");
		output.write("57** 0 a3 1e-05 1 e t\n");
		output.write("Cycle 1 -01\n");
		output.write("1 MTU\n");
		output.write("58**");
		for(int i = 0; i < 10; i++) {
			output.write(" ");
			strData = String.valueOf(burnup/1000);
			output.write(strData);    // burnup/1000 10회 반복입력 
		}
		output.write("\n");
		
		output.write("60** 100 200 300 400 500 600 700 800 900 1000\n");
		
		output.write("66$$ a1 2 a5 2 a9 2 e\n"); 
		output.write("73$$ 922340 922350 922360 922380\n"); 
		output.write("74** 413.85 46500 213.9 952872.3\n"); 
		output.write("75$$ 2 2 2 2\n"); 
		output.write("t\n");
		output.write("54$$ a8 1 a11 0 e\n");

		for(int i = 0; i < coollingTimeArray.length; i++) {
			if(coollingTimeArray[i] <  coolingTime) {
				++idx56;								// 기준값 0.1,0.3,1,3,10,30 중
														// 입력된 cooling time 보다 작은 숫자까지 작성하고
														// 마지막에 cooling time 입력
			}
		}
		
		output.write("56$$ a2 ");
		strData = String.valueOf(idx56+1);
		output.write(strData); 
		output.write(" a6 1 a10 10 a14 5 a15 3 a17 2 e\n");      // a2 뒷 값 = 60**에 입력된 변수 갯수
		output.write("57** 0 a3 1e-05 e\n"); 
		output.write("95$$ 0 t\n");
		output.write("Cycle 1 Down - 01\n");
		output.write("1 MTU\n");
		
		output.write("60**");
		for(int i = 0; i < idx56; i++) {
			output.write(" ");
			strData = String.valueOf(coollingTimeArray[i]);
			output.write(strData);
		}
		
		output.write(" ");
		strData = String.valueOf(coolingTime)+"\n";
		output.write(strData);

		output.write("61** f0.05\n");                 
		output.write("65$$\n");                      
		output.write("'Gram-Atoms   Grams   Curies   Watts-All   Watts-Gamma\n");
		output.write(" 3z   1   0   0   3z   3z   3z   6z\n");
		output.write(" 3z   1   0   0   3z   3z   3z   6z\n");
		output.write(" 3z   1   0   0   3z   3z   3z   6z\n");
		output.write("t\n");

		for(int i = 0; i <= idx56; i++) {
			output.write("56$$ 0 0 a10 ");
			strData = String.valueOf(i+1);
			output.write(strData);
			output.write(" e t\n");	 // 60**에 입력된 변수 갯수만큼 작성
		}

		output.write("56$$ f0 t\n");
		output.write("end\n");

		System.out.println("makeSectionOrigen********");

	}

	void makeSectionOpus(BufferedWriter output) throws IOException
   {
		output.write("=opus\n");
		output.write("LIBUNIT=33\n");
		output.write("TYPARAMS=NUCLIDES\n");
		output.write("UNITS=GRAMS\n");
		output.write("SYMNUC=ag-109 ba-132 ba-134 ba-137 cd-108 cd-113 ce-140 ce-142 cs-134\n");
		output.write(" cs-137 er-166 eu-153 gd-154 gd-156 ge-72 in-113 in-115 mo-100 mo-97\n");
		output.write(" mo-98 nb-93 nd-143 nd-148 pm-146 pm-147 pu-239 pu-240 rh-102 ru-106\n");
		output.write(" sb-125 sm-147 sm-149 sn-115 sr-90 tc-98 te-125 u-234 u-235 u-236 u-238\n");
		output.write(" zr-90 end\n");
		output.write("NRANK=41\n");
		output.write("LIBTYPE=ALL\n");
		output.write("TIME=YEARS\n");

		output.write("NPOSITION=");
		String strData = "";
		for(int i = 0; i <= idx56; i++) {
			strData = String.valueOf(i+1);
			output.write(strData);
			output.write(" ");
		}
		output.write("end\n");
		output.write("end\n");
		System.out.println("makeSectionOpus********");

	}

	void makeSectionShell(BufferedWriter output) throws IOException
   {
		output.write("#shell\n");
		
		output.write("copy ft71f001 ");
		//output.write("\"C:\\scale6\\OrigenArp\\");
		output.write(OUTFILEPATH);
		output.write("\\");
		output.write(fOutName);
		output.write(".f71\"");
		output.write("\n");
		output.write("del ft71f001\n");
		output.write("end\n");
	}
}
