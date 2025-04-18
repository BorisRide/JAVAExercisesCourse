/**
 * Java: знакомство и как использовать базовый API. 
 * Обучение в записи
 * 
 * Промежуточная аттестация
 * 
 * Задание 1. Поиск ноутбуков 
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
 * -Создать множество ноутбуков.
 * -Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, 
 * отвечающие фильтру. Критерии фильтрации можно хранить в Map.
 * 
 * Например:
 * Введите цифру, соответствующую необходимому критерию: 
 * 1 - ОЗУ 
 * 2 - Объем ЖД 
 * 3 - Операционная система
 * 4 - Цвет …
 * 
 * -Далее нужно запросить минимальные значения для указанных критериев -сохранить параметры фильтрации можно также в Map.
 * -Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */

package Sertificationcourse;

import java.util.Objects;

public class Laptop {
   //Каждый ноутбук имеет определенные характеристики. 
    //Определяем, какие поля нужны для хранения информации о ноутбуке. 
    //Понадобиться поля для объема оперативной памяти, жесткого диска, операционной системы и цвета и ещё нескольких.

    // private String name = new String(); // марка //УБРАТЬ/ОСТАВИТЬ ПОСЛЕ ТЕСТИРОВАНИЯ
    // private String firm = new String(); // фирма-изготовитель ////УБРАТЬ/ОСТАВИТЬ ПОСЛЕ ТЕСТИРОВАНИЯ
    private int ram; // ram = ОЗУ, размер в Гб
    private int hardDrive; // hardDrive = жесткий диск, объём диска в Гб
    private String oS = new String(); // oS = операционная система, тип
    //УБРАТЬ ПОСЛЕ ТЕСТИРОВАНИЯ private String oS;
    private String color = new String(); // color = цвет
    //УБРАТЬ ПОСЛЕ ТЕСТИРОВАНИЯ rivate String color;     

    public Laptop(int ram, int hardDrive, String oS, String color) {
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.oS = oS;
        this.color = color;

    }

    //Создадим конструктор для инициализации полей и методы для получения значений этих полей.
    //С его помощью будем создавать и управлять объектами класса Laptop.

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hardDrive;
    }

    public String getOs() {
        return oS;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "module6.Laptop{" + 
        "RAM=" + ram + " GB" + 
        ", HDD=" + hardDrive + " GB" + 
        ", OS=" + oS + '\'' + 
        ", Color=" + color + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return ram == laptop.ram && hardDrive == laptop.hardDrive && oS.equals(laptop.oS) && color.equals(laptop.color);
    }
    @Override
    public int hashCode() {
    return Objects.hash(ram, hardDrive, oS, color);
    }
}

        
        // Создадим меню, позволяющее пользователю выбирать критерии фильтрации. 
        // Используем Scanner для ввода данных от пользователя.
        
        // Используем Map для хранения выбранных пользователем критериев фильтрации и их значений. 
        // Это облегчит работу с фильтрами при отборе ноутбуков.

        //Создадим метод для фильтрации ноутбуков. В этом методе будем проверять, 
        //соответствуют ли ноутбуки критериям фильтрации, и выводите те, которые проходят отбор.

        //После каждого выбора критерия спросим у пользователя, хочет ли он добавить еще один критерий. 
        //Используем цикл while для продолжения запроса до тех пор, пока пользователь не закончит ввод.
        