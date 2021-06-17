/**
 * Purpose This program checks the prime anagram between 0 to 1000.
 * @author Rosy Rupali
 * @version 1.0
 * @since 16-06-2021
 */
package service;

import java.util.ArrayList;
import java.util.List;

import oopsutil.OopsUtil;

public class PrimeAnagram {

	public static void main(String[] args) {
		// Initialize a arraylist
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> listanagram = new ArrayList<Integer>();

		// loop to check prime between 0-1000
		for (int i = 0; i < 1000; i++) {
			if (OopsUtil.isPrime(i)) {
				list.add(i);
			}
		}
		System.out.println("prime numbers are:" + list);

		// another loop to store primes
		for (int j = 0; j < list.size() - 1; j++) {
			// another loop to store prime and compare
			for (int k = j + 1; k < list.size() - 1; k++) {

				if (OopsUtil.AnagramInteger(list.get(j), list.get(k))) {
					listanagram.add(list.get(j));
					
				}
			}
		}
		System.out.println("\nAnagram numbers are :" + listanagram);

	}

}
