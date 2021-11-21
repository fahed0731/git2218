package org.bank;

public class BankInfo extends AxisBank {

	public void savings() {
		System.out.println("This is saving Account");
	}
	public void fixed() {
		System.out.println("This is fixed Account");
	}
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
//		super.deposit();
		System.out.println("This is Deposit Account");
		
	}		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankInfo bank=new BankInfo();
		bank.savings();
		bank.fixed();
		bank.deposit();
	}

}
