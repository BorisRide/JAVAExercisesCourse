package Lecture2;

public class StringBild {

    public static void main(String[] args) {
        String str = "";
        for (int i = 0; i < 1_000_000; i++) {
            str += "+";
        }
    }
}