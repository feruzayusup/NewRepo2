package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {

	public static void main(String[] args) {

		
		LocalDateTime rightNow = LocalDateTime.now();  //prints time right now
		
		DateTimeFormatter second = DateTimeFormatter.ofPattern("sec");
		DateTimeFormatter minute = DateTimeFormatter.ofPattern("mm");//jvm ga aytyappan minutni ajrat deb
		DateTimeFormatter hour = DateTimeFormatter.ofPattern("hh");// soatni ajratyappan
		DateTimeFormatter day = DateTimeFormatter.ofPattern("dd");
		DateTimeFormatter month = DateTimeFormatter.ofPattern("MM");
		DateTimeFormatter year = DateTimeFormatter.ofPattern("YYYY");

		
		Integer minute1 = Integer.valueOf(minute.format(rightNow));//show just the minute now//integer qilib sohranit qildim
		
		Integer hour1 = Integer.valueOf(hour.format(rightNow));//show just the minute now

		Integer second1 = Integer.valueOf(second.format(rightNow));
		
		Integer day1 = Integer.valueOf(day.format(rightNow));
		Integer month1 = Integer.valueOf(month.format(rightNow));
		Integer year1 = Integer.valueOf(year.format(rightNow));


		
		
		System.out.println(rightNow);
		
		System.out.println("Bu yil " + year1 + " chi yil");

		System.out.println("Bu oy " + month1 + " oy");

		System.out.println("Bugun kunga " + day1 + " chi chislo boldi");

		System.out.println("Hozir soat " + hour1 + " boldi");
		
		System.out.println("Hozir soat " + hour1 + " dan " + minute1 + " minut otdi");

		System.out.println("Hozir soat " + hour1 + " dan " + minute1 + " minut otdi " + second1 + " sekund");

	}

}
