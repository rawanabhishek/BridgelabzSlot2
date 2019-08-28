package com.bridgelabz.utility;

import java.text.DateFormat;
import java.util.regex.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegularExpressionsUtility {
	
	/**
	 * Purpose: regex for changew the name and sound from a String 
	 * 
	 * @param name user input
	 * 
	 */

	public static void Lyric(String str, String Animal, String Sound) {
		// String tempStr="";
		// tempString=str.replaceAll(%ANIMAL%, Animal);
		String replaceString = str.replaceAll("%ANIMAL%", Animal);
		String replaceString2 = replaceString.replaceAll("%SOUND%", Sound);

		System.out.println(replaceString2);
	}
	/**
	 * Purpose: regex for to change the user name mobile number and date from the paragraph
	 * 
	 * @param name user input
	 * 
	 */

	public  static void paragraph(String str , String name , String fullname ) {
		DateFormat format =new SimpleDateFormat( "dd/MM/yyyy");
		Date date = new Date();
		String replaceString=str.replaceAll("<<name>>", name);
		
		String replaceString2=replaceString.replaceAll("<<full name>>", fullname);
		String replaceString3=replaceString2.replaceAll("91­xxxxxxxxxx", "9869353231");
		String replaceString4=replaceString3.replaceAll("01/01/2016",format.format(date));
		
		System.out.println(replaceString4);
	}
	
	
	/**
	 * Purpose: regex for no special charater in string
	 * 
	 * @param name user input
	 * @return if valid true else false
	 */
	public boolean isValidName(String name) {
		Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
		Matcher matcher = pattern.matcher(name);
		return matcher.matches();

	}

	/**
	 * Purpose: regex for email
	 * 
	 * @param email user input
	 * @return if valid true else false
	 */
	public boolean isValidEmail(String email) {

		Pattern pattern = Pattern.compile("^(.+)@(.+)$");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	/**
	 * Purpose: regex for international phone number
	 * 
	 * @param phone user input
	 * @return if valid true else false
	 */
	public boolean isValidMobile(String phone) {
	
		Pattern pattern = Pattern.compile("^\\+(?:[0-9] ?){6,14}[0-9]$");
		Matcher matcher = pattern.matcher(phone);
		return matcher.matches();
	}

	public boolean isValidUsername(String userid) {

		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$");
		Matcher matcher = pattern.matcher(userid);
		return matcher.matches();
	}

	public boolean isValidPassword(String password) {

		/*
		 * (?=.*[a-z]) : This matches the presence of at least one lowercase letter.
		 * (?=.*d) : This matches the presence of at least one digit i.e. 0-9.
		 * (?=.*[@#$%]) : This matches the presence of at least one special character.
		 * ((?=.*[A-Z]) : This matches the presence of at least one capital letter.
		 * {6,16} : This limits the length of password from minimum 6 letters to maximum
		 * 16 letters.
		 */
		Pattern pattern = Pattern.compile("((?=.*[a-z])(?=.*d)(?=.*[@#$%])(?=.*[A-Z]).{8,16}))");
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}

}
