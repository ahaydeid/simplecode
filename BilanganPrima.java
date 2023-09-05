import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        if (isPrima(x)) {
            System.out.println("prima");
        } else {
            System.out.println("bukan prima");
        }
    }

    public static boolean isPrima(int x) {
        if (x <= 1) {
            return false;
        }

        if (x <= 3) {
            return true;
        }

        if (x % 2 == 0 || x % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= x; i += 6) {
            if (x % i == 0 || x % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
