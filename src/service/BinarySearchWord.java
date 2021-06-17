/**
 * Purpose This program read the file and take word as input and search whether the word is present or not. 
 * @author Rosy Rupali
 * @version 1.0
 * @since 16-06-2021
 */
package service;
import java.io.FileReader;

import oopsutil.OopsUtil;

public class BinarySearchWord {

	public static void main(String[] args) {
	
		new OopsUtil();
		FileReader file = OopsUtil.fileRead("../AlgorithmPrograms/object/paragraph");
		OopsUtil.findWord(file);
	}

}
