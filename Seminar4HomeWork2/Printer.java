package Seminar4HomeWork2;

/**
 * Реализация стека
 * Реализуйте MyStack с использованием LinkedList с методами:
 *● push(String element) - добавляет элемент на вершину стека
 *● pop() - возвращает элемент с вершины и удаляет его
 *● peek() - возвращает элемент с вершины, не удаляя
 *● getElements() - возвращает все элементы стека
 */
import java.util.LinkedList;

class MyStack {
    // Напишите свое решение ниже
    // Создадим поле LinkedList<String> stack внутри класса MyStack, чтобы хранить элементы стека. 
    // Это поле будет использоваться для хранения и управления элементами стека.
    private LinkedList<String> stack = new LinkedList<>();

    public void push(String element) {
            // Напишите свое решение ниже
            // Чтобы реализовать стек с использованием LinkedList, для добавления элемента на вершину стека используем метод addFirst()
            // метод addFirst() вставляет элемент в начало списка, что соответствует вершине стека.
            stack.addFirst(element);

    }
    public String pop() {
            // Напишите свое решение ниже
            // Для удаления элемента с вершины стека и его возврата, используем метод removeFirst() класса LinkedList.
            // Метод удаляет и возвращает элемент из начала списка, что соответствует удалению элемента с вершины стека.
            return stack.removeFirst();
    }

    public String peek() {
            // Напишите свое решение ниже
            // Чтобы вернуть элемент с вершины стека, не удаляя его, используем метод peekFirst() класса LinkedList.
            // Метод возвращает первый элемент в списке, не удаляя его, что соответствует методу peek в стеке.
            return stack.peekFirst();
    }
    public LinkedList<String> getElements() {
            // Напишите свое решение ниже
            // 
            return new LinkedList<>(stack);
    }   
    
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Printer {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            stack.push("apple");
            stack.push("banana");
            stack.push("pear");
            stack.push("grape");
        } else {
for (String arg : args) {
stack.push(arg);
}
}
            System.out.println(stack.getElements());
            System.out.println(stack.pop());
            System.out.println(stack.getElements());
            System.out.println(stack.peek());
    }       
}