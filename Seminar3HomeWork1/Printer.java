package Seminar3HomeWork1;
/**
 * Удаление отрицательных значений из массива
Реализуйте метод, который принимает на вход целочисленный массив и удаляет все отрицательные числа. 
Метод должен вернуть массив, содержащий только неотрицательные числа.
Пример:
[-1, 2, -3, 4, -5, 6]
Результат:
[2, 4, 6]
 */

import java.util.ArrayList;
import java.util.Arrays; 

class FilterNegative {

    public static int[] filterNegative(int[] a) {
        /**
         * Для удобства работы с элементами, которые нужно сохранить, используйте ArrayList<Integer>. 
        Это позволит динамически добавлять элементы и избежать сложностей с изменением размера массива.
         */
        ArrayList<Integer> list = new ArrayList<>();

        //Пройдитесь по каждому элементу массива с помощью цикла for.  
        //Если элемент неотрицательный (num >= 0), добавьте его в ArrayList.
        // int count = 0; BORIS
        for (int i : a) {
            if (i >=0 ) {
                list.add(i);
                //count ++; BORIS
            }
        }      
        // Преобразум ArrayList list в обычный массив int[]. 
        // Создадим новый массив нужного размера и скопируем в него элементы из ArrayList
        int[] positiveList = new int[list.size()];
        for (int i =0; i < list.size(); i++) {
            positiveList[i] = list.get(i);
        }

        // После преобразования ArrayList в массив, верните полученный массив как результат работы метода.
        return positiveList;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Printer {

    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
    
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{-1, 2, -3, 4, -5, 6};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        FilterNegative answer = new FilterNegative();
        String itresume_res = Arrays.toString(answer.filterNegative(a));
        System.out.println(itresume_res);
    }
}