package Seminar2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class FourMain {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("Main");
        logger.info("Введите исходную строку");
        String s = scanner.next();
        
        if(s.length() == 0) {
            throw new Exception("Введена пустая строка");
        }
        
        int[] array = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            logger.info("Введите значение индекса массива");
            array[i] = scanner.nextInt();
        }
        
        char[] result = new char[s.length()];
        for(int i = 0; i < array.length; i++){
            char temp = s.charAt(i);
            int tempIndex = array[i];
            result [tempIndex - 1] = temp;
        }
        logger.info(Arrays.toString(result));
       
    }
}
