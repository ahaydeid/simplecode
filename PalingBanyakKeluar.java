import java.util.Scanner;

public class PalingBanyakKeluar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] obrolan = new int[100];

        for (int i = 0; i < N; i++) {
            int nomor = scanner.nextInt();
            obrolan[nomor]++;
        }

        int palingSering = 0;
        int nomorPalingSering = 0;

        for (int i = 0; i < obrolan.length; i++) {
            if (obrolan[i] > palingSering) {
                palingSering = obrolan[i];
                nomorPalingSering = i;
            }
        }

        System.out.println(nomorPalingSering);
    }
}
