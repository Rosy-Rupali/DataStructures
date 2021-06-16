package service;

import oopsutil.OopsUtil;

public class PrimeNumbers {

	public static void main(String[] args) {
		new OopsUtil();
		System.out.println("Enter the nth term:");
		int n=OopsUtil.inputInt();
		int out[]=new int[1000];
		out=OopsUtil.primeNumbers(n);
		OopsUtil.display(out);

	}

}
