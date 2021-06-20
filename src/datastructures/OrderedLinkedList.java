/**
 * Purpose This is a LinkedList Program use to find the number. If the number is present then remove it otherwise add the number.
 * @author Rosy Rupali
 * @version 1.0
 * @since 16-06-2021
 */
package datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

import oopsutil.*;

public class OrderedLinkedList {

	/**
	 * This method reads the data from file and find a Integer in a file,if it
	 * is found than added to file else removed from file.
	 */
	private void orderedList() {
		try {
			boolean key = false;

			// get a file
			File file = new File("../AlgorithmPrograms/object/inputFile");
			BufferedReader buffer = new BufferedReader(new FileReader(file));

			String numbers = buffer.readLine();

			// write back to file
			FileWriter fileWriter = new FileWriter("../AlgorithmPrograms/object/inputFile");

			// splits number of file
			String[] string = numbers.split(" ");

			// Initialize a linked list
			LinkedList<String> linkedlist = new LinkedList<String>();

			// add Elements to linked list
			for (int i = 0; i < string.length; i++) {
				linkedlist.add(string[i]);
			}

			System.out.println(linkedlist.toString());

			System.out.println("Enter the number to search :");
			String find = OopsUtil.inputString();

			// If search number is same then remove it
			for (int i = 0; i < linkedlist.size(); i++) {
				if (linkedlist.get(i).equals(find)) {
					linkedlist.remove(string[i]);
					key = true;
					break;
				}
			}
			System.out.println(linkedlist.toString());

			// if new number add to String
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
	 
	public static void main(String[] args) throws IOException {
		OrderedLinkedList ol = new OrderedLinkedList();
		ol.orderedList();
	}

}
