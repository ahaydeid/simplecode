import java.util.Scanner;

public class SelisihTerbesarTerkecil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        int terbesar = cariTerbesar(array);
        int terkecil = cariTerkecil(array);

        int selisih = terbesar - terkecil;

        System.out.println(selisih);
    }

    public static int cariTerbesar(int[] arr) {
        int terbesar = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > terbesar) {
                terbesar = arr[i];
            }
        }
        return terbesar;
    }

    public static int cariTerkecil(int[] arr) {
        int terkecil = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < terkecil) {
                terkecil = arr[i];
            }
        }
        return terkecil;
    }
}
