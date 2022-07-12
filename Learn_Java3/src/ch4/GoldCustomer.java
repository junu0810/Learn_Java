package ch4;

import ch3.Customer;

public class GoldCustomer extends Customer {
    double saleRatio;

    public GoldCustomer(int ID, String Name){
        super(ID, Name);

        customerGrade = "GOLD";
        bonusRatio = 0.02;
        saleRatio = 0.1;
    }
    @Override
    public int calcPrice(int price){
        bonusPoint2 += bonusPoint + (int)(price * bonusRatio);
		return price - (int)(price * saleRatio);

    }
}
