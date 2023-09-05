import java.util.Scanner;

public class KarakterTerkanan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.nextLine();
        int N = scanner.nextInt();

        String hasil = tampilkanKarakterTerkanan(S, N);

        System.out.println(hasil);
    }

    public static String tampilkanKarakterTerkanan(String S, int N) {
        int panjangS = S.length();

        if (N >= panjangS) {
            return S;
        }

        return S.substring(panjangS - N);
    }
}
