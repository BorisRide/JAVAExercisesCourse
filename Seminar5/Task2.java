package Seminar5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Дана строка. Необходимо написать метод, который отсортирует слова в строке по длине с помощью TreeMap. 
 * Строки с одинаковой длиной не должны “потеряться”. 
 
 * Пример строки: 
 * Я помню чудное мгновенье Передо мной явилась ты Как мимолетное виденье Как гений чистой красоты
 */
public class Task2 {
    public static void main(final String[] args) {
        String s = "Я помню чудное мгновенье Передо мной явилась ты Как мимолетное виденье Как гений чистой красоты";
        Task2 t = new Task2();
        System.out.println(t.getSortedInludesWord(s));
                
    }

    public String getSortedInludesWord(final String s) {
        if(s == null || s.isEmpty()){
            return null;
        }
        

        // Зададим коллекцию ТриМэп, в котором ключ - длина слова, а значение - массив строк слов с длиной значения ключа
        Map<Integer, List<String>> result = new TreeMap<>();  
        List<String> tempList;
        for(String subWord: s.split(" ")){ //проходим по каждому слову массива "s", разбитому на слова с помощью split'а
            int size = subWord.length();
            if(result.containsKey(size) && !result.get(size).contains(subWord)){
                tempList = result.get(size);
            } else {
                tempList = new ArrayList<>();
            }
            tempList.add(subWord);
            result.put(size, tempList);

        }

        return result.toString();
    }
}
