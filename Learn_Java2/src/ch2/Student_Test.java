package ch2;

public class Student_Test {

		public int studentID;
		public String studentName;
		public double grade;
		
		Subject_Test English;
		Subject_Test Korea;
		Subject_Test math;
		
		public Student_Test(int Number , String Name , double grade) {
			
			this.studentID = Number;
			this.studentName = Name;
			this.grade = grade;
			
			English = new Subject_Test();
			Korea = new Subject_Test();
			math = new Subject_Test();
		
		}
		
		public static void main(String[] args) {
			
//			Student_Test Baek = new Student_Test(1234, "Baek Joon Woo", 3.5);
//			
//			Baek.showStudentInfo();
		}
		
		
		public void setKorea(String name , int score) {
			
			Korea.subjectName = name;
			Korea.score = score;
			
		}
		
		public void setMath(String name , int score) {
			
			math.subjectName = name;
			math.score = score;
			
		}
		
		public void showStudentInfo() {
			
			System.out.println(studentID + " 학생의 이름은 " + studentName + "이고 성적은 " + grade + "이다." );
			
		}
		
		public void showScore() {
			
			int total = Korea.score + math.score;
			System.out.println(studentName + "의 성적은 " + total );
		
		}
			
}
