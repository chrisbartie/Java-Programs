package diagonalos;

public class DiagonalOs {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //for loop to print space before the O
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //print O after the required number of spaces
            System.out.println("O");
        }
    }
}
