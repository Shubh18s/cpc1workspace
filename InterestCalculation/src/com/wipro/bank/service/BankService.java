package com.wipro.bank.service;

import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.BankValidationException;

public class BankService {
	public String validateData(float principal, int tenure,int age, String gender)
	{
		String status="Passed";
		if(principal==0||tenure==0||age==0||gender.equals(null)){
			try{
				throw new BankValidationException();
			}catch(BankValidationException ex){
				status="Invalid Data";
				System.out.println(ex);
			}
		}
		
		if(principal<500){
			try{
				throw new BankValidationException();
			}catch(BankValidationException ex){
				status="Invalid Principal";
				System.out.println(ex);
			}
		}
		if(tenure==5||tenure==10){
		
		}else{
			try{
				throw new BankValidationException();
			}catch(Exception ex){
				status="Invalid Tenure";
				System.out.println(ex);

			}
		}
		
		if(gender.equalsIgnoreCase("Male")||gender.equalsIgnoreCase("Female")){
			
		}else{
			try{
				throw new BankValidationException();
			}catch(Exception ex){
				status="Invalid Gender";
				System.out.println(ex);

			}
		}

		if(age>100||age<1){
			try{
				throw new BankValidationException();
			}catch(Exception ex){
				status="Invalid Age";
				System.out.println(ex);

			}
		}
		return status;
	}

	public void calculate(float principal, int tenure, int age, String gender)
	{
		if(validateData(principal, tenure, age, gender).equals("Passed")){
			RDAccount rd=new RDAccount(tenure, principal);
			rd.setInterest(age, gender);
			float rds=rd.calculateInterest();
			System.out.println(rds);
			float rdx=rd.calculateAmountDeposited();
			System.out.println(rdx);
			System.out.println(rd.calculateMaturityAmount(rdx, rds));
		}
	}
}
