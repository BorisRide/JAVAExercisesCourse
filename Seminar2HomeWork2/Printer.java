package Seminar2HomeWork2;

/**
 * Создание CSV-строки из массива объектов
Дан массив объектов, где каждый объект представляет собой строку данных, и массив заголовков. 
Создайте строку CSV, где строки данных разделяются новой строкой, а значения в строках разделяются запятыми
Пример:
String[] headers = {"Name", "Age", "City"};
String[][] data = {
{"John", "30", "New York"},
{"Alice", "25", "Los Angeles"},
{"Bob", "35", "Chicago"}
};
Результат:
Name,Age,City
John,30,New York
Alice,25,Los Angeles
Bob,35,Chicago
 */
class CSVGenerator {
    public static String generateCSV(String[] headers, String[][] data) {
        StringBuilder csv = new StringBuilder();

        // Добавьте заголовки в начало строки, затем добавьте строки данных. 
        // Убедитесь, что в конце строки нет лишнего перевода строки. 
        // используем StringBuilder для эффективного формирования строки CSV.
        
        // Добавление заголовков
        // Используем метод String.join(), чтобы объединить элементы массива заголовков, разделенные запятыми. 
        // Это создаст первую строку CSV-файла, которая будет содержать заголовки.
        csv.append(String.join(",", headers)) .append("\n");

        // Добавление даных
        // Для каждой строки используем метод String.join() для объединения элементов строки, разделенных запятыми. 
        // добавить перевод строки после каждой строки данных
        for (String[] row : data) {
            csv.append(String.join("," , row)) .append(("\n"));
        }
       
        // После формирования всей строки CSV, последняя новая строка может быть лишней.
        // Используйте метод trim() для удаления последнего символа новой строки из итоговой строки CSV.
        return csv.toString() .trim();
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        String[] headers = {};
        String[][] data = {};

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            headers = new String[]{"Name", "Age", "City"};
            data = new String[][] {
            {"John", "30", "New York"},
            {"Alice", "25", "Los Angeles"},
            {"Bob", "35", "Chicago"}
            };
        } else {
            // Преобразование строковых параметров в массивы
            // Пример обработки данных можно дополнить в зависимости от формата args
        }   
        CSVGenerator ans = new CSVGenerator();
        System.out.println(ans.generateCSV(headers, data));
    }
}
