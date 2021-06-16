package service;

import oopsutil.OopsUtil;

public class AnagramDetection {

	public static void main(String[] args) {
		new OopsUtil();
		System.out.println("Enter String 1:");
		String str1 = OopsUtil.inputStringLine().toLowerCase().replaceAll("\\s", "");
		System.out.println("Enter String 2:");
		String str2 = OopsUtil.inputStringLine().toLowerCase().replaceAll("\\s", "");
		boolean status = OopsUtil.Anagram(str1, str2);
		OopsUtil.displayangaram(status);

	}

}
