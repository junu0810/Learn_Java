package ch01;



public class HelloJava {

	public static void main(String[] args) {
		GetClassMethod equal1 = new GetClassMethod();
		GetClassMethod equal2 = new GetClassMethod();

		System.out.println(equal1.equals(equal2));

		GetClassMethod equal3 = equal1; 
		
		System.out.println(equal1.equals(equal3));

	}

}