package cw1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println(check(makeList())); //Задание 2
    }


    static ArrayList makeList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Ввдите число n ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            list.add((int) (Math.random() * 20 - 10));
        }

        System.out.println(list);
        return list;
    }


    static int check(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if ((list.get(i + 1) < 0) && (list.get(i) > 0)) {
                sum += list.get(i);
            }
        }
        return sum;
    }
}
