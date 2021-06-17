/**
 * Purpose : SIMULATE BANKING CASH COUNTER
 * @author Rosy Rupali
 * @version 1.0
 * @since 16-06-2021
 */
package datastructures;

import java.util.LinkedList;
import java.util.Queue;

import oopsutil.OopsUtil;

public class BankCounter {

	final static int CASH = 25000;

	public static void main(String[] args) {

		System.out.println("\n" + " ***Simulate Banking Cash Counter***" + "\n");
		System.out.println("Enter the number of people in a queue:");
		int numberOfPeople = OopsUtil.inputInt();
		peopleQueue(numberOfPeople);
		System.out.println("Available balance in bank :" + CASH);
	}

	/**
	 * This method add the person in queue and after the work done they remove the
	 * respective person from the queue. In this method they provide choice to
	 * withdraw and deposit cash.
	 * 
	 * @param numberOfPeople: It takes input from user that how many people are
	 *                        present in queue
	 */
	private static void peopleQueue(int numberOfPeople) {
		Queue<Integer> queue = new LinkedList<>();
		int choice;
		int i = 0, j = 1;

		while (i < numberOfPeople) {
			queue.add(i);
			// System.out.println("Elements of queue-"+queue);
			i++;
		}
		while (j < numberOfPeople) {
			System.out.println(" Person " + (j) + " \n 1.Deposit Cash \n 2.Withdraw Cash");

			choice = OopsUtil.inputInt();
			if (choice == 1) {
				queue.remove();
				// System.out.println("removed element" + choice);
				OopsUtil.deposit(CASH);

			} else if (choice == 2) {
				queue.remove();
				OopsUtil.withdraw(CASH);
			}
			j++;
		}
	}
}
