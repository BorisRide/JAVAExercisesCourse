import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task1 {

    /**
     * Даны два Deque представляющие два неотрицательных целых числа. 
     * Цифры хранятся в обратном порядке, и каждый из их узлов содержит одну цифру.
     * Сложите два числа и верните сумму в виде связанного списка.
     * 
     * Первое число 321, второе 745
     * 
     */
    public static void main(String[] args) {
        Deque<Integer> dequeOne = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> dequeTwo = new ArrayDeque<>(Arrays.asList(5,4,7));
        //result [6,6.0,1]
        Task1 task1 = new Task1();
        System.out.println(task1.sum(dequeOne, dequeTwo).toString());

    }

    public Deque<Integer> sum(Deque<Integer> dequeOne, Deque<Integer> dequeTwo) {
        if (dequeOne == null || dequeTwo == null) {
            throw new IllegalStateException();
        }    
        Deque<Integer> result = new ArrayDeque<>();
        int digit = 0;
        while (dequeOne.size() > 0 || dequeTwo.size() > 0) {
            int sum = 0 + digit;
            digit = 0;
            if(dequeOne.size() > 0) {
                sum = sum + dequeOne.poll();
            }
            if(dequeTwo.size() > 0) {
                sum = sum + dequeTwo.poll();
            }
            if(sum > 9) {
                digit = 1;
                sum = sum - 10;
            }
            result.offer(sum);
        }
        if(digit!=0){
            result.offer(digit);
        }

        return result;
    }
}
