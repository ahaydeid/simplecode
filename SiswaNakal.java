import java.util.Scanner;

public class SiswaNakal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] nilaiSiswa = new int[n];

        for (int i = 0; i < n; i++) {
            nilaiSiswa[i] = scanner.nextInt();
        }

        int totalNilai = 0;
        for (int nilai : nilaiSiswa) {
            totalNilai += nilai;
        }

        double rataRata = (double) totalNilai / n;
        int jumlahBermasalah = 0;

        for (int nilai : nilaiSiswa) {
            if (nilai < rataRata) {
                jumlahBermasalah++;
            }
        }

        System.out.println(jumlahBermasalah);
    }
}
