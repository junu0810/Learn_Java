package ch4;


//메서드는 메서드 영역에 저장됨 
//인스턴스 내의 변수들은 힙 메모리에 따로 저장됨, 메서드는 메서드 영역에서 로드되어 사용됨

public class TestMethod {
    int num;
	
	void aaa() {
		System.out.println("aaa() 호출");
	}
	
	public static void main(String[] args) {
		
        //a1과 a2 인스턴스의 num변수는 힙 메모리에 따로 저장되지만 method인 add는 메서드 영역에 저장된 aaa를 불러와서 사용하여
        //결론적으로 같은 메소드를 공유한다.
		TestMethod a1 = new TestMethod();
		a1.aaa();
		
		TestMethod a2 = new TestMethod();
		a2.aaa();
	}
        //@Override를 사용하요 부모 인스턴스의 메서드를 재 정의한경우 주소값이 변경되어 같은 같은 메소드를 공유하는게 아니게 된다.

}
