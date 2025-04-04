package Seminar3HomeWork2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * Уникальные числа
Напишите метод, который принимает целочисленный массив и возвращает новый массив, 
содержащий только уникальные элементы из исходного массива.
Пример:
[1, 2, 2, 3, 4, 4, 5]
Результат:
[1, 2, 3, 4, 5]
import java.
 */

class UniqueElements {
    public static int[] getUniqueElements(int[] a) {
    // Напишите свое решение ниже

    // LinkedHashSet автоматически исключает дубликаты и сохраняет порядок вставки элементов. 
    // Это удобный способ сохранить уникальные элементы и порядок их появления.
    // BORIS: и где он тут используется, где ссылки, где вызов?
    ArrayList<Integer> list = new ArrayList<>();
    //LinkedHashSet<Integer> list = new LinkedHashSet();
        
        // Пройдиемся по каждому элементу исходного массива и добавим его в LinkedHashSet(???). 
        // Если элемент уже присутствует, LinkedHashSet(?) не добавит его повторно.
        for (int i : a) {
            //list.add(i);
            if(!list.contains(i)) {
                list.add(i);
            }
        }
        
        // После того как все уникальные элементы будут собраны в LinkedHashSet (???), преобразуйте его в массив. 
        // Для этого создайте новый массив нужного размера и скопируйте элементы из LinkedHashSet(?).
        int[] uniqueList = new int[list.size()];
            for (int i =0; i < list.size(); i++) {
                uniqueList[i] = list.get(i);
            }
        // После преобразования LinkedHashSet в массив, верните полученный массив как результат работы метода.
        return uniqueList;
        }      
    }

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Printer {

    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {

            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{1, 2, 2, 3, 4, 4, 5};
        } else {
            a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
        }

        UniqueElements answer = new UniqueElements();
        String itresume_res = Arrays.toString(answer.getUniqueElements(a));
        System.out.println(itresume_res);
    }   
}
