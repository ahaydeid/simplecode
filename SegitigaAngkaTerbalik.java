import java.util.Scanner;

public class SegitigaAngkaTerbalik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int angka = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i; j++) {
                System.out.print(angka);
                if (j < N - i - 1) {
                    System.out.print(" ");
                }
                angka++;
            }
            System.out.println();
        }
    }
}
