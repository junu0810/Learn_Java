package ch1;

public class CustomerTest {
    public static void main(String[] args){
        Customer customerLee = new Customer();
        
        customerLee.setCustomerName("이순신");
        customerLee.setCustomerID(10110);
        customerLee.bonusPoint = 1000;

        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer();
        
        customerKim.setCustomerName("김유신");
        customerKim.setCustomerID(10111);
        customerKim.bonusPoint = 10000;
        
        System.out.println(customerKim.showCustomerInfo());
    }
}
