package ch01;

import java.util.Scanner;

public class Whiletest {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while( num <= 10) {
			sum += num;
			num++;
		};
		System.out.println(sum);
		System.out.println(num);
		
		//input에 입력받는 값을 sum2에 더한뒤 while의 조건을 확인한다.
		Scanner scanner = new Scanner(System.in);
		
		int input;
		int sum2 = 0;
		
		do {
			input = scanner.nextInt();
			sum2 += input;
			
		}while( input != 0 );
		
		System.out.println(sum2);
		
	}

}
