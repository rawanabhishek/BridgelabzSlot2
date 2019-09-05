package com.bridgelabz.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.utility.LinkedListUtility;
import com.bridgelabz.utility.LinkedListUtilityInt;

public class OrderedList {

	public static void main(String[] args) throws IOException {

		LinkedListUtilityInt utility = new LinkedListUtilityInt();

		Scanner scanner = new Scanner(System.in);
		// Reading the string from the file
		BufferedReader br = new BufferedReader(
				new FileReader("/home/admin1/git/BridgelabzSlot2/" + "src/com/bridgelabz/TextFiles/orderedlistinput"));

		String str = "";
		try {

			str = str + br.readLine();

			br.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

		String[] strArray = str.split(",");
		int arr[] = new int[strArray.length];

		for (int i = 0; i < strArray.length; i++) {
			arr[i] = Integer.parseInt(strArray[i]);

		}

		Arrays.sort(arr);
		for (int i = 0; i < strArray.length; i++) {
			utility.insert(arr[i]);

		}

		utility.show();
		System.out.println();
		System.out.println("Enter a number you want to search : ");
		int num = scanner.nextInt();

		for (int i = 0; i < strArray.length; i++) {

			if (num == arr[i]) {
				utility.deleteAt(i);

				break;
			}
			else if(arr[i]>num) {
				utility.insertAt(i, num);
				break;
			}
			else if(num>arr.length) {
				utility.insert(num);
				break;
			}
		}
		
		
		utility.SaveToFile();
		
		String strWrite=LinkedListUtilityInt.Write;
		//writing to the output file 
		try {
			File file=new File("/home/admin1/git/BridgelabzSlot2/src/com/bridgelabz/TextFiles/orderedlistoutput");
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(strWrite);
			bufferedWriter.close();
			System.out.println();
			System.out.println("Write successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
