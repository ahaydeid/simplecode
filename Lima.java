import java.util.Scanner;

public class Lima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();

        if(X > -1 && X<=100){
        if (X % 2 == 0 && X > 0) {
            System.out.println("genap");
        } else if(X == 0){
            System.out.println("nol");
        }
         else {
            System.out.println("ganjil");
        }
    }
    }
}
