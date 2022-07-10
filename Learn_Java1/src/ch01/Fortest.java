package ch01;

import java.util.Scanner;

public class Fortest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input;
		
		input = scanner.nextInt();
		
		for(int i= 0; i < input; input-=2) {			System.out.println("카운트 " + input);
		};
		System.out.println("카운트가 종료되었습니다.");
	
	
		int start = 2; 
		int end = 9;
	
		for(int first = 1; first <= start; first++) {
			
			for(int second = 1; second <= end; second++ ) {
				
				//second가 6이면 for문을 나오고 곱한값이 3의 배수이면 다음 순서를 진행한다.
				if(second == 6) {
					break;
				}
				else if(first*second % 3 == 0) continue;
				
				System.out.println(first + "*" + second + "=" + first*second);
				
				
			};
		};
	}
}
  