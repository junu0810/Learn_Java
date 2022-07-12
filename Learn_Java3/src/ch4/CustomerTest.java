package ch4;

import java.util.ArrayList;

import ch3.Customer;
import ch3.VIPCustomer;

public class CustomerTest {
    public static void main(String[] args){
        ArrayList<Customer> customerList = new ArrayList<>();

        customerList.add(new Customer(1001, "Test1"));
        customerList.add(new Customer(1002, "Test2"));
        customerList.add(new GoldCustomer(1003, "Test3"));
        customerList.add(new GoldCustomer(1004, "Test4"));
        customerList.add(new VIPCustomer(1005, "Test5"));

        // System.out.println(customerList.get(4).getSuper());

        System.out.println("====== 고객 정보 출력 =======");
        for( Customer customer : customerList){
            System.out.println(customer.showCustomerInfo());
        }

        int price = 10000;
        System.out.println("====== 할인율과 보너스 포인트 계산 =======");
        for(int i=0; i<customerList.size(); i++){
            int cost = customerList.get(i).calcPrice(price);
            System.out.println(customerList.get(i).getCustomerName() +" 님이 " +  + cost + "원 지불하셨습니다.");
			System.out.println(customerList.get(i).getCustomerName() +" 님의 현재 보너스 포인트는 " + customerList.get(i).bonusPoint2 + "점입니다.");
        }


    }

}
