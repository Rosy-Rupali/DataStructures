/***********************************************
 * Purpose : To store all logic of the programs
 *           
 * @author  Rosy Rupali
 * @version 1.0
 * @since   17-06-2021          
 ***********************************************/
package oopsutil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class OopsUtil {
	private static Scanner scanner = new Scanner(System.in);

	// To return String Input
	public static String inputString() {

		try {
			return scanner.next();
		} catch (Exception e) {
			scanner.nextLine();
			System.out.println("Invalid input, try again.");
			return inputString();
		}
	}

	// To return Integer input
	public static int inputInt() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			scanner.nextLine();
			System.out.println("Invalid input, try again.");
			return inputInt();
		}

	}

	// To return Double input
	public static double inputDouble() {
		try {
			return scanner.nextDouble();
		} catch (Exception e) {
			scanner.nextLine();
			System.out.println("Invalid input, try again.");
			return inputDouble();
		}

	}

	// To return String Input Line
	public static String inputStringLine() {

		try {
			return scanner.nextLine();
		} catch (Exception e) {
			scanner.nextLine();
			System.out.println("Invalid input, try again.");
			return inputStringLine();
		}
	}

	// To return Boolean input;
	public static boolean inputBoolean() {
		try {
			return scanner.nextBoolean();
		} catch (Exception e) {
			scanner.nextLine();
			System.out.println("Invalid input, try again.");
			return inputBoolean();
		}
	}

	/**
	 * This method perform the permutation of strings
	 * 
	 * @param string : first argument of the method
	 * @param i      : second argument of the method
	 * @param l      : third argument of the method
	 */
	public static void Permute(String string, int i, int l) {
		if (i == l) {
			System.out.println(string);
		} else {
			for (int j = i; j <= l; j++) {
				string = swap(string, i, j);
				Permute(string, i + 1, l); // recursive function
				string = swap(string, i, j);
			}
		}
	}

	/**
	 * This method perform the swapping of strings
	 * 
	 * @param string :first argument of the method
	 * @param i      : second argument of the method
	 * @param j      : third argument of the method
	 * @return the swapped strings
	 */
	public static String swap(String string, int i, int j) {
		char str[] = string.toCharArray();
		char temp = str[i];
		str[i] = str[j];
		str[j] = temp;
		string = String.valueOf(str);
		return string;
	}

	/**
	 * This method is to find out the word that it exist or not in the paragraph.txt
	 * 
	 * @param file : It read from the file which is paragraph.txt
	 */
	public static void findWord(FileReader file) {
		BufferedReader bf = new BufferedReader(file);
		String string;
		String[] array = null;
		try {
			while ((string = bf.readLine()) != null) {
				array = string.split(",");
			}
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Enter the word to search:");
		String search = OopsUtil.inputString();
		OopsUtil.BinarySearch(array, search);
	}

	/**
	 * This method search a element in sorted list using binary search Generic
	 * method to search integer as well as string
	 * 
	 * @param <T>    : it is a generic type
	 * @param array  : takes array element from user
	 * @param search : element which we want to search
	 */
	public static <T extends Comparable<T>> void BinarySearch(T[] array, T search) {
		int first = 0;
		int last = array.length - 1;
		int mid;

		while (first <= last) {
			mid = (first + last) / 2;
			if (array[mid].compareTo(search) < 0) {
				first = mid + 1;
			} else if (array[mid].compareTo(search) == 0) {
				System.out.println(search + " found in location " + mid);
				break;
			} else if (array[mid].compareTo(search) > 0) {
				last = mid - 1;
			}
		}
		if (first > last) {
			System.out.println(search + " Element Not found");
		}

	}

	/**
	 * This method defines the insertion sort
	 * 
	 * @param <T>   : it takes generic type data
	 * @param array : it takes the array element from user
	 */
	public static <T extends Comparable<T>> void insertionSort(T array[]) {
		int j;
		T temp;
		for (int i = 0; i < array.length; i++) {
			j = i;
			temp = array[i];
			while (j > 0 && temp.compareTo(array[j - 1]) < 0) {
				array[j] = array[j - 1];
				j = j - 1;
			}
			array[j] = temp;// insert unsorted element
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	/**
	 * This method find out that the two strings are equal in length and size or
	 * not.
	 * 
	 * @param str1 : first string argument of the method
	 * @param str2 : second string argument of the method
	 * @return : both the string are anagram or not
	 */
	public static boolean Anagram(String str1, String str2) {
		char[] string1 = str1.toCharArray();
		char[] string2 = str2.toCharArray();
		Arrays.sort(string1);
		Arrays.sort(string2);
		boolean isAnagram = false;
		isAnagram = Arrays.equals(string1, string2);
		if (isAnagram == true) {
			// pSystem.out.println(str1+" , "+str2+" are Anagram Strings");
			return isAnagram;
		} else
			// System.out.println(str1+" , "+str2+" are not Anagram Strings");
			return isAnagram;

	}

	/**
	 * This displays the status of anagram
	 * 
	 * @param status : first argument of the method
	 */
	public static void displayangaram(boolean status) {
		if (status) {
			System.out.println("Is Anagram");
		} else
			System.out.println("Is Not Anagram");
	}

	/**
	 * This method find the prime anagram
	 * 
	 * @param array : first argument of the method
	 * @return status that the elements are anagram or not
	 */
	public static boolean FindAnagram(int[] array) {
		boolean status = false;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				status = AnagramInteger(array[i], array[j]);

			}
		}
		return status;
	}

	/**
	 * This method checks that the two numbers are anagram or not.
	 * 
	 * @param n1 : first argument of the method
	 * @param n2 : second argument of the method
	 * @return the status that combination of numbers are same or not
	 */
	public static boolean AnagramInteger(int n1, int n2) {

		String number1 = String.valueOf(n1);
		String number2 = String.valueOf(n2);
		boolean status = Anagram(number1, number2);
		return status;
	}

	/**
	 * This method sorts list of elements using bubble sort
	 * 
	 * @param <T>   : generic type of data
	 * @param array : takes array input from user
	 */
	public static <T extends Comparable<T>> void bubbleSort(T array[]) {

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].compareTo(array[j]) > 0) {
					T temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	/**
	 * This method shows how divide and conquer rule is applied on array to perform
	 * sorting.
	 * 
	 * @param <T>   : : It is a generic type
	 * @param arr   : first argument which we take input of array from an user
	 * @param start : second argument of method which take first element of array as
	 *              starting point
	 * @param mid   : third argument which takes middle value first and last element
	 *              of array
	 * @param end   : fourth argument of method which take last element of array as
	 *              ending point.
	 */
	public static <T extends Comparable<T>> void mergeSort(T arr[], int low, int high) {
		while (low < high) {
			int mid = (low + high) / 2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid + 1, high);
			merge(arr, low, mid, high);
		}
	}

	/**
	 * This method merges two sub-arrays
	 * 
	 * @param <T>   : It is a generic type
	 * @param arr   : first argument which we take input of array from an user
	 * @param start : second argument of method which take first element of array as
	 *              starting point
	 * @param mid   : third argument which takes middle value first and last element
	 *              of array
	 * @param end   : fourth argument of method which take last element of array as
	 *              ending point
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> void merge(T arr[], int start, int mid, int end) {
		// stores the starting position of both parts in temporary variables.
		int p = start, q = mid + 1;
		Object[] arr1 = new Object[end - start + 1];
		int k = 0;
		for (int i = start; i <= end; i++) {
			// checks if first part comes to an end or not .
			if (p > mid) {
				arr1[k++] = arr[q++];
			}
			// checks if second part comes to an end or not
			else if (q > end) {
				arr1[k++] = arr[p++];
			}
			// checks which part has smaller element.
			else if (arr[p].compareTo(arr[q]) < 0) {
				arr1[k++] = arr[p++];
			} else {
				arr1[k++] = arr[q++];
			}
		}
		for (int l = 0; l < k; l++) {
			arr[start++] = (T) arr1[l];
		}
		System.out.println("After Sorting:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	/**
	 * This method read the data from a file
	 * 
	 */
	public static FileReader fileRead(String string) {

		FileReader f = null;
		try {
			f = new FileReader(string);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return f;
	}

	/**
	 * This method checks whether the number is prime or not
	 * 
	 * @param number : first argument from the user
	 * @return : the number is prime number or not
	 */
	public static boolean isPrime(int number) {

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * This method find out the prime numbers from to the given range
	 * 
	 * @param n : upto what range of value, user want the prime numbers
	 * @return prime numbers present in the given range
	 */
	public static int[] primeNumbers(int n) {
		int a[] = new int[n];
		int k = 0;
		for (int i = 0; i < 1000; i++) {
			if (isPrime(i)) {
				a[k] = i;
				k++;
			}
		}
		int len = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0)
				len++;
		}

		int[] newArray = new int[len];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				newArray[j] = a[i];
				j++;
			}
		}
		System.out.println();

		return newArray;

	}

	/**
	 * This method displays the array elements
	 * 
	 * @param array : input of array elements
	 */
	public static void display(int array[]) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	/**
	 * This method search the number by finding out the middle point and if our
	 * guessing number is less than mid then it fall in range of 0 to middle
	 * otherwise it will come in range of middle and highest range.
	 * 
	 * @param low  : first argument which we take from user
	 * @param high : second argument which we take from user
	 * @return : range of values in which the number falls
	 */
	public static int search(int low, int high) {
		if (low > high) {
			return -1;
		} else if (low == high) {
			return low;
		}
		int mid = (low + high) / 2;
		System.out.println("Is you number between " + low + " and " + mid);
		boolean b = OopsUtil.inputBoolean();
		if (b)
			return search(low, mid);
		else
			return search(mid, high);
	}

	/**
	 * This is method of regular expression
	 * 
	 * @param firstname : first argument takes from user
	 * @param lastname  : second argument takes from user
	 * @param mobile    : third argument which we take from user
	 */
	public static void regularExpression(String firstname, String lastname, String mobile) {
		String message = "Hello <<name>>, We have your full name as <<full name>> in our system.\n"
				+ "Your contact number is 91-XXXXXXXXXX. Please,let us know in case of any\n"
				+ "clarification.\nThank you BridgeLabz XX/XX/XXXX .";
		Date d = new Date();
		String date = new SimpleDateFormat().format(d);
		String name = firstname + " " + lastname;
		message = message.replace("<<name>>", firstname);
		message = message.replace("<<full name>>", name);
		message = message.replace("XXXXXXXXXX", mobile);
		message = message.replace("XX/XX/XXXX", date);
		System.out.println(message);
	}

	/**
	 * This method is to deposit cash
	 * 
	 * @param cash : it shows how much cash is available
	 */
	public static void deposit(int cash) {

		// Utility.getDetails();
		System.out.println("Available balance:" + cash);
		System.out.println("Enter amount to deposit");
		int amount = OopsUtil.inputInt();
		cash = cash + amount;
		System.out.println("Transaction sucessfull!!!");
		System.out.println("Available balance: " + cash);
	}

	/**
	 * This method is to withdraw amount from account
	 * 
	 * @param cash : it shows how much cash is available in bank
	 */
	public static void withdraw(int cash) {

		System.out.println("Available balance:" + cash);
		System.out.println("Enter amount to withdraw");
		int amount = OopsUtil.inputInt();
		if (amount <= cash) {
			cash = cash - amount;
			System.out.println("Transaction sucessfull!!!");
		} else
			System.out.println("Balance is less !!! \n Cannot do transaction");
		System.out.println("Available balance: " + cash);
	}

	/**
	 * This method checks whether the string entered is same after reversing also.
	 * 
	 * @param lowerString : takes user input of string and convert the whole string
	 *                    in lowercase
	 */
	public static void palindromeChecker(String lowerString) {
		// Initializing array Deque
		ArrayDeque<Character> arrayDeque = new ArrayDeque<Character>();

		for (int i = lowerString.length() - 1; i >= 0; i--) {
			// add method to add elements
			arrayDeque.add(lowerString.charAt(i));
		}

		String reverseString = "";

		// writtens false if deque contains no elements
		while (!arrayDeque.isEmpty()) {
			reverseString = reverseString + arrayDeque.remove();
		}
		if (lowerString.equals(reverseString))
			System.out.println("The input String is a palindrome.");
		else
			System.out.println("The input String is not a palindrome.");
	}

	/**
	 * This program is to find day of week
	 * 
	 * @param month
	 * @param day
	 * @param year
	 * @return
	 */
	public static int dayOfWeek(int month, int date, int year) {
		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = month + 12 * ((14 - month) / 12) - 2;
		int d0 = (date + x + 31 * m0 / 12) % 7;
		return d0;
	}

	/**
	 * This method find out the year is leap year ie, 366 days in a year
	 * 
	 * @param year taking the user input of year
	 * @return the year is leap year or not
	 */
	public static boolean leapYear(int year) {
		if (((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0)))) {
			return true;
		}
		return false;

	}
}