/**Purpose: This program implements calender using Queue
 * @author Rosy Rupali
 * @since 16-06-2021
 * @version 1.0
 */
package datastructures;

import java.util.LinkedList;
import java.util.Queue;

import oopsutil.OopsUtil;

public class CalenderQueue {

	public static void main(String[] args) {
		System.out.println("Enter month to display Calender:");
		int month = OopsUtil.inputInt();

		System.out.println("Enter year to display Calender:");
		int year = OopsUtil.inputInt();


		// Initializing a queue
		Queue<String> queue = new LinkedList<String>();
		
		System.out.println("Months:" + queue);
		
		String[] months = { "", "January", "February", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December" };

		for (int i = 0; i < months.length; i++) {
			queue.add(months[i]);// add months to queue
		}
		
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 0; i < days.length; i++) {
			queue.add(Integer.toString(days[i]));
		}
		//System.out.println("Elements of queue" + queue);
		

		if (month == 2 && OopsUtil.leapYear(year)) {
			days[month] = 29;
		}
		//System.out.println(" " + months[month] + " " + year);
		System.out.println("Sun Mon Tue Wed Thr Fri Sat");
		
		//starting date
		int date = OopsUtil.dayOfWeek(month, 1, year);
		//System.out.println(""+date);
		
		for (int i = 0; i <= date*4-1; i++) {
			System.out.print(" ");
		}
		for (int i = 1; i <= days[month]; i++) {
			System.out.printf("%-3d ", i);
			if (((i + date) % 7 == 0) || (i == days[month]))
				System.out.println();
		}
	}
}
