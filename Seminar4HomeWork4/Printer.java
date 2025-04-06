package Seminar4HomeWork4;

/**
 * Сдвиг очереди 
 * Реализуйте метод rotateDeque в классе DequeTasks, который принимает Deque<Integer> и число n. 
 * Метод должен повернуть очередь вправо на n позиций. Если n отрицательное, повернуть влево.
 */

 import java.util.Deque;
 import java.util.LinkedList;

 class DequeTasks {
    public static void rotateDeque(Deque<Integer> deque, int n) {

        if (deque.isEmpty()) return; // проверка на null

        int size = deque.size();

        // Уйдём от лишних циклов вращения. Поскольку очередь может быть вращена на большее количество позиций, чем её размер, 
        // сначала упростим значение n, используя остаток от деления на размер очереди (n % size). 
        n = n % size;

        //Используем цикл, чтобы повторить операцию добавления и удаления элемента из очереди n раз, 
        // где n — количество позиций, на которые нужно вращать очередь.
        if (n < 0) {
            //Если n отрицательное, преобразуем его в эквивалентное положительное значение для вращения вправо. 
            // Например, если n равно -3 и размер очереди size равен 5, то вам нужно добавить size к n, 
            // чтобы получить эквивалентное положительное значение вращения.
            n += size;
        }
        for (int i = 0; i < n; i++) {
            //Для вращения очереди вправо на n позиций используем метод addLast для добавления элемента в конец очереди
            // и removeFirst для удаления элемента из начала очереди. 
            // Если n отрицательное, это означает, что нужно вращать влево.
            deque.addLast(deque.removeFirst());
        }
        System.out.println(deque);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        int n;
        if (args.length < 1) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            deque.add(1);
            deque.add(2);
            deque.add(3);
            deque.add(4);
            n = -1;
        ;
        } else {
            for (int i = 0; i < args.length - 1; i++) {
            deque.add(Integer.parseInt(args[i]));
        }
            n = Integer.parseInt(args[args.length - 1]);
        }
        System.out.println(deque);
        System.out.println(n);
        DequeTasks.rotateDeque(deque, n);
    }
}