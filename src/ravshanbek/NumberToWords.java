package ravshanbek;

import java.util.Scanner;

public class NumberToWords {

  public static void main(String[] args) {
	  
	            
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter a number between 0 to 1000: ");
	  int num = scan.nextInt();
	 
	 while(num < 0)
     {
         System.out.println("Number should be greater than zero!");
         System.out.println("Please enter a number between 0 to 1000: ");
         num = scan.nextInt();  
     }
	  String ones []  = {
			  "",
			  "one",
			  "two",
			  "three",
			  "four",
			  "five",
			  "six",
			  "seven",
			  "eight",
			  "nine" } ;
	  
	  String teens []  = {
			  "eleven",
			  "twelve",
			  "thirteen",
			  "fourteen",
			  "fifteen",
			  "sixteen",
			  "seventeen",
			  "eighteen",
			  "nineteen" } ;
	  
	  String tens []  = {
			  "ten",
			  "twenty",   //20,30,40,50,60,70,80,90
			  "thirty",
			  "fourty",
			  "fifty",
			  "sixty",
			  "seventy",
			  "eighty",
			  "ninety" } ;
	  
	  String hundreds []  = {
			  "one hundred", //100,200,300,400
			  "two hundred",
			  "three hundred",
			  "four hundred",
			  "five hundred",
			  "six hundred",
			  "seven hundred",
			  "eight hundred",
			  "nine hundred" } ;
	  
	  String thousand = "thousand";
	  String zero = "zero";
	  
	  //converting single digit numbers
    		if(num>-1 && num<10 )	 {
			int temp= num % 10;    
			System.out.println(ones[temp]); 
				
		}
		
		else   //converting teen numbers
			if(num>10 && num<20) {  //starting from 11 to 19--> teen numbers
				
				int temp = (num%10)-1; // 12%10 is 2-1 , 13%10=3-1
				System.out.println(teens[ temp  ] ); 
			}else 
				if(num>19 && num<100) {   //20 to 99
					int ten = (num/10)-1; //20/10=2; 30/10=3
					int single = (num%10);//21%10=1
					
					System.out.println(tens[ten] + " " + ones[single]); 
					
	  
			}} 
	  
	  }
	  
	
	  
	  
	  
  

