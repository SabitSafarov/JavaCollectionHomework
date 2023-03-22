package homework;

import java.util.*;

public class Task02 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String line = scr.nextLine();
        Map <String, Integer> map = new HashMap<>();
        int count = 1;

        String currentLine = line.replaceAll("\\p{Punct}|\\p{Space}", "");
        String[] array = currentLine.split("");
        List <String> list = new ArrayList<>(List.of(array));

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    count++;
                    j--;
                }
            }
            map.put(list.get(i), count);
            count = 1;
        }

        System.out.println(map);

    }
}
