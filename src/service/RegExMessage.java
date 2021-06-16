package service;
import oopsutil.*;

public class RegExMessage {

	public static void main(String[] args) {
		new OopsUtil();
		System.out.println("Enter Your Firstname:");
		String firstname=OopsUtil.inputString();
		System.out.println("Enter Your Lastname:");
		String lastname=OopsUtil.inputString();
		System.out.println("Enter Your Mobile Number:");
		String mobile=OopsUtil.inputString();
		OopsUtil.regularExpression(firstname,lastname,mobile);

	}

}
