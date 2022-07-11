package ch2;

public class CustomerTest {
    public static void main(String[] args){
        Customer customerLee = new Customer(10110, "이순신");
        
        customerLee.setCustomerName("이수환무");
        customerLee.setCustomerID(10110);
        customerLee.bonusPoint = 1000;

        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(10111, "김유신");
        
        customerKim.setCustomerName("김수환무");
        customerKim.setCustomerID(10111);
        customerKim.bonusPoint = 10000; 
        
        System.out.println(customerKim.showCustomerInfo());

        //상위클래스로 변수를 선언하고 하위 클래스의 생성자로 인스턴스를 생성할 수 있다.
        Customer vCustomer = new VIPCustomer(12312, "백준우");
        // "vCustomer."에는 Customer클래스의 멤버변수와 메서드만 사용이 가능하다.
    }

}
