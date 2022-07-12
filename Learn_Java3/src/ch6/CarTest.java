package ch6;

public class CarTest {
    public static void main(String[] args){
        AiCar car = new AiCar();  
        car.run();

        System.out.println("=============");

        ManualCar car2 = new ManualCar();
        car2.run();

    }
}
