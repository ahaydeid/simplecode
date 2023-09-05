import java.util.Scanner;

public class Satu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Menerima semua jenis karakter input dari pengguna
        char input = scan.next().toLowerCase().charAt(0);

        // Mengecek apakah karakter input adalah huruf vokal
        boolean isVocal = input == 'a' || input == 'i' || input == 'u' || input == 'e' || input == 'o';

        // Mencetak hasil, true jika huruf vokal dan huruf, false jika tidak
        System.out.println(isVocal);
    }
}
