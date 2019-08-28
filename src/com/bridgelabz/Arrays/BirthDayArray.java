package com.bridgelabz.Arrays;

import java.util.Arrays;

public class BirthDayArray {

	public static void main(String[] args) {

		int n = 10;
		int month[] = new int[n];
		int year[] = new int[n];
		int date[] = new int[n];

		String individual[] = new String[n];
		for (int i = 0; i < n; i++) {
			int MonthValue = (int) (Math.random() * 12) + 1;
			int YearValue = (int) (Math.random() * 2) + 92;
			int DateValue = (int) (Math.random() * 31) + 1;

			month[i] = MonthValue;
			year[i] = YearValue;
			date[i] = DateValue;

			individual[i]= MonthValue+" / "+DateValue+" / "+YearValue;

		}
		//Arrays.sort(individual);
		//Arrays.sort(month);
		for (int i = 0; i < n; i++) {
			System.out.println(individual[i]);
		}
		System.out.println();
	
		for (int i = 0; i < n; i++) {
			System.out.println(month[i]);
		}
		
		int count1=0;
		for(int i=0 ;i<n-1;i++) {
			int k = 0;
			int count=0;
			for(int j=i+1;j<n;j++) {
				if(month[i]==month[j] ) {
					
					if(count==0  ) {
						// count1++;
						count++;
						System.out.print(individual[i]+ " and "+individual[j]);	
					}
//					else if(count==0 ) {
//						// count1++;
//						count++;
//						System.out.print(individual[i]+ " and "+individual[j]);	
//					}
					else {
						System.out.print(" and "+individual[j]);
						break;
					}
					
				}
				
				
			}
			if(count>0) {
				System.out.println(" have same month");
			}
			
		}

	}
}
