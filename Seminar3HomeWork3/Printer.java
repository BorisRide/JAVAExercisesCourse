package Seminar3HomeWork3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Длина слов
Реализуйте метод, который принимает на вход массив строк и возвращает новый массив, 
содержащий только строки, длина которых больше 3 символов.
Пример:
["cat", "elephant", "dog", "giraffe"]
Результат:
["elephant", "giraffe"]
 */

 class FilterStrings {

    public static String[] filterShortStrings(String[] arr) {

        // Напишите свое решение ниже

        // Создайте ArrayList<String>, чтобы хранить строки, которые соответствуют вашему условию (длине больше 3 символов).
        // Это поможет вам динамически добавлять строки без необходимости предварительно определять размер массива.
        ArrayList<String> list = new ArrayList<>();

        // Итерируйте через массив строк с помощью цикла for. 
        // Для каждой строки проверьте ее длину с помощью метода length(). 
        // Если длина строки больше 3 символов, добавьте ее в ArrayList.
        for (String i : arr) {
            if(i.length() > 3) {
                list.add(i);
            }
        }
        // После того как вы добавили все строки, длина которых больше 3 символов, в ArrayList, преобразуйте его в массив. 
        // Для этого создайте новый массив строк и скопируйте элементы из ArrayList в этот массив.
        String[] threeArray = new String[list.size()];
        for (int k = 0 ; k < list.size(); k++ ) {
            threeArray[k] = list.get(k);
        }
        // После преобразования ArrayList в массив, верните полученный массив как результат работы метода.
        return threeArray;    
    
    }   
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {

        String[] arr;
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new String[]{"cat", "elephant", "dog", "giraffe"};
        } else {
            arr = args[0].split(", ");
        }
        FilterStrings answer = new FilterStrings();
        String itresume_res = Arrays.toString(answer.filterShortStrings(arr));
        System.out.println(itresume_res);
    }
}
