package Seminar5HomeWork;

import java.util.Deque;
import java.util.LinkedList;

/**
 * История посещения веб-сайтов
 * Реализуйте программу для хранения и анализа историй посещений веб-сайтов.
 * Используйте Deque для хранения истории.
 * 
 * ● visitSite(String site): Добавляет сайт в историю посещений.
 * 
 * ● back(int steps): Возвращает название сайта, который был посещен steps назад, или null, если таких шагов нет.
 * 
 * ● getHistory(): Возвращает список сайтов в истории посещений, от последнего посещенного к первому.
 * 
 */

class BrowserHistory {
    // Напишите свое решение ниже
    private Deque<String> bHistory = new LinkedList<>(); 

    //Добавляет сайт в историю посещений.
    public void visitSite(String site) {
                
        //Для добавления сайта в историю посещений используем метод addFirst из Deque.
        //Это добавит сайт в начало очереди, что позволит  хранить самые последние посещенные сайты в начале истории.
        bHistory.addFirst(site);
    }
    
    //Возвращает название сайта, который был посещен steps назад, или null, если таких шагов нет.
    public String back(int steps) {
            
        // Для возвращения к сайту, который был посещен steps назад, используйте метод stream вместе со skip и findFirst из Deque. 
        //Метод stream создаст поток элементов из очереди, skip пропустит первые steps элементов, а findFirst вернет первый
        //оставшийся элемент или null, если шагов больше, чем элементов в очереди.
        if (steps >= bHistory.size()) {
            return null;
        }
        return bHistory.stream().skip(steps).findFirst().orElse(null);    
    }
    
    //Возвращает список сайтов в истории посещений, от последнего посещенного к первому
    public Deque<String> getHistory() {
       
        //Метод getHistory должен просто вернуть сам Deque, который уже содержит историю посещений в нужном порядке 
        // — от последнего посещенного к первому.
        return bHistory;
    }

}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Printer2 {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.visitSite("google.com");
        browserHistory.visitSite("stackoverflow.com");
        browserHistory.visitSite("github.com");
        System.out.println(browserHistory.back(1));
        System.out.println(browserHistory.getHistory());
    }
}    
