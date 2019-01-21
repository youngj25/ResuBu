package code;

import java.util.ArrayList;

/**
 * Work
 * Holds the detailed information regarding the company of employment
 * @author Jason
 */
class Work {
	private static String company, city, state;
	private static int startMonth,startYear,endMonth,endYear;
	private static ArrayList <Positions> positions; // Courses 
	
	public Work() {
		company=city=state=null;
		startMonth = startYear = endMonth = endYear = -1;
		positions = new ArrayList <Positions> ();
	}

	/**
	 * Set Company Name
	 * Sets the Company name to the passed String Variable
	 * @param s New Company Name
	 */
	public void setCompanyName(String s) {
		company = s;		
	}
	
	/**
	 * Get Company Name
	 * Returns the Company name
	 * @return Returns the Company name
	 */
	public String getCompanyName() {
		return company;
	}	
	
	/**
	 * Get Start Month
	 * @return Returns the first month that the user worked at this company
	 */
	public int getStartMonth() {
		return startMonth;
	}
	
	/**
	 * Get Start Year
	 * @return Returns the first year that the user worked at this company
	 */
	public int getStartYear() {
		return startYear;
	}	

	/**
	 * Get End Month
	 * @return Returns the end month that the user worked at this company
	 */
	public int getEndMonth() {
		return endMonth;
	}
	
	/**
	 * Get End Year
	 * @return Returns the last year that the user worked at this company
	 */
	public int getEndYear() {
		return endYear;
	}	
	
	/**
	 * Recalculate
	 * Checks through the work experience and sets the start month/year then the end month/year
	 */
	public void recalculate() {
		
	}
	
	/**
	 * Add Position
	 * Adds a Position to the Work ArrayList and then recalculates the start Month/Year and the end Month/Year
	 * @param pos The New Position
	 */
	public void addPosition(Positions pos) {
		// Add the new position to the Position Array
		positions.add(pos);
		// Setting the Start Month and Year
		if(startYear ==-1 || startMonth == -1) {
			startMonth = pos.getStartMonth();
			startYear = pos.getStartYear();
		}
		else if(pos.getStartYear()<startYear) {
			startMonth = pos.getStartMonth();
			startYear = pos.getStartYear();
		}
		else if(pos.getStartYear()==startYear && pos.getStartMonth()<startMonth) {
			startMonth = pos.getStartMonth();
			startYear = pos.getStartYear();
		}
		
		// Setting the End Month and Year
		if(endYear ==-1 || endMonth == -1) {
			endMonth = pos.getEndMonth();
			endYear = pos.getEndYear();
		}
		else if(pos.getEndYear()<endYear) {
			endMonth = pos.getEndMonth();
			endYear = pos.getEndYear();
		}
		else if(pos.getEndYear()==endYear && pos.getEndMonth()<endMonth) {
			endMonth = pos.getEndMonth();
			endYear = pos.getEndYear();
		}
	}
	
	/**
	 * Get Position
	 * Returns nth position in the Work ArrayList if null it returns null
	 * @param n The position of the wanted Work ArrayList
	 * @return The Positions object or a null
	 */
	public Positions getPosition(int n) {
		if(positions.size()>n && n>=0)
			return positions.get(n);
		else
			return null;
	}
	

	/**
	 * Get Position
	 * Returns the entire positions Array
	 * @return The Positions ArrayList
	 */
	public ArrayList <Positions>  getPosition() {
		return positions;
	}
	
	public String toString() {
		return company+" ("+city+","+state+").";		
	}
}

/**
 * Positions Class
 * Holds the detailed information on the Positions
 * @author Jason
 */
class Positions{
	private static String positionTitle;
	private static int startMonth,startYear,endMonth,endYear;
	private static ArrayList <String> description; // Description 
	
	public Positions() {
		positionTitle = null;
		startMonth = startYear = endMonth = endYear = -1;
		description = new ArrayList <String>();
	}
	
	/**
	 * Sets Position Title
	 * Sets the Position Title to the variable s
	 * @param s New Position Title
	 */
	public void setPositionTitle(String s) {
		positionTitle = s;
	}
	
	/**
	 * Get Position Title
	 * Returns the Position Title
	 * @return the String Position Title
	 */
	public String getPositionTitle() {
		return positionTitle;
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
	 * Add Description
	 * Adds the Passed String as a new Description
	 * @param s The newly added Description
	 */
	public void addDescription(String s) {
		description.add(s);
	}
	
	/**
	 * Get Description
	 * Returns a Description based on the n value
	 * @param n The specified education
	 * @return The nth Description or null
	 */
	public String getDescription(int n) {
		if(description.size()>n && n>=0)
			return description.get(n);
		else
			return null;
	}

	/**
	 * Get Description Size
	 * Returns the Size of the description ArrayList
	 * @return The Size of the description ArrayList
	 */
	public Integer getDescriptionSize() {
		return description.size();		
	}
	
	/**
	 * Get Description
	 * Returns the Entire Description Array
	 * @return description Returns the entire description Array
	 */
	public ArrayList<String> getDescription(){
		return description;		
	}
	
}