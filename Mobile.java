package oopspractice;

import java.util.HashMap;

interface MobileProperties {
	public int batteryCapacity();
	public void colour(String colour);
	public String IEMICode();
}
public abstract class Mobile implements MobileProperties {
	private String SIMCard1,SIMCard2;
	public int batterymAh;
	public boolean isSingleSIM;
	private String phoneNumber;
	//Abstraction
	public void Dial(String number) {
		phoneNumber=number;
		System.out.println("Dialing "+phoneNumber);
	}
	public abstract boolean isSingleSIMCard();
	//Encapsulation
	public void setSIMCard1(String SIMCard) {
		this.SIMCard1=SIMCard;
		isSingleSIM=true;
	}
	public String getSIMCard1() {
		return SIMCard1;
	}
	public void setSIMCard2(String SIMCard2) {
		this.SIMCard2=SIMCard2;
		isSingleSIM=false;
	}
	public String getSIMCard2() {
		return SIMCard2;
	}
	//Polymorphism
	public void colour() {
		System.out.println("Mobile Colour: ");
	}
	public String IEMICode() {
		return (SIMCard1.toUpperCase().substring(1,SIMCard1.length()-1) + phoneNumber.substring(5));
	}
	public String IEMICode(String sim) {
		return (sim.toUpperCase().substring(1) + phoneNumber.substring(1));
	}
}