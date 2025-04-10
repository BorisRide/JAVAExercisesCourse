package Seminar5HomeWork;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * Студенческий справочник
 * 
 * Реализуйте программу для работы с простым справочником студентов.
 * Программа должна иметь следующие функции:
 * 
 * ● addStudent(String name, Integer grade): 
 * Добавляет или обновляет запись о студенте с именем name и оценкой grade. 
 * Если студент уже существует, обновляет его оценку.
 * 
 * ● findStudent(String name): 
 * Находит оценки студента по его имени. Если студент существует, возвращает список его оценок. Если нет — пустой список.
 * 
 * ● getAllStudents(): 
 * Возвращает весь справочник студентов в виде HashMap, где ключи — имена студентов, а значения — списки их оценок.
 * 
 * ● removeStudent(String name): 
 * Удаляет запись о студенте по имени из справочника. Если запись не существует, ничего не происходит.
 * 
 */

class StudentDirectory {
    private HashMap<String, ArrayList<Integer>> studentMap = new HashMap<>();

    // Добавляет или обновляет запись о студенте
    public void addStudent(String name, Integer grade) {
        // Напишите свое решение ниже

            //Для добавления или обновления записи о студенте используем метод computeIfAbsent из HashMap. 
            //Этот метод позволяет вам создать новую запись в словарь, если ключ еще не существует, 
            //и затем добавить оценку в список оценок студента.
        studentMap.computeIfAbsent(name, k -> new ArrayList<>()).add(grade);
            
            //Поскольку вы не можете изменять LinkedList прямо в цикле, создайте временный список, 
            //чтобы сохранить строки, которые нужно удалить.
        }
            
    // Находит оценки студента по имени
    public ArrayList<Integer> findStudent(String name) {
        // Напишите свое решение ниже

        //Чтобы найти оценки студента по имени, используйте метод getOrDefault из HashMap
        //Этот метод вернет список оценок для указанного студента, если он существует
        //или пустой список, если студента нет в справочнике.
        return studentMap.getOrDefault(name, new ArrayList<>());
    }
    
    // Возвращает весь справочник студентов
    public HashMap<String, ArrayList<Integer>> getAllStudents(){
        // Напишите свое решение ниже

        //Для получения всех записей справочника вернём HashMap. Он уже содержит все записи.
        return studentMap;
    }

    // Удаляет запись о студенте по имени
    public void removeStudent(String name) {
        // Напишите свое решение ниже

        //Для удаления записи о студенте используйте метод remove из HashMap. 
        //Этот метод удаляет запись, если она существует, и ничего не делает, если запись отсутствует.
        studentMap.remove(name);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public class Printer1 {
    public static void main(String[] args) {

        StudentDirectory directory = new StudentDirectory();
    
        directory.addStudent("Alice", 90);
        directory.addStudent("Bob", 85);
        directory.addStudent("Alice", 95);
        
        System.out.println("Before removal:");
        System.out.println(directory.findStudent("Alice")); // [90, 95]
        System.out.println(directory.getAllStudents()); //          {Bob=[85], Alice=[90, 95]}
        
        directory.removeStudent("Alice");
    
        System.out.println("After removal:");
        System.out.println(directory.findStudent("Alice")); // []
        System.out.println(directory.getAllStudents()); //          {Bob=[85]}
    }
}    
