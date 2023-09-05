import java.util.Scanner;

public class MencariAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] data = new int[N];
        for (int i = 0; i < N; i++) {
            data[i] = scanner.nextInt();
        }
        
        float rata = nilaiAverage(data, N);
        System.out.printf("%.2f\n", rata);
    }

    public static float nilaiAverage(int data[], int N) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += data[i];
        }
        return (float) sum / N;
    }
}
