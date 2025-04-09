package Seminar5;

import java.util.HashMap;
import java.util.Map;


/**
 * Вам дан массив путей, где пути[i] = [”Город А”, “Город Б”] означают, что существует прямой путь, идущий от ”Город А” до“Город Б”. 
 * Верните город назначения, то есть город без какого-либо пути, ведущего в другой город. 
 * 
 * Пример: [["Москва","Самара"],["Курск","Пенза"],["Самара","Курск"]] 
 * Результат: Пенза
 */
public class Task1 {
    public static void main(final String[] args) {
        Map<String, String> path = new HashMap<>();
        path.put("Москва", "Самара");
        path.put("Курск", "Пенза");
        path.put("Самара", "Курск");

        Task1 t = new Task1(); //объявляем t как объект Task1
        System.out.println(t.getFinalCity(path));
        
    }

    public String getFinalCity(Map<String, String> path) {
        for(String end: path.values()) { //проходим по всем значениям значений ХэшМэпа path
            if(!path.containsKey(end)) { //если значение значений (end) не содержится в списке ключей, то это искомый город
                return end;
            }
        }

        return null;
        
    }
}
