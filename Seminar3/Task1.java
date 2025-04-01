package Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран.
 */
 
public class Task1 {
    public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
    Task1 task1 = new Task1();
    System.out.println(task1.sortByCollections(list).toString());
    System.out.println(task1.sortByComparator(list).toString());

    }

    public List<Integer> sortByCollections(List<Integer> list){
        Collections.sort(list);
        return list;
    }

    public List<Integer> sortByComparator(List<Integer> list){
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }

}
