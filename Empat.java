import java.util.Scanner;

public class Empat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int uang = scanner.nextInt();
        double kapasitasTangki = scanner.nextDouble();

        // Hitung jumlah bensin yang dibeli
        double hargaBensin = 7600; // Harga bensin premium per liter
        double jumlahBensin = uang / hargaBensin;

        // Tampilkan jumlah bensin dengan dua angka di belakang koma
        System.out.printf("%.2f%n", jumlahBensin);

        // Periksa apakah kapasitas tangki mencukupi
        if (jumlahBensin > kapasitasTangki) {
            System.out.println("Bensin Berlebih");
        }
    }
}
