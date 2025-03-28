package Seminar2;

import java.util.Scanner;
import java.util.logging.Logger;

public class ThreMain {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("Main");
        logger.info("Введите значения драгоценностей");
        String jawels = scanner.next();
        logger.info("Введите строку, содеращую обычные камни");
        String stones = scanner.next();

        if(jawels.length() == 0) {
            throw new Exception("Введена пустая строка");
        }
        if(stones.length() == 0) {
            throw new Exception("Введена пустая строка");
        }

        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for(char c1: jawels.toCharArray()) {
            for(char c2: stones.toCharArray()) {
                if(c1 ==c2){
                    counter++;
                }
            }
            sb.append(c1)
                    .append(":")
                    .append(counter)
                    .append(" ");
            counter = 0;
        }
        logger.info(sb.toString());
    }
}
