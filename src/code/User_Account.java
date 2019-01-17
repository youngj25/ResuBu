package code;

import java.util.ArrayList;

public class User_Account {
	private static String firstName, middleName, lastName; // Names
	private static String address1, address2, city, state, zip; // Address
	private static ArrayList <String> phone, email, webLinks; // Various data 
	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		firstName=middleName=lastName = null;
		address1=address2=city=state=zip=null;
		phone=email=webLinks=null;
	}
	
	/**
	 * Set First Name
	 * Set the Users First Name
	 * @param s New First Name
	 */
	public void setFirstName(String s) {
		firstName = s;	
	}
	
	
	
	
	/**
	 * Add Email
	 * This adds the String s to the ArrayList of Emails
	 * @param s The given Email Address
	 */
	public void addEmail(String s){
		email.add(s);		
	}
	
	
	/**
	 * Add Web Link
	 * Add a String Variable to the list of Weblinks
	 * @param s
	 */
	public void addWebLink(String s) {
		webLinks.add(s);
	}
	
	/**
	 * Get Web Link
	 * A request is made for a return of WebLink n,
	 * and if the Weblink doesn't exist return null;
	 * @param n
	 * @return Weblink String or null
	 */
	public String getWebLink(int n) {
		if(webLinks.size()>n && n>=0)
			return webLinks.get(n);
		else
			return null;
	}
	
	/**
	 * Get Web Link Size
	 * Returns the Size of the webLink ArrayList
	 * @return The Size of the WebLink ArrayList
	 */
	public Integer getWebLinkSize() {
		return webLinks.size();		
	}
	
	/**
	 * to String
	 * Return this String when the user object is printed
	 * @return The user object data
	 */
	public String toString() {
		return firstName;
	}
}
