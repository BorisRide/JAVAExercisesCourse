package Seminar5HomeWork;

/**
 * Сортировка слиянием
 * Напишите программу, которая реализует сортировку слиянием. 
 * Программа должна содержать два основных метода: 
 * merge для объединения двух отсортированных массивов в один отсортированный, 
 * и mergeSort для сортировки массива с использованием сортировки слиянием.
 */

import java.util.Arrays;

// Объединениt двух отсортированных массивов в один отсортированный 
class MergeSort {
    public static void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;
        // Метод merge объединяет два отсортированных массива в один отсортированный. Чтобы сделать это, 
        // вам нужно сравнивать элементы двух массивов и добавлять меньший элемент в результирующий массив. 
        // Используйте три индекса: один для каждого из двух входных массивов и один для результирующего массива.
        // Объединение элементов из массива left и right в массив result
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
       
        //Когда один из массивов полностью объединен, возможно, что в другом массиве остались элементы. 
        // Не забудьте скопировать оставшиеся элементы из непустого массива в результирующий массив. 
        // Для этого используйте два отдельных цикла, чтобы скопировать оставшиеся элементы из каждого массива.
        // Копирование оставшихся элементов из массива left (если есть):
        while (i < left.length) {
            result[k++] = left[i++];
        }

        // Копирование оставшихся элементов из массива right (если есть):
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }

    //рекурсивная сортировка массива (с использованием сортировки слиянием).
    public static void mergeSort(int[] array) {
        //Метод mergeSort использует рекурсию для сортировки массива. 
        //Разделите массив на две половины и рекурсивно отсортируйте каждую половину. 
        //Затем объедините отсортированные половины с помощью метода merge. 
        //Для разделения массива используйте метод Arrays.copyOfRange.
        
        //Базовый случай для рекурсии в методе mergeSort — это когда длина массива меньше 2. 
        // Если массив имеет один элемент или пустой, он уже отсортирован, и вам не нужно выполнять дополнительные операции.
        if (array.length < 2) {
            return; // Массив с одним элементом уже отсортирован
            }
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        // Рекурсивная сортировка двух половин
        mergeSort(left);
        mergeSort(right);
        // Объединение отсортированных половин
        //При объединении двух массивов в методе merge, убедитесь, что ваш алгоритм корректно обрабатывает ситуации, 
        //когда один из массивов полностью обработан, а в другом еще остались элементы.
        merge(left, right, array);
    }
}

// Не удаляйте и не меняйте метод Main!
public class Printer4 {
    public static void main(String[] args) {
        int[] initArray;
        if (args.length == 0) {
            initArray = new int[]{38, 27, 43, 3, 9, 82, 10};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }
    System.out.println("Initial array:");
    System.out.println(Arrays.toString(initArray));
    MergeSort.mergeSort(initArray);
    System.out.println("Sorted array:");
    System.out.println(Arrays.toString(initArray));
    }
}
