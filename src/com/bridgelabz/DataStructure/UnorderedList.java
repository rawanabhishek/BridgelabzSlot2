package com.bridgelabz.DataStructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.utility.LinkedListUtility;
import com.bridgelabz.utility.LinkedListUtility.Node;

public class UnorderedList {

	public static void main(String[] args) throws IOException {

		LinkedListUtility utility = new LinkedListUtility();

		Scanner scanner = new Scanner(System.in);
		// Reading the string from the file
		BufferedReader br = new BufferedReader(new FileReader(
				"/home/admin1/git/BridgelabzSlot2/" + "src/com/bridgelabz/TextFiles/unorderedlistinput"));

		String str = "";
		try {

			str = str + br.readLine();

		} catch (IOException e) {

			e.printStackTrace();
		}

		String[] strArray = str.split(",");

		for (int i = 0; i < strArray.length; i++) {
			utility.insert(strArray[i]);

		}

		utility.show();
		System.out.println();
		System.out.println("Enter a name you want to search : ");
		String name = scanner.next();

		for (int i = 0; i < strArray.length; i++) {
			if (name.equals(strArray[i])) {
				utility.deleteAt(i);
			} else {
				utility.inserAtstart(name);
				break;
			}
		}
        System.out.println();
		utility.show();

		
	}
	
	}

