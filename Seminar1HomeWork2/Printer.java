class Answer {
    public static void printEvenNums() {
    // Напишите свое решение ниже
    //Задача 2. Вывод всех четных чисел от 1 до 100
    //Напишите метод printEvenNums, который выведет на экран все четные числа в промежутке от 1 до 100, каждое на новой строке.
        int n = 100;
        for(int i = 2; i <= n; i= i + 2){
            System.out.print(i);
            System.out.print("\n");
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        ans.printEvenNums();
    }
}