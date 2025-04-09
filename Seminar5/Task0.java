package Seminar5;

import java.util.*;

/**
 * Дана последовательность чисел. Необходимо вернуть сумму уникальных чисел
Пример: [1, 2, 2, 3]
Результат: 4
 */

public class Task0 {
    public static void main(final String[] args) {
        
        List<Integer> list = Arrays.asList(1,2,2,3);
        Task0 task0 = new Task0();
        System.out.println(task0.getSumOfUniqueValuies(list));
    }

    public Integer getSumOfUniqueValuies(final List<Integer> list){
        if(list == null || list.isEmpty()){
            return 0;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for(Integer num : list){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1); //если num уже встречается в ХэшМэпе, добавляем в значение по ключу ещё одну единичку
            } else {
                map.put(num, 1); ////если num ещё не встречается в ХэшМэпе, присваиваем значение по ключу "1"
            }
        }
        
        // далее проходим по всему ХэшМэпу, проверяем, где значения по ключам равны "1" и суммируем их

        int counter = 0;
        for(Integer num: map.keySet()){
            if (map.get(num) == 1) {
                counter = counter + num;
            }
        }
            
        
        return counter;

    }
}
