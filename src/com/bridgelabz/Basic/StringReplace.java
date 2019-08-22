package com.bridgelabz.Basic;

import java.util.Scanner;

public class StringReplace {

	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String str=("Hello <<UserName>>, How are You ?");
       System.out.println("Enter your name : ");
       String name=scanner.nextLine();
       String RecString="";
       if(str.length()>3) {
    	   RecString =str.replace("<<UserName>>", name);
    	   
       }
       
       System.out.println(RecString);
	}

}
