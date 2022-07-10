package ch3;

public class This_Test {
	
	String name;
	int age;
	double grade;
	
	public This_Test() {
		this("이름없음", 1 , 3.5);
	}
	
	public This_Test(String name, int age , double grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	
	public This_Test getThis() {
		return this;
	}
	
		public static void main(String[] args) {
		
			This_Test test1 = new This_Test();
			test1.name = "James";
			test1.age = 27;
			test1.grade = 3.5;
			
			This_Test test2 = test1.getThis();
			This_Test test3 = new This_Test();
			
			//this값과 new를 활용한 새로운 인스턴스의 값이 같다.
			System.out.println(test1.name);
			System.out.println(test2.name);
			System.out.println(test3.name);
			
	}

}
