package cw2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        wantDegree();
    }


    static void wantDegree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();
        System.out.println("Введите степень");
        int degree = scanner.nextInt();
        System.out.println(toDegree(num, degree));
    }


    static int toDegree(int num, int degree) {
        if (degree == 1) {
            return num;
        } else {
            return num * toDegree(num, degree - 1);
        }
    }
}
