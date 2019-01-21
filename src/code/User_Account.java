package code;

import java.util.ArrayList;

class User_Account {
	private String firstName, middleName, lastName; // Names
	private String address, city, state, zip; // Address
	private ArrayList <String> phone, email, webLinks; // Various data 
	private ArrayList <Education> edu; // Education Experience
	private ArrayList <Work> work; // Work Experience
		
	/**
	 * Constructor
	 * Presets all of the data to the default settings
	 */
	public User_Account() {
		firstName=middleName=lastName = null;
		address=city=state=zip=null;
		phone=email=webLinks= new ArrayList <String>(); 
		edu = new ArrayList <Education>();
		work = new ArrayList <Work>();
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
	 * Get First Name
	 * Returns the User's First Name
	 * @return The First Name
	 */
	public String getFirstName() {
		return firstName;		
	}	
	
	 /**
	 *  Set Middle Name
	 * Sets the User's Middle Name to the Specified String s
	 * @param s New Middle Name
	 */
	public void setMiddleName(String s) {
		middleName = s;		
	}
	
	/**
	 * Get Middle Name
	 * Returns the User's Middle Name
	 * @return The Middle Name
	 */
	public String getMiddleName() {
		return middleName;		
	}	
	
	 /**
	 * Set Last Name
	 * Sets the User's Last Name to the Specified String s
	 * @param s New Last Name
	 */
	public void setLastName(String s) {
		lastName = s;		
	}
	
	/**
	 * Get Last Name
	 * Returns the User's Last Name
	 * @return The Last Name
	 */
	public String getLastName() {
		return lastName;		
	}	
	
	/**
	 * Set Address
	 * Sets the User's Address
	 * @param s
	 */
	public void setAddress(String s) {
		// Still deciding how to do the address to incorporate apartments
		address = s;		
	}
	
	/**
	 * Get Address
	 * Returns the User's Address
	 * @return The Address
	 */
	public String getAddress() {
		// Still deciding how to do the address to incorporate apartments
		return address;		
	}	

	/**
	 * Set City
	 * Sets the User's City
	 * @param s
	 */
	public void setCity(String s) {
		state = s;		
	}
	
	/**
	 * Get City
	 * Returns the User's City Address
	 * @return The City Address
	 */
	public String getCity() {
		return city;		
	}
	
	/**
	 * Set State
	 * Sets the User's State
	 * @param s
	 */
	public void setState(String s) {
		state = s;		
	}
	
	/**
	 * Get State
	 * Returns the User's State Address
	 * @return The State Address
	 */
	public String getState() {
		return state;		
	}	
	
	/**
	 * Set Zip
	 * Sets the User's Zip Code to the specified String variable
	 * @param s The Specified Zip Code
	 */
	public void setZip(String s) {
		zip = s;	
	}
	
	/**
	 * Get Zip
	 * Returns the user's Zip Code
	 * @return The Zip Code
	 */
	public String getZip() {
		return zip;
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
	 * Get Phone Type
	 * Returns the first instance of the specified Phone type or null
	 * @param s Specified Phone Type
	 * @return the 
	 */
	public String getPhoneType(String s) {
		// Needs to be further developed 
		return null;
	}

	/**
	 * Get Phone Number
	 * Returns the nth Phone Number
	 * @param n The position of the wanted Phone Number
	 * @return The specified Phone Number or null
	 */
	public String getPhoneNumber(int n) {
		if(phone.size()>n && n>=0)
			return phone.get(n);
		else
			return null;		
	}
	
	/**
	 * Get Phone Size
	 * Returns the Size of the Phone ArrayList
	 * @return size of the Phone ArrayList
	 */
	public Integer getPhoneSize() {
		return phone.size();		
	}
	
	/**
	 * Returns the entire Phone ArrayList
	 * @return The entire Phone ArrayList
	 */
	public ArrayList<String> getPhone(){
		return phone;		
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
	 * Add Education
	 * Add educations to the User's Education Array
	 * @param e
	 */
	public void addEducation(Education e) {
		edu.add(e);		
	}
	
	/**
	 * Get Education
	 * Returns a Education based on the n value
	 * @param n The specified education
	 * @return The nth Education or null
	 */
	public Education getEducation(int n) {
		if(edu.size()>n && n>=0)
			return edu.get(n);
		else
			return null;
	}
	
	/**
	 * Get Education Sized
	 * Returns the size of the Education Array
	 * @return The size of the Education Array
	 */
	public Integer getEducationSize(){
		return edu.size();		
	}
	
	/**
	 * Get Education
	 * Returns the entire Education Array
	 * @return The Entire Education Array
	 */
	public ArrayList<Education> getEducation(){
		return edu;		
	}	

	/**
	 * Add Work
	 * Add Work to the User's Work Array
	 * @param w
	 */
	public void addWork(Work w) {
		work.add(w);		
	}
	
	/**
	 * Get Work
	 * Returns Work based on the n value
	 * @param n The specified education
	 * @return The nth Work or null
	 */
	public Work getWork(int n) {
		if(work.size()>n && n>=0)
			return work.get(n);
		else
			return null;
	}
	
	/**
	 * Get Work Sized
	 * Returns the size of the Work Array
	 * @return The size of the Work Array
	 */
	public Integer getWorkSize(){
		return work.size();		
	}
	
	/**
	 * Get Work
	 * Returns the entire Work Array
	 * @return The Entire Work Array
	 */
	public ArrayList<Work> getWork(){
		return work;		
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

