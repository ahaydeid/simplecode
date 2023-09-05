// import java.util.Scanner;

// public class Tujuh {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int pilihan = scanner.nextInt(); // Membaca pilihan (1 untuk mobil, 2 untuk motor)
//         int lamaParkir = scanner.nextInt(); // Membaca lama waktu parkir dalam satuan jam

//         int tarif = 0;

//         if (pilihan == 1) { // Kendaraan adalah mobil
//             tarif = lamaParkir <= 5 ? lamaParkir * 1500 : (lamaParkir > 5 && lamaParkir <= 8) ? 7500 + (lamaParkir - 5) * 500 : -1;
//         } else if (pilihan == 2) { // Kendaraan adalah motor
//             tarif = lamaParkir <= 5 ? lamaParkir * 1000 : (lamaParkir > 5 && lamaParkir <= 8) ? 5000 + (lamaParkir - 5) * 500 : -1;
//         }

//         if (lamaParkir > 8) {
//             System.out.println("disegel");
//         }
//         else {
//             System.out.println(tarif);
//         }
//     }
// }


import java.util.Scanner;

public class Tujuh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pilihan = scanner.nextInt();
        int lamaParkir = scanner.nextInt();

        int biaya = hitungBiaya(pilihan, lamaParkir);

        if (biaya == -1) {
            System.out.println("disegel");
        } else {
            System.out.println(biaya);
        }
    }

    public static int hitungBiaya(int pilihan, int lamaParkir) {
        int biayaPerJam = (pilihan == 1) ? 1500 : 1000;
        int biayaTambahan = (lamaParkir > 5) ? (lamaParkir - 5) * 500 : 0;
        int biayaTotal = biayaPerJam * lamaParkir + biayaTambahan;

        if (lamaParkir > 8) {
            return -1; // Kendaraan disegel
        }

        return biayaTotal;
    }
}
