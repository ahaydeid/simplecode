import java.util.Scanner;

public class HitungLubang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String teks = scanner.next();

        int jumlahLubang = hitungJumlahLubang(teks);

        System.out.println(jumlahLubang);
    }

    public static int hitungJumlahLubang(String teks) {
        int jumlahLubang = 0;

// ABCDEFGHIJKLMNOPQRSTUVWXYZ

        for (char c : teks.toCharArray()) {
            switch (c) {
                case 'A':
                case 'D':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                    jumlahLubang += 1;
                    break;
                case 'B':
                    jumlahLubang += 2;
                    break;
                default:
                    break;
            }
        }

        return jumlahLubang;
    }
}
