package Seminar2HomeWork3;
/**
 * Удаление пустых строк из текста
Дана строка с несколькими строками текста, разделенными переводами строки.
Напишите метод, который удаляет все пустые строки из текста.
 */
class TextCleaner {
    public static String removeEmptyLines(String text) {
        // Используем метод split("\n"), чтобы разбить исходный текст на массив строк по символу перевода строки. 
        // Это позволит  обработать каждую строку отдельно
        String[] lines = text.split("\n");
        //Используем StringBuilder для формирования итоговой строки
        StringBuilder cleanedText = new StringBuilder();
        // Проходим по массиву строк, используем метод trim() для проверки, является ли строка пустой 
        // т.е. состоит только из пробельных символов. Если строка не пуста, добавляем ее в результирующую строку.
        for (String line : lines) {
            if (!line.trim().isEmpty()) {
                if (cleanedText.length() > 0) {
                cleanedText.append("\n");
                }
            cleanedText.append(line);
            }
        }
        //возвращаем результат в виде строки, метод toString() в StringBuilder.
        return cleanedText.toString();
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        String text = "";

        if (args.length == 0) {
// При отправке кода на Выполнение, вы можете варьировать эти параметры
            text = "line1\n\nline2\n\nline3";
            System.out.println("исходный текст:");
            System.out.println(text);
            System.out.println("обработка:");
        } else {
            text = args[0];
        }

        TextCleaner ans = new TextCleaner();
        System.out.println(ans.removeEmptyLines(text));
    }
}
