package Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
  * Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа.
Пройти по списку, вывести информацию, какое значение строка, а какое - число.
  */

public class Task2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "2", "b", "3", "c", "4"));
        Task2 task2 = new Task2();
        task2.printResultOfCheck(list);
    }

    public void printResultOfCheck(List<String> list) {
        for (String s: list){
            try {
                int i = Integer.valueOf(s);
                System.out.println(i + "- число");

            } catch (NumberFormatException e) {
                System.out.println(s + "- строка");
            }

        } 
        
    }
}
