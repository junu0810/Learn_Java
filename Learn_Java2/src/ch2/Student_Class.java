package ch2;

public class Student_Class {
		
//		String majorName;
//		int studentNumber;
//		String studentName;
//	
//	public void setStudentName(String name) {
//		this.studentName = name;
//	}
	Student_Test Student;
	
	public Student_Class(int Num, String Name, double grade) {
		Student = new Student_Test(Num, Name, grade);
	}
	
	public void main(String[] args) {	

//		Student_Test Lee = new Student_Test(123 , "Baek" , 3.5);
//		Lee.setKorea("한국사", 50);
//		Lee.setMath("기하와 벡터", 67);
//	
//		Lee.showStudentInfo();
//		Lee.showScore();  
		Student_Class Lee = new Student_Class(15,"Lee",3.5);
		Lee.Student.showStudentInfo();
		System.out.println("테스트프린트");
	}

	
}


