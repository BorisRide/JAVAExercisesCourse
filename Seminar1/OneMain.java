
import java.util.Scanner;

public class OneMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String out = new String("Привет, %s");
        System.out.printf(out,s);
    } 
}