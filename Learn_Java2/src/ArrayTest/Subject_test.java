package ArrayTest;

public class Subject_test {

	public static void main(String[] args) {
		
		Student_Test studentLee = new Student_Test(1001,"Lee");
		studentLee.addSubject("국어", 70);
		studentLee.addSubject("영어", 50);
		
		Student_Test studentKim = new Student_Test(1002,"Kim");
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("영어", 50);
		studentKim.addSubject("국사", 80);
		
		studentLee.showScore();
		System.out.println("====================");
		studentKim.showScore();

		
	}

}
