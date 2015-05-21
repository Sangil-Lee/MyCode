import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Nuclide {
	
	public Nuclide (String filename)
	{
		try {
			int linenum = FileScanning("  nuclide  ", filename);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int FileScanning(final String matchStr, String loadfile) throws IOException
	{
		BufferedReader input;
		String strline = "";
		int linenumber = 1;

		try {
			File file = new File(loadfile);
			if(!file.isFile()) 
			{
				System.out.println("File not found: " + loadfile);
				return -1;
			}
			
			input = new BufferedReader(new FileReader(loadfile));
			
			while((strline = input.readLine()) != null) {
				if(strline.contains(matchStr) == true) {
					System.out.println("Nuclide: " + strline);
					input.readLine();
					linenumber++;
					break;
				};
				linenumber++;
			};
			int numRead = 0;
			int row = 0, column = 0;

			for ( numRead = 0; numRead < 41; numRead++)
	        {
	        	String strdata = input.readLine();
	        	//System.out.println(strdata);
	        	
	        	StringTokenizer tokenstr = new StringTokenizer(strdata);
	            column = 0;
	            String strelement = "";
	    		while (tokenstr.hasMoreElements()) {
	    			//System.out.println(tokenstr.nextElement());
	    			strelement = tokenstr.nextElement().toString();
	    			if(column == 0)
	    				System.out.print("Num[" + String.valueOf(row) +"]:" + strelement + "->");
	    			column++;
	    		}
	    		System.out.println(strelement);
	    		row++;
	        }
			linenumber += numRead;
			input.close();
	        return linenumber;
	        
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		if (args.length < 1)
		{
			System.out.println("usage:Nuclide <filename>");
			return;
		}
		
		String filename = args[0].toString();
		//System.out.println("FileName: " + filename);
		Nuclide nuclide = new Nuclide(filename);

	}

}
