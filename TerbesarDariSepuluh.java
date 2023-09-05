import java.util.Scanner;

public class TerbesarDariSepuluh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] bilangan = new int[10];

        for (int i = 0; i < 10; i++) {
            bilangan[i] = scanner.nextInt();
        }

        int terbesar = cariBilanganTerbesar(bilangan);

        System.out.println(terbesar);
    }

    public static int cariBilanganTerbesar(int[] arr) {
        int terbesar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > terbesar) {
                terbesar = arr[i];
            }
        }

        return terbesar;
    }
}
