import java.util.Scanner;

public class HitungPangkat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bil1 = scanner.nextInt();
        int bil2 = scanner.nextInt();

        int hasilPangkat = hitungPangkat(bil1, bil2);

        System.out.println(hasilPangkat);
    }

    public static int hitungPangkat(int a, int b) {
        int hasil = 1;
        for (int i = 1; i <= b; i++) {
            hasil *= a;
        }
        return hasil;
    }
}
