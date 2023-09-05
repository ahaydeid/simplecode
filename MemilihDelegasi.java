import java.util.Scanner;

public class MemilihDelegasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int hasil = hitungCaraMemilih(N, M);
        System.out.println(hasil);
    }

    public static int hitungCaraMemilih(int N, int M) {
        return perhitungan(N) / (perhitungan(M) * perhitungan(N - M));
    }

    public static int perhitungan(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * perhitungan(n - 1);
    }
}
