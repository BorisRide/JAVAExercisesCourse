public class FourMain {
    public static void main(String[] args) {
        String s = "Добро пожаловать на курс по Java";
        String[] array = s.split(" ");
        for(int i = array.length -1; i>=0; i--){
            System.out.print(array[i] + " ");
        }

        }
}