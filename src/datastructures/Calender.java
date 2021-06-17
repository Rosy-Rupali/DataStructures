/**Purpose:This program takes the month and year as command-line
 * arguments and prints the Calendar of the month.
 * @author Rosy Rupali
 * @since 16-06-2021
 * @version 1.0
 */
package datastructures;

import oopsutil.OopsUtil;

public class Calender {

	public static void main(String[] args) {
		System.out.println("Enter month to display Calender:");
		int month = OopsUtil.inputInt();

		System.out.println("Enter year to display Calender:");
		int year = OopsUtil.inputInt();

		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		// days[i] = number of days in month i
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// check for leap year
		if (month == 2 && OopsUtil.leapYear(year)) {
			days[month] = 29;
		}
		// printing the calender header
		System.out.println("   " + "%java Calender%");
		System.out.println("   " + months[month] + " " + year);
		System.out.println(" S  M Tu  W Th  F  S");

		// starting day
		int date = OopsUtil.dayOfWeek(month, 1, year);
		// print the calender
		for (int i = 0; i < date; i++) {
			System.out.print("   ");
		}
		for (int i = 1; i <= days[month]; i++) {
			System.out.printf("%2d ", i);
			if (((i + date) % 7 == 0) || (i == days[month]))
				System.out.println();
		}
	}
}
