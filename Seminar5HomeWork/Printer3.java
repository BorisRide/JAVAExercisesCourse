package Seminar5HomeWork;

/**
 * Подсчет продуктов в корзине
 * Создайте программу для учета продуктов в корзине. Программа должна позволять добавлять, удалять, 
 * обновлять количество продуктов, а также проверять наличие продуктов в корзине. 
 * Используйте HashMap для хранения продуктов и их количества.
 * 
 * Методы:
 * 
 * ● addProduct(String product, Integer quantity): 
 * Добавляет продукт с указанным количеством в корзину. Если продукт уже есть, увеличивает его количество.
 * 
 * ● removeProduct(String product): Удаляет продукт из корзины. Еслипродукт отсутствует, ничего не делает.
 * 
 * ● updateQuantity(String product, Integer quantity): 
 * Обновляет количество продукта в корзине. Если продукта нет, ничего не делает.
 * 
 * ● checkProduct(String product): 
 * Проверяет, есть ли продукт в корзине и возвращает его количество. Если продукта нет, возвращает 0.
 * 
 * ● showBasket(): Выводит все продукты и их количество в корзине.
 * 
 */

import java.util.HashMap;

class ShoppingBasket {

    private HashMap<String, Integer> basket = new HashMap<>();
    
    //Добавляет продукт с указанным количеством в корзину. Если продукт уже есть, увеличивает его количество.
    public void addProduct(String product, Integer quantity) {
    //Для добавления продукта в корзину и обновления его количества используйте метод put класса HashMap. 
    //Если продукт уже присутствует в корзине, вам нужно увеличить его количество. 
    //Если нет — добавьте продукт с указанным количеством.
        if (basket.containsKey(product)) {
            basket.put(product, basket.get(product) + quantity);
            } else {
            basket.put(product, quantity);
        }
    }

    //Удаляет продукт из корзины. Еслипродукт отсутствует, ничего не делает.
    public void removeProduct(String product) {
    // Чтобы удалить продукт из корзины, используйте метод remove класса HashMap. Он удаляет запись по указанному ключу. 
    //Если продукт отсутствует в корзине, ничего не произойдет.
    if (basket.containsKey(product)) {
        basket.remove(product);
        }
    }
    
    //Обновляет количество продукта в корзине. Если продукта нет, ничего не делает.
    public void updateQuantity(String product, Integer quantity) {
    //Для обновления количества продукта, который уже есть в корзине, используйте метод put с новым значением количества. 
    //Если продукт отсутствует, обновление не произойдет, поэтому сначала проверьте наличие продукта с помощью метода containsKey.
        if (basket.containsKey(product)) {
            basket.put(product, quantity);
            }
        }
    
    //Проверяет, есть ли продукт в корзине и возвращает его количество. Если продукта нет, возвращает 0
    public int checkProduct(String product) {
    // Метод checkProduct должен возвращать количество продукта, если он присутствует в корзине, и 0, если нет. 
    // Используйте метод getOrDefault класса HashMap для этой задачи.
        return basket.getOrDefault(product, 0); // Верните фактическое количество
    }
    
    //Выводит все продукты и их количество в корзине
    public void showBasket() {
    // Метод showBasket должен вывести все продукты и их количество в корзине. 
    // Используйте метод entrySet класса HashMap, чтобы получить набор пар ключ-значение, и затем пройдитесь по нему в цикле.
        if (basket.isEmpty()) {
            System.out.println("Basket is empty.");
        } else {
        for (HashMap.Entry<String, Integer> entry : basket.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

// Не удаляйте и не меняйте метод Main!
public class Printer3 {
    public static void main(String[] args) {
        String product1, product2, product3;
        Integer quantity1, quantity2, quantity3;
        if (args.length == 0) {
            product1 = "apple";
            quantity1 = 3;
            product2 = "banana";
            quantity2 = 2;
            product3 = "apple";
            quantity3 = 5;
        } else {
        product1 = args[0];
        quantity1 = Integer.parseInt(args[1]);
        product2 = args[2];
        quantity2 = Integer.parseInt(args[3]);
        product3 = args[4];
        quantity3 = Integer.parseInt(args[5]);
        }
        ShoppingBasket basket = new ShoppingBasket();
        basket.addProduct(product1, quantity1);
        basket.addProduct(product2, quantity2);
        basket.addProduct(product3, quantity3);
        System.out.println("Basket after adding products:");
        basket.showBasket();
        basket.removeProduct("banana");
        System.out.println("Basket after removing 'banana':");
        basket.showBasket();
        basket.updateQuantity("apple", 10);
        System.out.println("Basket after updating quantity of 'apple':");
        basket.showBasket();
        System.out.println("Quantity of 'apple': " + basket.checkProduct("apple"));
        System.out.println("Quantity of 'banana': " + basket.checkProduct("banana"));
    }
}
   