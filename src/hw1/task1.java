package hw1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println(changeStr());
    }


    static String changeStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напечатайте строку");
        String str = scanner.nextLine();

        List<String> list = Arrays.asList(str.split(" "));
        String result = "";
        for (int i = list.size() - 1; i >= 0; i--) {
            result += list.get(i);
            if (i != 0) {
                result += " ";
            }
        }
        return result;
    }
}
