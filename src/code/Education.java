package code;

import java.util.ArrayList;

public class Education {
	private static String title, city, state;
	private static String degree,major, minor;
	private static double gpa; // Grade Point Average
	private static int startMonth,startYear,endMonth,endYear;
	private static ArrayList <String> courses; // Courses 
	
	/**
	 * Constructor
	 */
	public Education() {
		title=city=state=null;
		degree=major=minor=null;
		gpa = 0.0;
		startMonth = startYear = endMonth = endYear = -1;
		courses = new ArrayList<String>();
	}
	
	 /* Set Title
	 * Sets the Title
	 * @param s
	 */
	public void setTitle(String s) {
		title = s;		
	}
	
	/**
	 * Get Title
	 * Returns the Title
	 * @return The Title
	 */
	public String getTitle() {
		return title;		
	}	

	/**
	 * Set City
	 * Sets the City
	 * @param s
	 */
	public void setCity(String s) {
		state = s;		
	}
	
	/**
	 * Get City
	 * Returns the City
	 * @return The City
	 */
	public String getCity() {
		return city;		
	}

	/**
	 * Set State
	 * Sets the State
	 * @param s
	 */
	public void setState(String s) {
		state = s;		
	}
	
	/**
	 * Get State
	 * Returns the State
	 * @return The State
	 */
	public String getState() {
		return state;		
	}		

	/**
	 * Set Start Month
	 * Sets the Start Month with 0 = January & 11 = December
	 * @param s The Specified Month
	 */
	public void setStartMonth(String s) {
		try {
			startMonth = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println("Set StartMonth: "+e);
		}		
	}
	
	/**
	 * Get Start Month
	 * Returns the StartMonth as an integer value
	 * @return the StartMonth
	 */
	public Integer getStartMonth() {
		return startMonth;
	}

	/**
	 * Set Start Year
	 * Sets the Start Year with the Year 2000 = 2000
	 * @param s The Specified Year
	 */
	public void setStartYear(String s) {
		try {
			startYear = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println("Set StartYear: "+e);
		}		
	}
	
	/**
	 * Get Start Year
	 * Returns the StartYear as an integer value
	 * @return the StartYear
	 */
	public Integer getStartYear() {
		return startYear;
	}
	

	/**
	 * Set End Month
	 * Sets the End Month with 0 = January & 11 = December
	 * @param s The Specified Month
	 */
	public void setEndMonth(String s) {
		try {
			endMonth = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println("Set EndMonth: "+e);
		}		
	}
	
	/**
	 * Get End Month
	 * Returns the EndMonth as an integer value
	 * @return the EndMonth
	 */
	public Integer getEndMonth() {
		return endMonth;
	}

	/**
	 * Set End Year
	 * Sets the End Year with the Year 2000 = 2000
	 * @param s The Specified Year
	 */
	public void setEndYear(String s) {
		try {
			endYear = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println("Set EndYear: "+e);
		}		
	}
	
	/**
	 * Get End Year
	 * Returns the EndYear as an integer value
	 * @return the EndYear
	 */
	public Integer getEndYear() {
		return endYear;
	}
	
	/**
	 * Set Degree
	 * Set the Degree
	 * @param s
	 */
	public void setDegree(String s) {
		degree = s;
	}
	
	/**
	 * Get Degree
	 * Returns the Degree
	 * @return the Degree
	 */
	public String getDegree() {
		return degree;
	}
	
	/**
	 * Set Major
	 * Set the Major/Main Focus of the educational study
	 * @param s
	 */
	public void setMajor(String s) {
		major = s;
	}
	
	/**
	 * Get Major
	 * Returns the Major/Main Focus
	 * @return the Major/Main Focus
	 */
	public String getMajor() {
		return major;
	}
	
	/**
	 * Sets the Minor
	 * Sets the Minor to the specified String
	 * @param s The new Minor
	 */
	public void setMinor(String s) {
		minor = s;		
	}	

	/**
	 * Get Minor
	 * Returns the Education Minor
	 * @return 
	 */
	public String getMinor() {
		return minor;
	}
	
	/**
	 * Set GPA
	 * Sets the gpa variable to the double of the specified String s
	 * @param s
	 */
	public void setGPA(String s){
		try {
			gpa = Double.parseDouble(s);
		} catch (NumberFormatException e) {
			System.out.println("Set GPA: "+e);
		}
	}
	
	/**
	 * Get GPA
	 * Returns the Education GPA
	 * @return gpa
	 */
	public Double getGPA() {
		return gpa;
	}
	
	/**
	 * Add Courses
	 * Add courses to the degree
	 * @param s The specified course
	 */
	public void addCourses(String s) {
		// Needs further development
		courses.add(s);		
	}
	

}
