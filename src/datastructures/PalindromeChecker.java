/**Purpose: This program takes a input string from user,
 * and use a deque to store the characters of the string. 
 * We will process the string from left to right and add 
 * each character to the rear of the deque
 * @author Rosy Rupali
 * @since 16-06-2021
 * @version 1.0
 */
package datastructures;

import oopsutil.OopsUtil;

public class PalindromeChecker {

	public static void main(String[] args) {

		System.out.println("Enter the String:");
		String string = OopsUtil.inputString();
		String lowerString = string.toLowerCase();
		OopsUtil.palindromeChecker(lowerString);

	}

}

