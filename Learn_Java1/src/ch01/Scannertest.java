package ch01;

import java.util.Scanner;

public class Scannertest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int max;
		System.out.println("숫자를 입력하세요");
		System.out.println("Input1:");
		int num1 = scanner.nextInt();
		System.out.println("Input2:");
		int num2 = scanner.nextInt();
		
//		max = (num1 > num2) ? num1 : num2;
		
		if(num1 > num2) {
			max = num1;
		}
		else{
			max = num2;
		}
		
		System.out.println("가장 큰수는 " + max);
		
	}

}
