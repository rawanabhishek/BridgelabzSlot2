/******************************************************************************

     *  Purpose: to find the windchill temperature
     *
     *  @author  Abhishek Rawat
     *  @version 1.0
     *  @since   09-08-2019
*******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         Utility utility = new Utility();
         double temperature , windspeed ;
        System.out.println("Enter the temperature  : ");
        temperature = scanner.nextDouble();
        
        System.out.println("Enter the WindSpeed : ");
        windspeed = scanner.nextDouble();
        
        while((temperature>=50) || (windspeed >=120 || windspeed<3)) {
        	System.out.println();
			System.out.println("Enter Temperature less than 51 and wind speed between 3 to 120 ");
			 System.out.println();
			System.out.println("ReEnter the temperature  : ");
			 temperature=scanner.nextDouble();
			 System.out.println("ReEnter the temperature  : ");
			 windspeed =scanner.nextDouble();
		}
		
         
        
        System.out.println();
        System.out.println(utility.wind(temperature, windspeed));
        
        scanner.close();
	}

}
