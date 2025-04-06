package Seminar4HomeWork1;

/**
 * Удаление нечетных строк 
 * Дан LinkedList с несколькими элементами. 
 * В методе removeOddLengthStrings класса LLTasks реализуйте удаление строк, 
 * длина которых нечетная. Используйте LinkedList и стандартные методы.
 * 
 * Пимер массива
 * LinkedList<String> ll = new LinkedList<>('apple','banana','pear','grape'); 
 * 
 */

 import java.util.LinkedList;

 class LLTasks {
    public static void
    removeOddLengthStrings(LinkedList<String> ll) {

        // Поскольку мы не можем изменять LinkedList прямо в цикле, создадим временный список, 
        // чтобы сохранить строки, которые нужно удалить (почему бы не сохранить строки, которые надо оставить?).
        LinkedList<String> result = new LinkedList<>();

        //Для удаления строк с нечетной длиной, переберем все элементы LinkedList, используем цикл for-each
        for(String s : ll ){

            //Для проверки длины строки, используем метод length(). 
            //Чтобы узнать, является ли длина строки нечетной, используем оператор остатка от деления %.
            if(s.length()%2 > 0){

                // Внутри цикла добавляйте строки, которые удовлетворяют условию нечетной длины, во временный список.
                result.add(s);
            }            
        }
        // После того как мы собрали все строки, которые нужно удалить, используем метод removeAll 
        // для удаления этих строк из оригинального LinkedList.
        ll.removeAll(result);

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Printer {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            ll.add("apple");
            ll.add("banana");
            ll.add("pear");
            ll.add("grape");
        } else {
            for (String arg : args) {
                ll.add(arg);
            }
        }       
        LLTasks answer = new LLTasks();
        System.out.println(ll);
        answer.removeOddLengthStrings(ll);
        System.out.println(ll);
    }
}