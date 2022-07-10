package ch2;

import java.util.Scanner;

public class UsecarInfo_Test {

	public static void main(String[] args) {
		
		 Car_Class Benz = new Car_Class();
		 
		 Benz.carName = "벤츠";
		 Benz.carNumber = 1234;
		 Benz.carPrice = 5300;
		 
		 String result = Benz.showCarInfo();
		 System.out.println(result);
		 
		 
		 Car_Class Ford = new Car_Class();
		 Ford.setCarInfo("토러스", 5678, 4500);
		 
		 System.out.println(Ford.showCarInfo());

		 
		 Scanner scanner = new Scanner(System.in);
		 Car_Class BMW = new Car_Class();
		 
		 System.out.println("차량번호을 입력하시오");
		 int scanNum = scanner.nextInt();
		 
		 System.out.println("차량이름을 입력하시오");
		 String scanName = scanner.next();
		 
		 System.out.println("차량가격을 입력하시오");
		 int scanPrince = scanner.nextInt();
		 
		 BMW.setCarInfo(scanName, scanNum, scanPrince);
		 System.out.println(BMW.showCarInfo());
		 
	}

}
