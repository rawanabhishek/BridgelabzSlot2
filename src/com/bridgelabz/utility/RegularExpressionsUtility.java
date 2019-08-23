package com.bridgelabz.utility;

public class RegularExpressionsUtility {
 
	public static void Lyric(String str ,String Animal , String Sound) {
		//String tempStr="";
		//tempString=str.replaceAll(%ANIMAL%, Animal);
		String replaceString=str.replaceAll("%ANIMAL%", Animal);
		String replaceString2=replaceString.replaceAll("%SOUND%", Sound);
		
		System.out.println(replaceString2);
	}
	
}
