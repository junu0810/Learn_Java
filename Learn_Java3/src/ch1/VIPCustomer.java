package ch1;

public class VIPCustomer extends Customer{
    private int agentID;
    double salesRatio;

    public VIPCustomer () {
        this.customerGrade = "VIP";    //오류 발생
		this.bonusRatio = 0.05;
		this.salesRatio = 0.1;


        //하위 클래스 호출시 무조건 상위클래스가 호출되고 하위클래스가 호출된다.
        System.out.println("VIPCustomer(int ID, String Name) 생성자 호출");
    }

    public int getAgentID() {
        return agentID;
    }
}
