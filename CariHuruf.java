import java.util.Scanner;

public class CariHuruf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] arrayX = {'J', 'T', 'K', 'P', 'o', 'l', 'b', 'a', 'n'};
        char huruf = scanner.next().charAt(0);

        boolean ada = false;

        for (int i = 0; i < arrayX.length; i++) {
            if (Character.toLowerCase(arrayX[i]) == Character.toLowerCase(huruf)) {
                ada = true;
                break;
            }
        }

        if (ada) {
            System.out.println("ada");
        } else {
            System.out.println("tidak ada");
        }
    }
}
