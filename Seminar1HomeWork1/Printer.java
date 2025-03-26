class Answer {
    public int factorial(int n) {
        // Введите свое решение ниже
        // Напишите метод factorial, который принимает число n и возращает его факториал. Если n < 0, метод должен вернуть -1
    
        int result = 1;
        if(n > 0) {
            for(int i = 1; i <= n; i++){
            result = result * i;
            }
        }
        if(n < 0) {
            result = -1;
        }
        return (result);
    }
}
    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public class Printer {
    public static void main(String[] args) {
        int n = 5;

        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }

        // Вывод результата на экран
        Answer ans = new Answer();
        int itresume_res = ans.factorial(n);
        System.out.println(itresume_res);
    }
}
