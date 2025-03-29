package Seminar2HomeWork1;

public class URLBuilder {
    public static String buildURL(String BaseURL, String params) {
        
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        String baseURL = "";
        String params = "";
        
        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            baseURL = "https://example.com/search?";
            params = "query=java&sort=desc&filter=null";
        } else {
            baseURL = args[0];
            params = args[1];
        }

        URLBuilder ans = new URLBuilder();
        System.out.println(ans.buildURL(baseURL, params));
    }
}