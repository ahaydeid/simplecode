import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String teks = scanner.nextLine();
        
        String hasil = terbalik(teks);
        System.out.println(hasil);
    }

    public static String terbalik(String teks) {
        char[] karakter = teks.toCharArray();
        int kiri = 0;
        int kanan = karakter.length - 1;

        while (kiri < kanan) {
            // Tukar karakter pada posisi kiri dan kanan
            char temp = karakter[kiri];
            karakter[kiri] = karakter[kanan];
            karakter[kanan] = temp;

            kiri++;
            kanan--;
        }

        return new String(karakter);
    }
}
