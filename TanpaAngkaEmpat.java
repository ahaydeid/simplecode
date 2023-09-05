import java.util.Scanner;

public class TanpaAngkaEmpat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input X dan Y
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        // Inisialisasi jumlahTanpaAngka4
        int jumlahTanpaAngka4 = 0;

        // Loop untuk menghitung jumlah bilangan tanpa angka 4
        for (int i = X; i <= Y; i++) {
            if (!hasAngka4(i)) {
                jumlahTanpaAngka4++;
            }
        }

        // Menampilkan hasil
        System.out.println(jumlahTanpaAngka4);
    }

    // Fungsi untuk mengecek apakah suatu angka memiliki angka 4 di dalamnya
    public static boolean hasAngka4(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit == 4) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
}
