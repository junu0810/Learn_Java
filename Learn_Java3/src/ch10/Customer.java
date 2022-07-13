package ch10;

public class Customer implements Buy,Sell {

    @Override
    public void sell() {
       System.out.println("Customer Sell");
    }
    
    @Override
    public void buy() {
        System.out.println("Customer Buy");
        
    }
    


    public void hello(){
        System.out.println("Hello");
    }

}
