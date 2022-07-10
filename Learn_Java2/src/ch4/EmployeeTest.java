package ch4;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee Lee = new Employee();
		Lee.setEmployeeName("Lee");
		
		System.out.println(Employee.getSerialNum());
		
		Employee Kim = new Employee();
		Kim.setEmployeeName("Kim");
		
		Kim.testNum++;
		Kim.testNum++;
		
		System.out.println(Lee.getEmployeeName() + "님의 사번은 "+ Lee.getEmployeeId());
		System.out.println(Kim.getEmployeeName() + "님의 사번은 "+ Kim.getEmployeeId());
		System.out.println(Kim.testNum);
		
	}

}
