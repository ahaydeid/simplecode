import java.util.Scanner;

public class Dua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            double suhu = scanner.nextDouble();

            if (suhu >= 0 && suhu <= 100) {
                System.out.println("berwujud cair");
            } else if(suhu >= -150 && suhu < 0){
                System.out.println("berwujud non cair");
            } else if(suhu >= 100 && suhu <= 150){
                System.out.println("berwujud non cair");
            } 
    }
}
