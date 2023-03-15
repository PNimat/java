package cw2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        foundSum();
    }


    static void foundSum() {
        System.out.println("Введите числа через пробел");
        Scanner scanner = new Scanner(System.in);
        String myStr = scanner.nextLine();

        List<Integer> myList = makeIntegerList(myStr);

        int sum = 0;
        for (int i = 0; i < myList.size() - 1; i++) {
            if (myList.get(i) % 2 == 0 && myList.get(i + 1) % 10 == 5) {
                sum += myList.get(i + 1);
            }
        }
        System.out.println(sum);
    }


    static List makeIntegerList(String str) {
        List<String> list = Arrays.asList(str.split(" "));
        ArrayList<Integer> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            newList.add(Integer.parseInt(list.get(i)));
        }
        return newList;
    }
}
