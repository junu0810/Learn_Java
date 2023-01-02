import Static.RealClass;

public class Test{
    public static void main(String[] args) {
        
        Car singleton1 = Car.getInstance();
        Car singleton2 = Car.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
    }

}
