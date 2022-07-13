package ch9;


public interface Calc {

    double PI = 3.14;
    int ERROR = -9999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);
    
    // - private 메서드
    // - 인터페이스를 구현한 클래스에서 사용하거나 재정의 할 수 없음
    // - 인터페이스 내부에서만 사용하기 위해 구현하는 메서드
    // - default 메서드나 static 메서드에서 사용함

    private void myMethod(){
        System.out.println("myMethod");
    }

    private static void myStaticMethod(){
        System.out.println("myStaticMethod");
    }

    // - default 메서드
    // - 구현을 가지는 메서드, 인터페이스를 구현하는 클래스들에서 공통으로 사용할 수 있는 기본 메서드
    // - default 키워드 사용
    // - 구현 하는 클래스에서 재정의 할 수 있음
    default void description(){
        System.out.println("정수의 사칙연산을 제공한다.");
        myMethod();
    }

    // - static 메서드
    // - 인스턴스 생성과 상관 없이 인터페이스 타입으로 사용할 수 있는 메서드
    // - static 키워드 사용
    static int total(int[] arr){
        int total =0;
        for(int num : arr){
            total +=num;
        }
        myStaticMethod();
        return total;
    }

}
