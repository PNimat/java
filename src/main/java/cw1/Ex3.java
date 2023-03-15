package cw1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println(changeString()); //Задание 3
    }


    static String changeString() {
        Scanner scanner = new Scanner(System.in);
        String myStr = scanner.nextLine();
//        List<String> list = Arrays.asList(myStr.split(" "));
//
//        int mean = list.size() / 2;
//        String newStr = new String();
//        for (int i = mean; i < list.size(); i++) {
//            newStr += list.get(i) + " ";
//        }
//        for (int i = 0; i < mean; i++) {
//            newStr += list.get(i) + " ";
//        }
//        return newStr;

        String s1 = myStr.substring(0, myStr.length() / 2);
        String s2 = myStr.substring(myStr.length() / 2);
        return (s2 + s1);
    }
}
