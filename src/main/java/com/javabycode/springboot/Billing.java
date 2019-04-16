package com.javabycode.springboot;

public class Billing{
	public String name;
	public int Cardnumber;
	public int cvv;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCardnumber() {
		return Cardnumber;
	}
	public void setCardnumber(int Cardnumber) {
		this.Cardnumber= Cardnumber;
	}
	
	public int getcvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv=cvv;
	}
}