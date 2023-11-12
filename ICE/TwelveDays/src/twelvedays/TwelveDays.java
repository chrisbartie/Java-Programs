package twelvedays;

public class TwelveDays {

    public static void main(String[] args) {
        printDay(1);
        printDay(2);
        printDay(3);
        printDay(4);
        printDay(5);
        printDay(6);
        printDay(7);
        printDay(8);
        printDay(9);
        printDay(10);
        printDay(11);
        printDay(12);
    }
    public static void printDay(int day){
    
        System.out.println("On the " + day + " day");
    switch(day)
    {
        case 12:System.out.println("Twelve drummers a drum");
        case 11:System.out.println("Eleven pipers piping");
        case 10:System.out.println("Ten lords a leaping");
        case 9:System.out.println("Nine ladies dancing");
        case 8:System.out.println("Eight maids a milking");
        case 7:System.out.println("Seven swans a swimming");
        case 6:System.out.println("Six geese a laying");
        case 5:System.out.println("Five gold rings");
        case 4:System.out.println("Four calling birds");
        case 3:System.out.println("Three french hens");
        case 2:System.out.println("Two turtle doves");
        case 1:System.out.println("A partridge in a pear tree");
    }
        System.out.println();
    
    }
}

