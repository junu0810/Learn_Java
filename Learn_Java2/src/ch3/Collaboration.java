package ch3;

public class Collaboration  {
	
	String studentName;
	int money;
	
	public Collaboration(String studentName, int money) {
		
		this.studentName = studentName;
		this.money = money;
		
	}
	
	public void takeBus(Ride_Class.Bus bus) {
		bus.take(1000);
		bus.passengerCount++;
		this.money -= 1000;
		
	}
	
	public void takeSubway(Ride_Class.Subway subway) {
		subway.take(1200);
		subway.passengerCount++;
		this.money -= 1200;
	}
	
	public void showInfo() {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(studentName);
		buffer.append("님의 남은돈은 ");
		buffer.append(money);
		
		System.out.println(buffer);
	}
	
}
