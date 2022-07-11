package ch3;

public class VIPCustomer extends Customer{
    private int agentID;
    double salesRatio;

    public VIPCustomer (int ID, String Name) {
        //상위 클래스의 기본생성자를 사용하려면 super가 있으면 된다.(단 상위클래스 기본생성자 존재시)
        super(ID, Name);
        this.customerGrade = "VIP";    //오류 발생
		this.bonusRatio = 0.05;
		this.salesRatio = 0.1;

        //System.out.println("VIPCustomer(int ID, String Name) 생성자 호출");
    }

    public int getAgentID() {
        return agentID;
    }

    //상위 클래스에서 정의된 메서드의 구현내용이 하위클래스에서 재구현할 경우 @Override를 사용해서 메서드를 재정의 할 수 있다.
    @Override
    public int calcPrice(int price) {
        
        bonusPoint2 = bonusPoint + (int)(price * bonusRatio);
        return price - (int)(price * salesRatio);

    }
}
