package code;
import java.io.*;
import java.io.FileReader;      // both needed
import java.io.BufferedReader;  // for line input
import java.io.IOException;
import java.lang.NullPointerException;

/**
 * Data Importer
 * @author Jason A. Young
 *
 * The purpose of this class is to handle all of the
 * file imports and managements. 
 */
public class Data_Importer {

	public static void main(String[] args) {
		User_Account user = new User_Account();
		// System.out.println("Hello World");
		
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
                		System.out.print("Loading Basic Information...");
                		while(range!= null && !range.equals("basicInformationEnd")) {
                			// First Name
                			if(range.indexOf("firstName:")==0) {
                				user.setFirstName(range.substring(10));
                			}
                			// Middle Name
                			else if(range.indexOf("middleName:")==0) {
                				user.setMiddleName(range.substring(11));
                			}
                			// Last Name
                			else if(range.indexOf("lastName:")==0) {
                				user.setLastName(range.substring(9));
                			}                			
                			// Address
                			else if(range.indexOf("address:")==0) {
                				user.setState(range.substring(8));
                			}
                			// City
                			else if(range.indexOf("city:")==0) {
                				user.setState(range.substring(5));
                			}
                			// State
                			else if(range.indexOf("state:")==0) {
                				user.setState(range.substring(6));
                			}
                			// Zip Code
                			else if(range.indexOf("zip:")==0) {
                				user.setZip(range.substring(4));
                			}
                			// Phone
                			else if(range.indexOf("phone(")==0) {
                				user.addPhoneNumber(range);
                			}
                			// Email Address
                			else if(range.indexOf("email:")==0) {
                				user.addEmail(range.substring(6));
                			}
                			// Web Links
                			else if(range.indexOf("webLink#")==0) {
                				user.addWebLink(range.substring(range.indexOf(":")+1));
                			}
                			else System.out.println(range);
                			range=br.readLine();
                		}
                		
                		System.out.println("Basic Information Loaded");
                	}
                	// The Education Section
                	else if(range.equals("educationInformationStart")) {
                		range=br.readLine();
                		System.out.print("Loading Education Information...");
                		while(range!= null && !range.equals("educationInformationEnd")) {
                			// Filling out the education information
                			if(range.indexOf("educationStart#")==0) {
                				range=br.readLine();
                				Education edu = new Education();
                				while(range!= null && !range.equals("educationInformationEnd")&& range.indexOf("educationEnd#")!=0) {
		                			// Title
		                			if(range.indexOf("title:")==0) {
		                				edu.setTitle(range.substring(6));
		                			}
		                			// City
		                			else if(range.indexOf("city:")==0) {
		                				edu.setCity(range.substring(5));
		                			}
		                			// State
		                			else if(range.indexOf("state:")==0) {
		                				edu.setState(range.substring(6));
		                			}
		                			// Start Month
		                			else if(range.indexOf("startMonth:")==0) {
		                				edu.setStartMonth(range.substring(11));
		                			}
		                			// Start Year
		                			else if(range.indexOf("startYear:")==0) {
		                				edu.setStartYear(range.substring(10));
		                			}
		                			// End Month
		                			else if(range.indexOf("endMonth:")==0) {
		                				edu.setStartMonth(range.substring(9));
		                			}
		                			// End Year
		                			else if(range.indexOf("endYear:")==0) {
		                				edu.setStartYear(range.substring(8));
		                			}                			
		                			// Degree
		                			else if(range.indexOf("degree:")==0) {
		                				edu.setDegree(range.substring(7));
		                			}
		                			// Major
		                			else if(range.indexOf("major:")==0) {
		                				edu.setMajor(range.substring(6));
		                			}
		                			// Minor
		                			else if(range.indexOf("minor:")==0) {
		                				edu.setMinor(range.substring(6));
		                			}
		                			// GPA - Grade Point Average
		                			else if(range.indexOf("gpa:")==0) {
		                				edu.setGPA(range.substring(4));
		                			}
		                			// Courses
		                			else if(range.indexOf("course#")==0) {
		                				edu.addCourses(range);
		                			}
		                			else System.out.println(range);
		                			range=br.readLine();
                				}
                				user.addEducation(edu);
                				range=br.readLine();
                			}
                		}
                		
                		System.out.println("Education Information Loaded");
                	}
                	// The Work Section
                	else if(range.equals("workInformationStart")) {
                		range=br.readLine();
                		System.out.print("Loading Work Information...");
                		while(range!= null && !range.equals("workInformationEnd")) {
                			// Filling out the education information
                			if(range.indexOf("workStart#")==0) {
                				range=br.readLine();
                				Work work = new Work();
                				while(range!= null && !range.equals("workInformationEnd")&& range.indexOf("workEnd#")!=0) {
		                			// Company
		                			if(range.indexOf("company:")==0) {
		                				work.setCompanyName(range.substring(8));
		                			}
		                			// City
		                			else if(range.indexOf("city:")==0) {
		                				work.setCompanyName(range.substring(5));
		                			}
		                			// State
		                			else if(range.indexOf("state:")==0) {
		                				work.setCompanyName(range.substring(6));
		                			}
		                			// Position Info
		                			else if(range.indexOf("positionStart#")==0) {
		                				range=br.readLine();
		                				Positions pos = new Positions();
		                				while(range!= null && !range.equals("workInformationEnd")&& range.indexOf("workEnd#")!=0 && range.indexOf("positionEnd#")!=0) {
		                					// Position Title
		                					if(range.indexOf("position:")==0) {
		                						pos.setPositionTitle(range.substring(9));
				                			}
		                					// Start Month
		                					else if(range.indexOf("startMonth:")==0) {
		                						pos.setStartMonth(range.substring(11));
				                			}
		                					// Start Year
		                					else if(range.indexOf("startYear:")==0) {
		                						pos.setStartYear(range.substring(10));
				                			}
		                					// End Month
		                					else if(range.indexOf("endMonth:")==0) {
		                						pos.setStartMonth(range.substring(9));
				                			}
		                					// End Year
		                					else if(range.indexOf("endYear:")==0) {
		                						pos.setStartYear(range.substring(8));
				                			}
		                					// Description
		                					else if(range.indexOf("description#")==0) {
		                						pos.addDescription(range.substring(range.indexOf(":")+1));
				                			}
		                					else System.out.println(range);
		                					range=br.readLine();
		                				}
		                				work.addPosition(pos);
		                			}
		                			else System.out.println(range);
		                			range=br.readLine();
                				}
                				user.addWork(work);
                			}
                			range=br.readLine();
                		}
                		System.out.println("Work Information Loaded");
                	}
                	else System.out.println(range);
                	range=br.readLine();
                }
                //Close the stream
                fr.close();
                br.close();


			}
			catch(IOException ioe) {
				System.out.println(ioe);
			}
			catch(NullPointerException ioe) {
				System.out.println(ioe);
			}
			
		}
	}

	
	
}
