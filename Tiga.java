import java.util.Scanner;

public class Tiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int hargaBarangPertama = scanner.nextInt();
            int hargaBarangKedua = scanner.nextInt();

            int hargaTermurah = hargaBarangPertama;
            if (hargaBarangKedua < hargaTermurah) {
                hargaTermurah = hargaBarangKedua;
            }

            System.out.println(hargaTermurah);
        }
    }
}
