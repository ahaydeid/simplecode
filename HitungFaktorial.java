import java.util.Scanner;

public class HitungFaktorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int hasilFaktorial = hitungFaktorial(N);

        System.out.println(hasilFaktorial);
    }

    public static int hitungFaktorial(int N) {
        int hasil = 1;
        for (int i = 1; i <= N; i++) {
            hasil *= i;
        }
        return hasil;
    }
}
