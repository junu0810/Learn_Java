package ch6;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();    
    public abstract void washcar();    

    public void startCar(){
        System.out.println("시동을 켭니다.");
    }
    
    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }

    //추상 클래스의 응용 - 템플릿 메서드 패턴

    // 1. 추상 메서드나 구현 된 메서드를 활용하여 코드의 흐름(시나리오)를 정의하는 메서드
    // 2. final로 선언하여 하위 클래스에서 재정의 할 수 없게 함
    // 3. 프레임워크에서 많이 사용되는 설계 패턴
    // 4. 추상 클래스로 선언된 상위 클래스에서 템플릿 메서드를 활용하여 전체적인 흐름을 정의 하고 하위 클래스에서
    //    다르게 구현되어야 하는 부분은 추상 메서드로 선언하여 하위 클래스에서 구현 하도록 함



    final public void run(){
        startCar();
        drive();
        stop();
        turnOff();
        washcar();
    }
//     final 예약어

//     1. final 변수 : 값이 변경될 수 없는 상수
//     EX) public static final double PI = 3.14;
//     2. final 메서드 : 하위 클래스에서 재정의 할 수 없는 메서드
//     3. final 클래스 : 상속할 수 없는 클래스




}
