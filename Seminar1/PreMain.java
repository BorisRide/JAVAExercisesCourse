import java.util.Scanner;

public class PreMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double c = Math.pow(a, b);
        System.out.print(c);

    } 

}