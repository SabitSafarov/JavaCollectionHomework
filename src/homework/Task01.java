package homework;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {
        Integer[] arrayInts1 = {1, 5, 1, 3, 8, 6};
        Integer[] arrayInts2 = {2, 4, 9, 11, 7, 5};

        Set <Integer> setList1 = new HashSet<>(List.of(arrayInts1));
        Set <Integer> setList2 = new HashSet<>(List.of(arrayInts2));

        setList1.removeAll(setList2);
        System.out.println(setList1);

    }
}