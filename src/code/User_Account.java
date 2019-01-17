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
		System.out.println("Users Account Main");
	}
	
	/**
	 * Constructor
	 * Presets all of the data to the default settings
	 */
	public User_Account() {
		firstName=middleName=lastName = null;
		address1=address2=city=state=zip=null;
		phone=email=webLinks= new ArrayList <String>(); 
	}
	
	/**
	 * Set First Name
	 * Set the Users First Name
	 * @param s New First Name
	 */
	public void setFirstName(String s) {
		firstName = s;	
	}
	
	
	
	
	/* Add Phone Number
	 * This adds the String s to the ArrayList of Phone
	 * @param s The given Phone Number
	 */
	public void addPhoneNumber(String s){
		// Needs to be processed further with a Phone Class
		// In order to get different types (Mobile/Work...etc)
		phone.add(s);		
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
	 * Get Email
	 * Gets the Specified nth email address or returns null
	 * @param n The position of the wanted Email Address
	 * @return The specified email address or null 
	 */
	public String getEmail(int n) {
		if(email.size()>n && n>=0)
			return email.get(n);
		else
			return null;		
	}
	
	 /*
	 * Get Email Size
	 * Returns the Size of the email ArrayList
	 * @return The Size of the Email ArrayList
	 */
	public Integer getEmailSize() {
		return email.size();		
	}
	
	/**
	 * Get Email
	 * Returns the Entire Email Array
	 * @return email Returns the entire email Array
	 */
	public ArrayList<String> getEmail(){
		return email;		
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
	 * @param n The position of the wanted webLink
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
	 * Get Web Links
	 * Returns the Entire Web Link Array
	 * @return webLinks Returns the entire webLinks Array
	 */
	public ArrayList<String> getWebLink(){
		return webLinks;		
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

