package ch3;

public class Ride_Class {
	
	// == static 사용 이유
	//Static 키워드를 통해 생성된 정적멤버들은 Heap영역이 아닌 Static영역에 할당됩니다. 
	//Static 영역에 할당된 메모리는 모든 객체가 공유하여 하나의 멤버를 어디서든지 참조할 수 있는 장점을 가지지만
	//Garbage Collector의 관리 영역 밖에 존재하기에 Static영역에 있는 멤버들은 프로그램의 종료시까지 메모리가 할당된 채로 존재하게 됩니다. 
	//그렇기에 Static을 너무 남발하게 되면 만들고자 하는 시스템 성능에 악영향을 줄 수 있습니다. 해제하려면 null로 리퍼런스를 재선언합니다.
	
	public static class Bus {
		
		int RideNumber;
		int passengerCount = 0;
		int money;
		
		public void take(int money) {
			this.money += money;
			
		}
		
		public Bus(int number) {
			this.RideNumber = number;
		}
		
		public void showBusInfo() {
			
			System.out.println(RideNumber + "번의 승객 수는 " + passengerCount + "명이고, 수입은 " + money + "입니다." );
		
		}
	
	}
	
	public class Subway {
		
		int RideNumber;
		int passengerCount;
		int money;
		
		public void take(int money) {
			this.money += money;
			
		}
		
		public Subway(int RideNumber) {
			this.RideNumber = RideNumber;
		}
		
		public void showSubwayInfo() {
			
			System.out.println(RideNumber + "호선의 승객 수는 " + passengerCount + "명이고, 수입은 " + money + "입니다." );
		
		}
	
		
	}
	
}
