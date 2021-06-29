package date;

import java.time.LocalDate;
import java.time.Period;

/**
 * Never happens on line 16 because is not set for any variable.
 */
public class Date01 {

	public static void main(String[] args) {

		LocalDate today = LocalDate.parse("2016-01-26");
		Period days = Period.ofDays(7);
		today.plus(days);
		System.out.println(today);

	}

}
