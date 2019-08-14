/******************************************************************************
 
 *  Purpose: logic to add two integers 
 *
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.utility;

import java.util.Arrays;

/**
 * @author user
 *
 */
public class Utility {
	
	/**
	 * @param firstNumber  take frist input from user
	 * @param secondNumber  take second input from user
	 * @return result       print sum of first and second integer
	 */
	public int SumOf2Numbers(int firstNumber ,int secondNumber) {
		int result = firstNumber+secondNumber;
		
		return result ;
	}
	
/****************************************************************************************************/
	
	 /**
     * @param a Take  input value a from user
     * @param b Take  input value b from user
     * @param c Take input value c from user
     * @return
     */
	public int OperationOne(int a , int b ,int c) {
		int Operation1 = (a+b*c);
		
		
		return Operation1 ;
	}
	/******************************************************************************

	    *  Purpose: to Check the given year is a leap year or not
	    /**
	    * @param year  take input from user to check the leap year
	    * @return      return weather the given year is a leap year or not
	    */
	   public boolean LeapyearChecker(int year) {
	   	 if(year%4==0 ||  year%400==0 && year%100 !=0) {
	   		 return true ;
	   	 }
	   	 
	   	 else {
	   		 return false;
	   	 }
	    }
	    
	    
	    /********************************************************************************************************

	    Purpose: to print on which day the particular date falls
	   
	    * @return  
	    */
	    
	    public boolean DaysWeek(int date , int month , boolean LeapyearChecker){
	    	
	    	switch(month){
	    		
	    		case 1 :
	    			if(date >=1 &&  date <=31) {
	    				return true;
	    			}
	    			else {
	    				return false;
	    			}
	    			
	    			   
	    			
			case 2 :
	    			if(LeapyearChecker)
	    			{
	    				if(date >= 1 && date <=29  ) 
	    				{
	    					return true ;
	    				}
	    				else {
	    					return false;
	    				}
	    			}
	    			else {
	    				
	    			if (date >= 1 && date <=28  ) {
						return true ;
					}
	    			else {
	    				return false;
	    			}
	    			}
	    			
	    			
	    			
	    			
	    		case 3 :
	    			  if(date >0 &&  date <=31) {
	    				return true;
	    			  }
	    			 else {
	    				return false;
	    			  }
	    			 
	    			
	    		case 4 :
	    			if(date >0 &&  date <=30) {
	    				return true;
	    			}
	    			else {
	    				return false;
	    			}
	    		
	    		
	    		case 5 :
	    			if(date >0 &&  date <=31) {
	    				return true;
	    			}
	    			else {
	    				return false;
	    			}
	    		
	    			
	    		case 6 :
	    			if(date >0 &&  date <=30) {
	    				return true;
	    			}
	    			else {
	    				return false;
	    			}
	    			
	    			
	    		case 7 :
	    			if(date >0 &&  date <=31) {
	    				return true;
	    			}
	    			else {
	    				return false;
	    			}
	    			
	    			
	    		case 8 :
	    			if(date >0 &&  date <=31) {
	    				return true;
	    			}
	    			else {
	    				return false;
	    			}
	    			
	    			
	    		case 9 :
	    			if(date >0 &&  date <=30) {
	    				return true;
	    			}
	    			else {
	    				return false;
	    			}
	    			
	    			
	    		case 10 :
	    			if(date >0 &&  date <=31) {
	    				return true;
	    			}
	    			else {
	    				return false;
	    			}
	    			
	    			
	    		case 11 :
	    			if(date >0 &&  date <=30) {
	    				return true;
	    			}
	    			else {
	    				return false;
	    			}
	    			
	    			
	    		case 12 :
	    			if(date >0 &&  date <=31) {
	    				return true;
	    			}
	    			else {
	    				return false;
	    			}
	    		
	    		}
	     return false;
	    }
	    
	    
	    /********************************************************************************************************

	    Purpose: to print on which day the particular date falls

	    * @return  
	    */
	        
	        public int DayValidate(int date , int month , int year) {
	        	
	        	int y1=year-(14-month)/12;
	        	int x= y1+(y1/4)-(y1/100)+(y1/400);
	        	int m1=month+12*((14-month)/12)-2;
	        	int d1=(int)(date+x+31*m1/12)%7;
	        	
	        	return d1;
	        	
	        	
	        }
	        /********************************************************************************************************

	        Purpose: to find The loan amount for a given period of time with given intrest
	       
	        * @return  Payement to be made per month 
	        */
	        
	        
	        public double Interest(double principal , double years , double rate ) {
	        	 double R = rate/(12*100);
	        	 double N =12*years ;
	        	 double Payment = (principal*R)/(1-Math.pow(1+R, -N));
	        	 
	        	 return  Payment ;
	        }
	        
	        /********************************************************************************************************

	        Purpose: to  print various trignometric function 
	       
	        * @return  return the value of given trignomertic function
	        */
	        
	        public String Trigonmetric(double angle) {
	        	double radian = Math.toRadians(angle);
	        	double sin = Math.sin(radian);
	        	double cos = Math.cos(radian);
	        	double tan =Math.tan(radian);
	        	double cosec=1/Math.sin(radian);
	        	double sec =1/Math.cos(radian);
	        	double cot = 1/Math.tan(radian);
	        	
	        	return "Sin :"+sin+ "\ncos :"+cos+"\ntan :"+tan+"\nCosec :"+cosec+"\nsec :"+sec+"\ncot :"+cot ; 
	        
	        	
	        }
	        
/****************************************************************************************************/
	 
	
	/**
     * @param a Take  input value a from user
     * @param b Take  input value b from user
     * @param c Take input value c from user
     * @return
     */
	
	public int OperationTwo(int a ,int b ,int c ) {
		
		int Operation2 =(a*b+c);
		
		
		return Operation2 ;
	}
	
/****************************************************************************************************/
	 
	/**
     * @param a Take  input value a from user
     * @param b Take  input value b from user
     * @param c Take input value c from user
     * @return
     */
	
    public int OperationThree(int a, int b ,int c ) {
		
		
		int Operation3 =(a%b+c);
		
		return Operation3 ;
	}
  /****************************************************************************************************/
    
    
    /**
     * @param a Take  input value a from user
     * @param b Take  input value b from user
     * @param c Take input value c from user
     * @return
     */
    public int OperationFour(int a, int b ,int c ) {
		
		
		int Operation4 =(a%b+c);
		
		return Operation4 ;
	}
    
/******************************************************************************
    
     *  Purpose: To take 3 values from user and perform set of opertions on them to
     *           understand there presedence
   
     * @param a Take  input value a from user
     * @param b Take  input value b from user
     * @param c Take input value c from user
     * @return
     */
    public double OperationOneDouble(double a , double b ,double c) {
		double Operation1 = (a+b*c);
		
		
		return Operation1 ;
	}
/**************************************************************************************************** 
 
     * @param a Take  input value a from user
     * @param b Take  input value b from user
     * @param c Take input value c from user
     * @return
     */
	
	public double OperationTwoDouble(double a ,double b ,double c ) {
		
		double Operation2 =(a*b+c);
		
		
		return Operation2 ;
	}
/****************************************************************************************************
	
	 
     * @param a Take  input value a from user
     * @param b Take  input value b from user
     * @param c Take input value c from user
     * @return
     */
	
    public double OperationThreeDouble(double a, double b ,double c ) {
		
		
		double Operation3 =(a%b+c);
		
		return Operation3 ;
	}
/****************************************************************************************************
    
    
     * @param a Take  input value a from user
     * @param b Take  input value b from user
     * @param c Take input value c from user
     * @return 
     */
    public double OperationFourDouble(double a, double b ,double c ) {
		
		
		double Operation4 =(a%b+c);
		
		return Operation4 ;
	}
    
/******************************************************************************

     *  Purpose: to Check the given year is a leap year or not
     /**
     * @param year  take input from user to check the leap year
     * @return      return weather the given year is a leap year or not
     */
    public String Leapyear(int year) {
    	 if(year%4==0 && year%100!=0) {
    		 return year + " is a leap year" ;
    	 }
    	 else if(year%4==0 && year%400==0) {
    		 return year + " is  a leap year" ;
    	 }
    	 else {
    		 return year + " is not a leap year";
    	 }
     }
     
   /******************************************************************************

      *  Purpose: to Check the date lies between March 20 to June 20 
 
     
     /**
     * @param month take input from user to check the range of month
     * @param date  take input from user to check the range of date
     * @return return the true if the value falls in the given range and return
     *          false if the value not falls in the given range 
     */
    public String SpringSeason(int month , int date ) {
    	 if((month==3 && date<=31 && date>=20) || (month==4 && date<=30) ||(month==5 && date<=31) || (month==6 && date<=20) ) {
    		 return "true" ;
    		 
    	 }
    	 else {
    		 return "False";
    	 }
     }
     

 /********************************************************************************
    Purpose: to find the root of the quadratic equation 

     * @param a taking value of a from user
     * @param b taking value of b from user
     * @param c taking value of c from user
     * @return
     */
    public String Quadratic(double a ,double b, double c ) {
    	 double delta = (b*b-(4*a*c));
    	 
    	 double root1= (-b+Math.sqrt(delta)/(2*a));
    	 double root2= (-b-Math.sqrt(delta)/(2*a));
    	 
    	 return "Root   is  : "+root1+ " and  "+ root2 ;
    	 
     }
    
    /******************************************************************************

     *  Purpose: to find the euclidean distance
     * @param x  to take the value of x from the user
     * @param y  to take the value of y from the user
     * @return   return the value of distance 
     */
    public Double Distance(double x , double y ) {
    	double distance = Math.sqrt(x*x+y*y);
    	
    	return  distance;
    }
    
/********************************************************************************************************

     Purpose: to print sum of two random integers between 1 and 6 
    
     * @return  return sum of two random number between 1 to 6
     */
    public int random() {
    	int side = 6;
    	int a = 1 + (int)(Math.random()*side);
    	int b = 1 + (int)(Math.random()*side);
    	int sum = a+b;
    	return sum;
    	
    }
    
/********************************************************************************************************

    Purpose: to find the windchill temperature in farenheit
   
    * @return  return wind chill temperature 
    */
    
    public String wind(double temperature , double  windspeed) {
    	
            double windchill =35.74 +0.6215*temperature +(0.4275*temperature - 35.75)*Math.pow(windspeed, 0.16);
    		return "the wind Chill in Fahrenheit is : "+windchill;
    	
    	
    }
 /********************************************************************************************************

    Purpose: to find the windchill temperature in farenheit
   
    * @return  return wind chill temperature 
    */
    public String tempconversion(double temperature ,int choice ) {
    	if(choice ==1) {
    		double CelsiustoFehranheit = (temperature*9/5)+32 ;
    		return "The Temperature Converted in Celsius to Fehranheit is  :"+CelsiustoFehranheit ;
    	}
    	else if (choice ==2) {
    		double FehranheitToCelsius =(temperature-32)*5/9 ;
    		return "The temperature Converted In Fehranheit to Celsius is :"+FehranheitToCelsius ;
    	}
		return null;
    
    	
    }
    
    /********************************************************************************************************

    Purpose: to find Min , Max And Average of random 5 Values
   
    * @return  return Min , Max and Average
    */
    
    public String Random(double value1 ,double value2 ,double value3 ,double value4 ,double value5) {
    	double RandomMin =Math.min(value1, Math.min(value2, Math.min(value3, Math.min(value4, value5))));
    	double RandomMax =Math.max(value1, Math.max(value2, Math.max(value3, Math.max(value4, value5))));
    	double RandomAverage=(value1+value2+value3+value4+value5)/5;
    	
    	return "Random Minimum is : "+RandomMin+" Random Max is : "+RandomMax+" Random average is : "+RandomAverage ;
    	
    }
    

/********************************************************************************************************

Purpose: to print percentage of head and tails 

* @return   percentage of head and tails 
*/
    
    public String Coin(int flip) {
    	int head = 0 ,tail =0 ;
        for(int i=0 ; i<flip ;i++) {
        	double flipping=Math.random();
        	
        	if(flipping<= 0.5) {
        		 System.out.println(" Heads ");
        		head++;
        	}
        	else {
        		System.out.println(" Tails");;
        		tail++;
        	}
        	
        }
        
        double averagehead = (int)head*100/flip;
       
		double averagetail = (int)tail*100/flip;
        
      return "Percentage of Head is "+averagehead+ " Percentage of tail is "+averagetail ;
    	
    }
    
    
    /********************************************************************************************************

    Purpose: to print the table of Power of 2
    */
    
    
    
    public void Power(int number) {
    	for(int i =0 ; i <= number ; i ++  ) {
    		
    		     int Table = (int)Math.pow(2, i);
    			  System.out.println("2 ^ "+i+" ="+Table); 
    			
    	}
    	
    	  }
    

    /********************************************************************************************************

    Purpose: to print the nth Harmonic number 
    */
    
    public void  Harmonic(int n ) {
    	double sum=0;
    	if(n>=1) {
    		for(int i = 1; i <= n ; i ++) {
    			double Hn = 1.0/i;
    			
    			sum+=Hn;
    			
    		}
    		
    		System.out.println("The  Hamrmonic Number is  :"+sum);
    	}
    	
    }
    
    /********************************************************************************************************

    Purpose: to print the square root of a number 
    */

	public double Square(int c) {
		double t ;
		t = c;
		double epsilon =1e-15;
		while(Math.abs(t - c/t )> epsilon*t) {
		  t=(c/t +t)/2.0;
			
		}
		return  t;
		
	}
	
	 /********************************************************************************************************

    Purpose: to print avg win , avgloose , avg bids and number of times own  for a gamling stimulator
    */
	
	public void gamling(int stake , int goal , int day) {
		int tempstake = stake;
		int win=0;
		int trails=0;
		double PerWin ,AvgBets;
		for(int i =0 ; i<day ;i++) {
		    while(tempstake>0 && tempstake<goal) {
		    	if(Math.random()<0.5) {
		    
		    		tempstake++;
		    		trails++;//win
		    		win++;
		    	}
		    	else {
		    		tempstake--;
		    		trails++;//lose
		    		
		    	}
		    	if(tempstake == goal) {
		    		win++;
		    	}
		    }
		   }
		
        PerWin=(100.0*win)/trails;
		
		AvgBets = 1.0*trails/day;
		
		System.out.println("The total no win is "+win+" Percentage win is : "+PerWin+" Average Bets Made Per day is : "+AvgBets ); 
		
		
		
	}
	/********************************************************************************************************

	   Purpose: to print the even number in a given range 
	   */
	   

	
	public void  Prime(int rangestart , int rangeend) {
		int temp=0;
		
		
		for(int i = rangestart ; i <= rangeend ; i ++) {
			for(int j =2 ;j<i;j++) {
				if(i%j==0) {
					temp=temp+1;
				}
			}
			if(temp==0) {
				System.out.println(i);
			}
			 
			temp=0;  
			}
			
		
	}
	
	/********************************************************************************************************

	   Purpose: to print the repeated number in an array
	   */
	   

	 public int ReaptedArray(int array[]) {
		 for(int i =0 ; i<array.length ; i++) {
			 for(int j=i+1;j<array.length;j++) {
				 if(array[i] == array[j]) {
					 return array[i];
				 }
			 }
		 }
		 return 1;
	 }
	 
	 /********************************************************************************************************

	   Purpose: to convert a decimal number into a binary number 
	   */
	 
	 public void decimaltobinary(int num) {
		 
		 int rem [] = new int [num];
		 
		 int index =0;
		 
		 while(num>0) {
			 rem[index]=num%2;
			 index++;
			 num=num/2;
		 }
		 
		/* while(rem.length <=8 ) {
			 rem[index] =0;
			 index++;
		 } */
		
		 for(int i=(index-1); i >=0 ; i--) {
			 
			 System.out.print(rem[i]);
			 
		 }
		
		 }
	 
	 public int swapnibble(int x) {
		 return (((x&0x0F)<<4)|((x&0xF0)>>4));
	 }
	 
	 
	 /********************************************************************************************************

	   Purpose: to print which number falls max time between 1 to 6
	   
	   */
	 
	 
	 public void diceroll(int num) {
        int value;
		int side =6;
		 int side1=0;
	     int side2=0;
	     int side3=0;
	     int side4=0;
	     int side5=0;
	     int side6=0;
		 for(int i =0 ; i <num ; i ++) {
	     
		    	
			value=1+(int)(Math.random()*side);
			System.out.println(value);
			if(value==0) {
			side1++;
		    }
			else if (value==1) {
				side2++;
				
			}
			else if(value==2) {
				side3++;
				}
			
			else if (value==3) {
				side4++;
			
			}
			
			else if(value==4) {
				side5++;
				
			}
			else if(value==5) {
				side6++;
				
				
			}
			 
			
		 }
		 
		 int arr[]= {side1,side2,side3,side4,side5,side6};
		 int max=Integer.MIN_VALUE;
		 int temp =0;
		 
		 for(int i=0;i<arr.length;i++) {
			 if(max<arr[i]) {
				 max=arr[i];
				 temp=i;
			 }
			 
		 }
		 
		 System.out.println("the number which has fall maximum time is  : "+temp);

		 
	 } 
	 /********************************************************************************************************

	   Purpose: to print factorial of a number
	   
	   */
	 public int Factorial(int n) {
		 int fact=1;
		 if(n==0) {
			
			 return 1;
			 
		 }
		 else {
			 return n*Factorial(n-1);
		 }
		 
	 }
	 
	 
	 
	 /********************************************************************************************************

	   Purpose: to perform sin taylor series
	   
	   */
	 
	 
	 
	 public void sintaylor(double angle) {
		 
		 double x = angle%(2*Math.PI);
		 int n ;
		 
		 System.out.println("sin "+angle+"  = "+x+" - "+(Math.pow(x,3))/Factorial(3)+" + "+(Math.pow(x, 5))/Factorial(5)+" - "
		                             +(Math.pow(x,7 ))/Factorial(7)+" +.....");
		 
		 
		 
		 
		 
		 
	 }
	 
	 
	 /********************************************************************************************************

	   Purpose: to perform cos taylor series
	   
	   */
	 
	 
	 
	 public void costaylor(double angle) {
		 
		 double x = angle%(2*Math.PI);
		 int n ;
		 
		 System.out.println("cos "+angle+"  = 1 - "+(Math.pow(x,2))/Factorial(2)+" + "+(Math.pow(x, 4))/Factorial(4)+" - "
		                             +(Math.pow(x,6 ))/Factorial(6)+" +.....");
		 
		 
		 
		  }
	 /********************************************************************************************************

	   Purpose: to prime checker
	   
	 * @param number check weather the given number is prime or not 
	 * @return
	 */
	public boolean primechecker(int number){
	   for(int i =2 ;i<number/2;i++) {
			if(number%i==0) {
				return false;
			}
			
			}
	   return true;
	   
	 }
		
	    
	 /********************************************************************************************************

	   Purpose: to compute factor of number using prime factorization
	   
	   */
	 
	 public void factorcompute(int number) {
		 
		 for(int i=2;i*i<=number ; i++ ) {
			 while(number%i==0) {
				 System.out.print(i + " "); 
	                number = number / i;
			 }
			
		 }
		 
		if (number > 1) System.out.println(number);
	        else       System.out.println();
	        
	       
	 }
	 
	 
	 /********************************************************************************************************

	   Purpose: to find the second largest number in an unsorted array
	   
	
	 * @param arr   take an unsorted array from the main class 
	 * @return
	 */
	public int secondlarge(int arr[]) {
		 int First =Integer.MIN_VALUE;
		 int Second=Integer.MIN_VALUE;
		 for(int i = 0 ; i<arr.length ; i ++) {
			 if(arr[i]>First) {
				 Second =First;
				 First =arr[i];
			 }
			 else if (arr[i]> Second && arr[i]!=First){
				 Second=First;
			 }
			 
			 
			 
		 }
		 
		 return Second;
		 
		  }
	 
	 
	 /********************************************************************************************************

	   Purpose: to find the second smallest number in an unsorted array
	   

	 * @param arr take an unsorted array from the main class
	 * @return
	 */
	public int secondsmallest(int arr[]) {
		 int First =Integer.MAX_VALUE;
		 int Second=Integer.MAX_VALUE;
		 for(int i = 0 ; i<arr.length ; i ++) {
			 if(arr[i]<First) {
				 Second =First;
				 First =arr[i];
			 }
			 else if (arr[i]< Second && arr[i]!=First){
				 Second=arr[i];
			 }
			 
			  }
		 
		 return Second;
		 
		 }
	 
	 /********************************************************************************************************

	   Purpose: to check weather the given string is anagram or not
	
	 * @param one  take the value of first string from user
	 * @param two  take the value of second string from user
	 * @return  boolean true if the strings are anagram else false
	 */
	public boolean Anagram(String one , String two ) {
		 
		 char arr1[]=one.toCharArray();
		 
		 char arr2[]=two.toCharArray();
		 
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		boolean result =Arrays.equals(arr1, arr2);
		return result;
		
	 }
	 
	 /********************************************************************************************************

	   Purpose: to check weather the given string is pallindrome  or not
	   
	   */
	 
	 
	 public boolean pallindrom(String pallindrome) {
		 String temppalin ="" ;
		 int length=pallindrome.length();
		 for(int i = length-1 ; i>=0;i--) {
			 temppalin=temppalin+ pallindrome.charAt(i);
			 }
		 
		 if(pallindrome.equals(temppalin)) {
			 return true;
		 }
		 else {
			 return false;
		 }
		 
		 
		 }
	 
	 
	 /********************************************************************************************************

	   Purpose: to print permutation of a string 
	   
	   */
	 
	  
	   
	
	}



