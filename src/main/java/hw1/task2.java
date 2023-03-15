package hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.out.println(findSum());
    }

    static int findSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через пробел");
        String str = scanner.nextLine();
        List<String> list = Arrays.asList(str.split(" "));
        List<Integer> newList = new ArrayList<>();

        for (String s : list) {
            newList.add(Integer.parseInt(s));
        }

        int sum = 0;

        for (int i = 0; i < newList.size() - 1; i++) {
            if (newList.get(i) > 0 && newList.get(i + 1) < 0) {
                sum += newList.get(i);
            }
        }

        return sum;
    }
}
