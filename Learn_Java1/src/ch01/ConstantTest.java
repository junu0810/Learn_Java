package ch01;

public class ConstantTest {

	public static void main(String[] args) {
		final int Max_Num = 100;
		final int Min_Num;
		
		Min_Num = 20; 
		
		System.out.println(Max_Num);
		System.out.println(Min_Num);
		
		
		//byte에 들어갈수 있는 값의 범위를 벗어나면 -1이 된다.
		int iN = 255;
		//int iN = 10;
		
		byte bN = (byte)iN;
		System.out.println(iN);
		System.out.println(bN);
		
		double dN = 3.14;
		int iNu = (int)dN;
		
		int bo = 5;
		int le = 5;
		
		
		System.out.println(bo == le);
		System.out.println(iNu);
		
		
		
	}

}
