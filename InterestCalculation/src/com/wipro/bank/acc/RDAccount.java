package com.wipro.bank.acc;

public class RDAccount extends Account {
	public RDAccount(int tenure, float principal) {
		this.tenure = tenure;
		this.principal = principal;
	}
	
	public float calculateAmountDeposited() {
		return principal*tenure*12;
	}

	public float calculateInterest() {
		float result=0;
		for(int i=1;i<=tenure*12;i++){
			float t=(float)i/12;
			int n=4;
			result+=principal*(float)(Math.pow((1+rateOfInterest/400),n*t)-1);
		}
		return result;
	}

	public float calculateMaturityAmount(float totalPrincipalDeposited,float maturityInterest){
		return totalPrincipalDeposited+maturityInterest;
	}
}
