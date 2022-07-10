package ch01;

public class BinaryTest {

	public static void main(String[] args) {
		
		//정수표현 
		int num = 10;
		int bN = 0B1010;
		int gN = 012;
		int xN = 0XA;
		
		//byte는 127까지 사용가
		byte bnum = 127;
		
		long nonLong = 12345678;
		long useLong = 123456789000L;
		
		//실수 표현방법 
		//double은 4바이트 float는 8바이트 사
		double dnum = 3.14;
		float fnum = 3.14F;
		
		//문자 표현 방법 
		char ch = 'A';
		
		//논리형
		boolean inTrue = true;
		
		//지역변수 자료형 없이 사용하기
		var i = 10;
		var s = 10.1;
		var str = "포켓몬빵"; 
		
		//str은 문자열로 이미 선언되었기때문에 숫자를 사용 못한다.
		str = "주니어개발자"; 
		
		System.out.println(num);
		System.out.println(bN);
		System.out.println(gN);
		System.out.println(xN);
		System.out.println(nonLong);
		System.out.println(useLong);
		System.out.println(dnum);
		System.out.println(fnum);
		System.out.println(ch);
		System.out.println(inTrue);
		System.out.println(i);
		System.out.println(s);
		System.out.println(str);
	
	}

}
