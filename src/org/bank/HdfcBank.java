package org.bank;

public class HdfcBank implements WorldBank,RbiBank {

	@Override
	public void deposit() {
		System.out.println("deposit : 15%");
	}

	@Override
	public void savings() {
		System.out.println("savings : 12%");
	}

	@Override
	public void loan() {
		System.out.println("loan : 10%");
	}
private void fixed() {
	System.out.println("fixed : 8%");
}
public static void main(String[] args) {
	HdfcBank h = new HdfcBank();
	h.deposit();
	h.savings();
	h.loan();
	h.fixed();
	WorldBank w = new HdfcBank();
	w.savings();
	w.loan();
	RbiBank r = new HdfcBank();
	r.deposit();
}	
}
