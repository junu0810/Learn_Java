package ArrayTest;

import java.util.ArrayList;

import ArrayTest.Subject;


public class Student_Test {

		public int studentID;
		public String studentName;
		ArrayList<Subject> subjectList;
//		ArrayList<Subject> subjectList = new ArrayList();
		
		public Student_Test(int Number , String Name) {
			
			this.studentID = Number;
			this.studentName = Name;
			subjectList = new ArrayList();
		}
		
		public void addSubject(String name, int point) {
			Subject subject = new Subject();
			subject.setName(name);
			subject.setScorePoint(point);
			
			subjectList.add(subject);
		}
		
		public void showScore() {
			
			int total = 0;
			for(Subject subject : subjectList) {
				total += subject.getScore();
				
				System.out.println(studentName + "의 " + subject.getName() + "성적은 " + total );
			}
			System.out.println(studentName + "의 총 성적은 " + total );
		}
			
}

