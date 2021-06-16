package service;
import oopsutil.*;
public class FindNumber {

	public static void main(String[] args) {
		new OopsUtil();
		System.out.println("Enter the Nth value:");
		int n=OopsUtil.inputInt();
		int limit=(int) (Math.pow(2, n-1));
		System.out.println("Think of a number between 0-"+(limit));
		int value=OopsUtil.search(0,limit);
		if(value != -1)
		{
			System.out.println(n);
		}
		else
		{
			System.out.println("invalid");
		}

	}

}
