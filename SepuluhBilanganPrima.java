import java.util.Scanner;

public class SepuluhBilanganPrima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[10];

        for (int i = 0; i < 10; i++) {
            A[i] = scanner.nextInt();
        }

        int jumlahPrima = hitungBilanganPrima(A);

        System.out.println(jumlahPrima);
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

        int i = 5;
        while (i * i <= x) {
            if (x % i == 0 || x % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }

        return true;
    }

    public static int hitungBilanganPrima(int[] arr) {
        int jumlahPrima = 0;

        for (int i = 0; i < arr.length; i++) {
            if (isPrima(arr[i])) {
                jumlahPrima++;
            }
        }

        return jumlahPrima;
    }
}
