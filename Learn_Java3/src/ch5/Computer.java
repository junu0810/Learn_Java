package ch5;

// 추상 클래스 구현하기

// 1. 메서드에 구현 코드가 없으면 abstract 로 선언
// 2. abstract로 선언된 메서드를 가진 클래스는 abstract로 선언
// 3. 모든 메서드가 구현 된 클래스라도 abstract로 선언되면 추상 클래스로 인스턴스화 할 수 없음
// 4. 추상 클래스의 추상 메서드는 하위 클래스가 상속 하여 구현
// 5. 추상 클래스 내의 추상 메서드 : 하위 클래스가 구현해야 하는 메서드
// 6. 추상 클래스 내의 구현 된 메서드 : 하위 클래스가 공통으로 사용하는 메서드 ( 필요에 따라 하위 클래스에서 재정의 함 )




public abstract class Computer {
    
    public abstract void display();
    public abstract void typing();

    public Computer(){

    }

    void turnOn(){
        System.out.println("전원을 켜다");
    }

    void turnOff(){
        System.out.println("전원을 끄다");
    }
}
