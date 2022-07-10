package ch2;

public class Car_Class {
	
	int carNumber;
	public String carName;
	public int carPrice;
	
	public void setCarInfo(String setName, int setNumber, int setPrice) {
		carNumber = setNumber;
		carName = setName;
		carPrice = setPrice;
	}
	
	public String showCarInfo() {
		return carNumber +"의 차종은 " + carName + "이며 가격은 " + carPrice;
	}

	@Override
	public String toString() {
		return "Car_Class [carNumber=" + carNumber + ", carName=" + carName + ", carPrice=" + carPrice
				+ ", showCarInfo()=" + showCarInfo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	//toString은 클래스에서 자동호출하여 사용한다.
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return carName +"차 사지 마세요";
//	}
	
	public static void main(String[] args) {
		
	}
	
}
