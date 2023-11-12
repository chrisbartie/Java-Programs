package testbilling;


public class TestBilling {

    
    public static void main(String[] args) {
        
        Billing b = new Billing();
        
        System.out.println("The Price for  book is R" + b.computeBill(12));
        System.out.println("The Price for 3 books is R" + b.computeBill(12, 3));
        System.out.println("The Price for 3 books, for a customer with a R24 coupon is R" + b.computeBill(12, 3, 24));
    }
    
}
