package Seminar4HomeWork3;

import java.util.LinkedList;

/**
 * Количество вхождений слова 
 * Реализуйте метод countOccurrences в классе ListUtils, который принимает LinkedList<String> и строку, 
 * и возвращает количество вхождений строки в список.
 */

class ListUtils {
    public static int countOccurrences(LinkedList<String> list, String value) {
        // Напишите свое решение ниже 

        // Чтобы подсчитать, сколько раз строка встречается в LinkedList, нужно пройтись по каждому элементу списка
        // и проверить, равен ли элемент искомой строке. Использукм цикл for для итерации по элементам списка. 
        
        int count = 0;
        // обрабатка случая, когда искомое значение не встречается в списке, счётчик будет равен нулю.

        for(String elem : list){

            // Для сравнения строк используем метод equals(). 
            // Метод позволяет сравнить строку с другим значением и определить, равны ли они. 
            // Внутри цикла сравним текущий элемент списка с искомым значением.
            if(elem.equals(value)) {

                //count - счётчик, который будет увеличиваться каждый раз, когда элемент списка равен искомой строке.
                // Значение счётчика вернём в конце метода
                count++;
            }

            // Убедимся, что метод корректно обрабатывает случай, когда список пуст. В таком случае счётчик будет равен нулю.
        }
        return count;
    }
}
public class Printer {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();
        String value;
        if (args.length < 2) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            list.add("apple");
            list.add("banana");
            list.add("apple");
            list.add("pear");
            list.add("banana");
            value = "apple";
        } else {
            for (int i = 0; i < args.length - 1; i++) {
            list.add(args[i]);
        }
        value = args[args.length - 1];
    }
    ListUtils utils = new ListUtils();
    System.out.println("Occurrences of \"" + value + "\": " + utils.countOccurrences(list, value));
    }
}
