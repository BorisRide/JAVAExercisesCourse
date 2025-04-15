package Seminar6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
 * 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных
 * значений в данном массиве и верните его в виде числа с плавающей запятой.
 * 
 * Для вычисления процента используйте формулу:
 * процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
 */

public class Task1 {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        int[] array = task1.initArray();
        System.out.println(Arrays.toString(array));
        System.out.println(task1.getPercentUnqueValues(array));
    }

    // Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
    public int[] initArray() {
        int[] array = new int[100];
        Random random = new Random();
        for(int i = 0; i < 100; i++) {
            array[i] = random.nextInt(24);
        }
        return array;
    }

    // Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных
    // значений в данном массиве и верните его в виде числа с плавающей запятой.
    public float getPercentUnqueValues(int[] array) {
        Set <Integer> set = new HashSet<>();
        for(int num: array) {
            set.add(num); //в HashSet (!) добавляются только уникальные значения !!!
        }
        System.out.println(set.toString());
        float result = set.size() * (100 / array.length); //% уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
        return result;
    }

}