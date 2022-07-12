package ch6;

public class AiCar extends Car {

    @Override
    public void drive() {
        System.out.println("자동주행을 시작합니다.");
        System.out.println("자동차가 자동으로 방향을 바꿉니다.");
        
    }

    @Override
    public void stop() {
        System.out.println("장애물이 앞에 있습니다.");
        System.out.println("차가 자동으로 멈춥니다.");
    }   

    @Override
    public void washcar() {
        System.out.println("자동차가 자동으로 세차를 합니다.");  
    }
    
}
