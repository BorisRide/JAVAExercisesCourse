/**
 * Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
String s1 = "hello";
String s2 = "hello";
String s3 = s1;
String s4 = "h" + "e" + "l" + "l" + "o";
String s5 = new String("hello");
String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
 */
package Seminar3;

public class Task0 {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        //сравниваем значения переменных оператором равенства ==, если равно, то "true", если не равно - "false"
        System.out.println(s1 == s2); //true, ссылки на разные объекты одинаковы (!) значение хранится в одном месте
        System.out.println(s1 == s3); //true
        System.out.println(s1 == s4); //true
        System.out.println(s1 == s5); //false, сравниваются разные объекты с разными ссылками (оператор new String "насильно" создаёт новую ссылку)
        System.out.println(s1 == s6); //false

        //Вывод - сравнивать оператором равенства можно только ПРИМИТИВЫ, а не ОБЪЕКТЫ!

        //сравниваем значения переменных оператором equals, если равно, то "true", если не равно - "false"
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //true
        System.out.println(s1.equals(s4)); //true
        System.out.println(s1.equals(s5)); //true
        System.out.println(s1.equals(s6)); //true
        }
}