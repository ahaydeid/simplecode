import java.util.Scanner;

public class HitungGanjil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arrayX = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arrayX[i][j] = scanner.nextInt();
            }
        }

        int jumlahGanjil = hitungGanjil(arrayX);

        System.out.println(jumlahGanjil);
    }

    public static int hitungGanjil(int[][] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 != 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
