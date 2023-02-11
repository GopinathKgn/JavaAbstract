package org.india;
//child
public  class SouthIndians extends Indians{

	@Override
	void breakFast() {
		System.out.println("Idly, Dosa");
	}
	private void dressings() {
		System.out.println("dotheis, Saree");
	}
public static void main(String[] args) {
	SouthIndians s = new SouthIndians();
	s.breakFast();
	s.dressings();
	s.adharCard();
	s.panCard();
	s.voterId();	
}	
}
