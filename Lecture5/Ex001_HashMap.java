package Lecture5;

import java.util.HashMap;
import java.util.Map;

public class Ex001_HashMap {

    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.put(1, "один");
        System.out.println(db);
    }
}