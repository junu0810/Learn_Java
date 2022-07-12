package ch6;

public class ManualCar extends Car {

    @Override
    public void drive() {
        System.out.println("사람이 운전을 합니다.");
        System.out.println("사람이 핸들을 조작합니다.");
    }

    @Override
    public void stop() {
        System.out.println("장애물이 앞에 있습니다.");
        System.out.println("사람이 브레이크를 밟습니다.");
    }

    @Override
    public void washcar() {}
    
}
