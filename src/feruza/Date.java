package feruza;

import java.time.LocalDate;

public class Date {

	
	//task:   today is october 5th, after 35 business days find out the date of the next business day?
	
  public static void main(String[] args) {

	  LocalDate d = LocalDate.now();     //todays date
	  System.out.println(d);       
	  d=d.plusDays(49);                  //adding 35 business days
	  
	  System.out.println(d);             //prints november 24th after i add 49 days
	  System.out.println(d.getDayOfWeek()); //prints SATURDAY , since saturday is not business day i add 2 days
	  d=d.plusDays(2);                   // adding 2 days
	  System.out.println(d);
	  System.out.println(d.getDayOfWeek());  //prints monday. november 26th 2018
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
//	  System.out.println(d.getDayOfWeek());
//	  System.out.println(d.getDayOfMonth());
//	  System.out.println(d.plusDays(49));
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  int dd = d.getDayOfMonth();
	  int mm = d.getMonthValue();
	  int yy = d.getYear();

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  //	  
//	  System.out.println(dd  + " " +   mm + " " + yy);
//	  System.out.printf("%d^%d^%d", dd,mm,yy);
//	  
	  
//	  LocalDate d1 = LocalDate.of(1974, 04, 30);
//	  System.out.println(d1.lengthOfYear());
//	  System.out.println(d1.lengthOfMonth());
//	  System.out.println(d1.isLeapYear());
//	  System.out.println(d1.minusWeeks(7));
//	  System.out.println(d1.minusDays(5));
//	  System.out.println(d.getDayOfWeek());



	  
	  
	  
	  
  }
}
