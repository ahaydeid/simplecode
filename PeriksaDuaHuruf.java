import java.util.Scanner;

public class PeriksaDuaHuruf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] arrayX = {'J', 'T', 'K', 'P', 'o', 'l', 'b', 'a', 'n'};

        char huruf1 = scanner.next().charAt(0);
        char huruf2 = scanner.next().charAt(0);

        boolean ada = false;

        for (int i = 0; i < arrayX.length - 1; i++) {
            if (Character.toLowerCase(arrayX[i]) == Character.toLowerCase(huruf2) &&
                Character.toLowerCase(arrayX[i + 1]) == Character.toLowerCase(huruf1)) {
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
