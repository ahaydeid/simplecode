import java.util.Scanner;

public class Enam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jenisKendaraan = scanner.nextInt();
        int lamaParkir = scanner.nextInt();

        int biayaPerJam;
        int biayaPertama;
        int totalBiaya;

        if (jenisKendaraan == 1) { // Kendaraan adalah mobil
            biayaPerJam = 1000;
            biayaPertama = 2000;
        } else if (jenisKendaraan == 2) { // Kendaraan adalah motor
            biayaPerJam = 500;
            biayaPertama = 1000;
        } else {
            biayaPerJam = 0;
            biayaPertama = 0;
        }

        totalBiaya = biayaPertama + (lamaParkir - 1) * biayaPerJam;
        System.out.println(totalBiaya);
    }
}
