import java.io.*;
import java.util.*;
import java.util.regex.*;


public class FileParse {

	private String mfilename;
	
	public FileParse(String fileName)
	{
		mfilename = fileName;
	};
	
	public int FileScanning(final String matchStr) throws IOException
	{
		BufferedReader input;
		String strline = "";
		int linenumber = 1;

		try {
			input = new BufferedReader(new FileReader(mfilename));

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
			for ( numRead = 0; numRead < 43; numRead++)
	        {
	        	String strdata = input.readLine();
	        	System.out.println("Data String : " + strdata);
	        	
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
	/*BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream, "UTF-8"));
	try {
	  while (true) {
	    String line = reader.readLine();
	    if (line == null) break;
	    String[] fields = line.split(",");
	    // process fields here
	  }
	} finally {
	  reader.close();
	}

    static final String FILEPATH = "C:/Users/nikos7/Desktop/input.txt";
    public static void main(String[] args) {
        try {
            System.out.println(new String(readFromFile(FILEPATH, 150, 23)));
            writeToFile(FILEPATH, "JavaCodeGeeks Rocks!", 22);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static byte[] readFromFile(String filePath, int position, int size)  throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "r");
        file.seek(position);
        byte[] bytes = new byte[size];
        file.read(bytes);
        file.close();
        return bytes;
    }

    private static void writeToFile(String filePath, String data, int position)  throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
        file.seek(position);
        file.write(data.getBytes());
        file.close();
    }
	*/

}
