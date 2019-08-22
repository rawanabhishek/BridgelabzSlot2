package com.bridgelabz.Basic;

public class StringWordReverse {
	public static void main(String[] args) {
		String str="kabhi kabhi apun ko lagta hai apun he bahgwan hai";
		String reverseString="";
		String [] words=str.split(" ");
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String reverseWord="";
			for(int j=word.length()-1;j>=0;j--) {
				reverseWord=reverseWord+word.charAt(j);
			}
			reverseString=reverseString+reverseWord+" ";
		}
		System.out.println(reverseString);

	}
}
