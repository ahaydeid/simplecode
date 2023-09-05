import java.util.Scanner;

public class AngkaTerbesarDuaArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for (int i = 0; i < 10; i++) {
            array1[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            array2[i] = scanner.nextInt();
        }

        int terbesarArray1 = cariTerbesar(array1);
        int terbesarArray2 = cariTerbesar(array2);

        System.out.println(terbesarArray1 + " " + terbesarArray2);
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
}
