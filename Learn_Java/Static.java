public class Static {
    
    public class AbstractClass {
        private String name; 
        
        public AbstractClass(String name){
            this.name = name;
        }
    }
    
    public class RealClass extends AbstractClass{
        
        private String address;
        
        public RealClass(String name , String address) {
            super(name);
            this.address = address;
        }
    }
}
