class Answer {
    public int sumDigits(int n) {
    // Введите свое решение ниже
    //Задача 3. Подсчет суммы цифр числа
    //Напишите метод sumDigits, который принимает целое число n и возвращает сумму его цифр.
    int summ = 0;
        while (n != 0) {
            summ = summ + n % 10;
            n = n / 10;
        }
        return summ;
    }
}
    
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        int n = 12345;

        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }

        // Вывод результата на экран
        Answer ans = new Answer();
        int itresume_res = ans.sumDigits(n);
        System.out.println(itresume_res);
    }
}