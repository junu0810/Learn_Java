package ch01;

public class Car {
	
    private static Car instance;
    
	private Car() { } // 생성자를 private로 선언해서 외부의 접근을 제한한다.
	
    
    public static Car getInstance() {
    	if(instance == null) {
        	instance = new Car(); // instance가 없으면 static으로 Car를 선언한다.
        }
    	return instance; // 외부에서 클래스에 접근할 수 있는 getInstance메서드를 만든다. 
    }
    
    public void say() {
    	System.out.println("test Single");
    }
}