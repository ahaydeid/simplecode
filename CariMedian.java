import java.util.Scanner;

public class CariMedian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] data = new int[N];

        for (int i = 0; i < N; i++) {
            data[i] = scanner.nextInt();
        }

        double median = cariMedian(data);
        System.out.println(median);
    }

    public static double cariMedian(int[] arr) {
        int length = arr.length;
        if (length % 2 == 1) {
            return arr[length / 2];
        } else {
            int mid1 = length / 2;
            int mid2 = mid1 - 1;
            return (arr[mid1] + arr[mid2]) / 2.0;
        }
    }
}
