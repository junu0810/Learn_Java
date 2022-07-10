package ch01;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int month = scanner.nextInt();
		
		// int day;
		
		int day = switch(month){
//			case 1: case 3:
			case 1,3 ->{
				yield 31;
			}
			case 2 ->
				28;
			
			default -> {
				System.out.println("존재하지 않는 달입니다.");
				yield -1;
			}
		};
		
		
		if(day != -1) {
			System.out.println(month + "월은" + day + "입니다.");	
		}
		

	}

}
