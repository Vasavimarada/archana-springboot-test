package com.javabycode.springboot;

public class CustomerDetailsImpl {

	public Customer printCustomer(int id, String name, String ssn) {
		
		Customer c=new Customer();
		c.setId(id);
		c.setName(name);
		c.setSsn(ssn);
		
		return c;
	}
	public Billing printBilling(String name,int Cardnumber, int cvv) {
		Billing b = new Billing();
		b.setName(name);
		b.setCardnumber(Cardnumber);
		b.setCvv(cvv);
		return b;
	}
	

}
