package oopspractice;

public class OnePlus extends Mobile{
	private boolean isSingleSIM;
	private int capacity;
	@Override
	public boolean isSingleSIMCard() {
		// TODO Auto-generated method stub
		this.isSingleSIM=super.isSingleSIM;
		return isSingleSIM;
	}
	@Override
	public int batteryCapacity() {
		// TODO Auto-generated method stub
		return capacity;
	}
	public void batteryCapacity(int capacity) {
		this.capacity=capacity;
	}
	@Override
	public void colour(String colour) {
		// TODO Auto-generated method stub
		System.out.println("Colour: "+colour);
	}
	
}