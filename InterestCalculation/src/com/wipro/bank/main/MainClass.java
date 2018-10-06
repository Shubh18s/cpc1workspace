package com.wipro.bank.main;


import com.wipro.bank.service.BankService;
public class MainClass {
	public static void main(String a[]) {
		int tenure = 2;
        float principal = 1000;

        int age = 23;

        String gender = "Male";

        BankService b=new BankService();

        b.calculate(principal, tenure, age, gender);
	}

}
