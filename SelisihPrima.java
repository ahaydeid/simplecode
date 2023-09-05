import java.util.Scanner;

public class SelisihPrima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int selisih = hitungSelisihBilanganPrima(x, y);

        System.out.println(selisih);
    }

    public static boolean isPrima(int n) {
        if (n <= 1) {
            return false;
        }

        if (n <= 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        int i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }

        return true;
    }

    public static int hitungSelisihBilanganPrima(int x, int y) {
        int bilanganPrimaTerkecil = -1;
        int bilanganPrimaTerbesar = -1;

        for (int i = x; i <= y; i++) {
            if (isPrima(i)) {
                if (bilanganPrimaTerkecil == -1) {
                    bilanganPrimaTerkecil = i;
                }
                bilanganPrimaTerbesar = i;
            }
        }

        return bilanganPrimaTerbesar - bilanganPrimaTerkecil;
    }
}
