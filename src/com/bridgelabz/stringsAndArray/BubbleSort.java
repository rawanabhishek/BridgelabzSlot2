/******************************************************************************
 
 *  Purpose:  to perform bubble sort on the given string
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   20-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.stringsAndArray;

public class BubbleSort {

	public static void main(String[] args) {

		int a []= {2,3,4,1,6,9,7,8};
		int temp;
		for(int i =0;i<a.length;i++) {
			int flag =0;
			for(int j=0 ;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
					
				}
			}
			if(flag==0) {
				break;
			}
		}
		for(int i =0 ;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
		}

}
