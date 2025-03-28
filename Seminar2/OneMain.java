package Seminar2;

import java.util.Scanner;
import java.util.logging.Logger;

public class OneMain {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("Main");
        String c1;
        String c2;
        int n;
        logger.info("Введите значение с1");
        c1 = scanner.next();
        logger.info("Введите значение с2");
        c2 = scanner.next();
        logger.info("Введите значение N");
        n = scanner.nextInt();

        if (n<=0){
            throw new Exception("Не валидное значение N");
        }

        for(int i=0; i<n; i++){
            if(i % 2 == 0){
                System.out.print(c1);
            }
            if(i % 2 == 1){
                System.out.print(c2);
            }
        }
}
}
