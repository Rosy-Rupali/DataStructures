/**
 * Purpose This is a LinkedList Program use to find the word. If the word is present then remove it otherwise add the word.
 * @author Rosy Rupali
 * @version 1.0
 * @since 16-06-2021
 */
package datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;

import oopsutil.OopsUtil;

public class UnorderedList {

	/**
	 * This method read the file and then search for the word is present or not. If present then it remove the word otherwise add the word and displays it.
	 */
	private void unOrderedList() {
		try {
			boolean key = false;
			File file = new File("../AlgorithmPrograms/object/paragraph");
			BufferedReader buffer = new BufferedReader(new FileReader(file));

			String words = buffer.readLine();

			FileWriter fileWriter = new FileWriter("../AlgorithmPrograms/object/paragraph");
			String[] string = words.split(" ");
			LinkedList<String> linkedlist = new LinkedList<String>();

			for (int i = 0; i < string.length; i++) {
				linkedlist.add(string[i]);
			}

			System.out.println(linkedlist.toString());
			System.out.println("Enter the string to search :");
			String find = OopsUtil.inputString();

			for (int i = 0; i < linkedlist.size(); i++) {
				if (linkedlist.get(i).equals(find)) {
					linkedlist.remove(string[i]);
					key = true;
					break;
				}
			}
			System.out.println(linkedlist.toString());
			if (key == false) {

				linkedlist.add(find);
			}

			if (key == true) {
				for (int i = 0; i < linkedlist.size(); i++) {
					String string2 = (linkedlist.get(i)) + " ";
					fileWriter.write(string2);
					fileWriter.flush();
				}
			} else {
				for (int i = 0; i < linkedlist.size(); i++) {
					String string3 = linkedlist.get(i) + " ";
					fileWriter.write(string3);
					fileWriter.flush();
				}
			}
			System.out.println(linkedlist.toString());
			buffer.close();
			fileWriter.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		UnorderedList ul = new UnorderedList();
		ul.unOrderedList();

	}

}
