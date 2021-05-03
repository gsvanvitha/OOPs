package oopspractice;

public class Main {

	public static void main(String[] args) {
		OnePlus onePlus=new OnePlus();
		System.out.println(String.valueOf(onePlus.getClass()).toUpperCase().substring(19));
		onePlus.batteryCapacity(4800);
		onePlus.Dial("6789123456");
		onePlus.colour();
		onePlus.colour("Midnight Black");
		onePlus.setSIMCard1("Airtel");
		System.out.println("SIM: "+onePlus.getSIMCard1());
		System.out.println("Only one sim? "+onePlus.isSingleSIMCard());
		onePlus.setSIMCard2("Jio");
		System.out.println("SIM: "+onePlus.getSIMCard2());
		System.out.println("Only one sim? "+onePlus.isSingleSIMCard());
		System.out.println("Battery Capacity: "+onePlus.batteryCapacity()+" mAh");
		System.out.println("IEMI Code "+onePlus.IEMICode());
		System.out.println("IEMI Code "+onePlus.IEMICode("BSNl"));
	}

}