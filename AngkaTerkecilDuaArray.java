import java.util.Scanner;

public class AngkaTerkecilDuaArray {
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

        int terkecilArray1 = cariTerkecil(array1);
        int terkecilArray2 = cariTerkecil(array2);

        System.out.println(terkecilArray1 + " " + terkecilArray2);
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
