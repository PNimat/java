package hw4;

import javax.swing.*;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        String mainString = "(){}[]";


        Scanner scanner = new Scanner(System.in);
        System.out.println("add str");
        String add = scanner.nextLine();

        System.out.println(mainString.contains(add));

    }
}
