package service;

import oopsutil.*;

public class Permutation {

	public static void main(String[] args) {
		new OopsUtil();
		String string = "abc";
		int length = string.length() - 1;
		OopsUtil.Permute(string, 0, length);

	}

}
