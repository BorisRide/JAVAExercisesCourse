package Seminar2HomeWork1;
/**
* Дана строка базового URL: https://example.com/search?
Сформировать полный URL, добавив к нему параметры для поиска. 
Параметры передаются в виде строки, где ключи и значения разделены =, а пары ключ-значение разделены &. 
Если значение null, то параметр не должен попадать в URL.
Пример:
params = "query=java&sort=desc&filter=null"
Результат:
https://example.com/search?query=java&sort=desc
*/

class URLBuilder {
    public static String buildURL(String baseURL, String params) {
        StringBuilder fullURL = new StringBuilder(baseURL);
         //Разделим строку параметров на части, используя символ & в качестве разделителя
        String[] partsParams = params.split("&"); 
        
        for (int i = 0; i < partsParams.length; i++) {
            //Для каждой строки, представляющей пару "ключ=значение", разделим её на ключ и значение с помощью символа =.
            String[] keyPartParams = partsParams[i].split("=");
            
            //если значение после символа = равно "null". этот параметр не добавляется к итоговому URL
            if(!"null".equals(keyPartParams[1])) {
                if(i > 0) {
                    fullURL.append("&");
                }
            fullURL.append(keyPartParams[0]) .append('=') .append(keyPartParams[1]);
            }
                        
        }
        return fullURL.toString();
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
            params = "query=java&sort=null&filter=desc";
        } else {
            baseURL = args[0];
            params = args[1];
        }

        URLBuilder ans = new URLBuilder();
        System.out.println(ans.buildURL(baseURL, params));
    }
}