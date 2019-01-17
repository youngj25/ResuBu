package code;
import java.io.*;
import java.io.FileReader;      // both needed
import java.io.BufferedReader;  // for line input
import java.io.IOException;

/**
 * Data Importer
 * @author Jason A. Young
 *
 * The purpose of this class is to handle all of the
 * file imports and managements. 
 */
public class Data_Importer {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		// If the argument array is empty
		if(args.length== 0) {
			// Load the Example Data
			try{
				/** C:\Users\Jason\Documents\mus.txt
				 *  Get Directory of class so then I can set the auto example loader
				 *  Source: https://stackoverflow.com/questions/3153337/how-to-get-current-working-directory-in-java
				 *  Then from there we place it into a new File and load that into File reader
				 *  Source: https://www.decodejava.com/java-io-filereader.htm
				 */
				
				String pathToExample = System.getProperty("user.dir")+"/src/code/exampleImport1";
				File file= new File(pathToExample);
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String range=br.readLine();
                while(range != null) {
                	// The Basic Information Section
                	if(range.equals("basicInformationStart")) {
                		range=br.readLine();
                		System.out.println("Basic Information Start");
                		while(range!= null && !range.equals("basicInformationEnd")) {
                			System.out.println(range);
                			range=br.readLine();
                		}
                		
                		System.out.println("Basic Information End");
                		System.out.println();
                	}
                	else System.out.println(range);
                	range=br.readLine();
                }
                //Close the stream
                fr.close();
                br.close();
			}
			catch(IOException ioe) {
				System.out.println("OOPS.....");
				
			}
		}
	}

}
