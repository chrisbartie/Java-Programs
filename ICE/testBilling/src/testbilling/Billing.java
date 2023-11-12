package testbilling;


public class Billing {
    
    public double computeBill(double Price)
    {
        return Price * 1.08;
    }
    public double computeBill(double Price, int Quantity)
    {
        return (Price * Quantity) * 1.08;
    }
    public double computeBill(double Price, int Quantity, int Coupon)
    {
        return (Price * Quantity - Coupon) * 1.08;
    }
            
    }
