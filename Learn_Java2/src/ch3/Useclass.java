package ch3;

public class Useclass {

	public static void main(String[] args) {
		
//		static이 없을경우 내부 클래스 호출방법 
//		Ride_Class R = new Ride_Class();
//		Bus bus = R.new Bus();
		
		Ride_Class.Bus Bus401 = new Ride_Class.Bus(401);
		
		
		Ride_Class S = new Ride_Class();
		Ride_Class.Subway firstLine = S.new Subway(1);
		
			
		
		Collaboration Baek = new Collaboration("Baek", 5000);
		Collaboration Lee = new Collaboration("Lee", 5500);
		
		Baek.takeBus(Bus401);
		Baek.takeSubway(firstLine);
		
		
		Lee.takeSubway(firstLine);
		
		
		Baek.showInfo();
		Lee.showInfo();
		
		Bus401.showBusInfo();
		firstLine.showSubwayInfo();
	
	}

}
