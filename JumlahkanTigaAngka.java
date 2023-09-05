import java.util.Scanner;

public class JumlahkanTigaAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int angka1 = scanner.nextInt();
        int angka2 = scanner.nextInt();
        int angka3 = scanner.nextInt();

        int hasilJumlah = jumlahTigaAngka(angka1, angka2, angka3);

        System.out.println(hasilJumlah);
    }

    public static int jumlahTigaAngka(int a, int b, int c) {
        return a + b + c;
    }
}
