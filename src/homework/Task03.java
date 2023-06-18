package homework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task03 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Set <Integer> setList1 = new HashSet<>();
        Set <Integer> setList2 = new HashSet<>();

        int tmp1;
        System.out.println("Введите количество чисел первого набора: ");
        int count1 = scr.nextInt();

        System.out.println("Введите числа для первого набора: ");
        for (int i = 0; i < count1; i++) {
            tmp1 = scr.nextInt();
            setList1.add(tmp1);
        }

        int tmp2;
        System.out.println("Введите количество чисел второго набора: ");
        int count2 = scr.nextInt();

        System.out.println("Введите числа для второго набора: ");
        for (int i = 0; i < count2; i++) {
            tmp2 = scr.nextInt();
            setList2.add(tmp2);
        }

        setList1.retainAll(setList2);
        System.out.println(setList1);
    }
}
