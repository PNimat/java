package hw4;

import java.util.LinkedList;
import java.util.List;

public class task1 {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);


        for (int i = list.size()-1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    public static void change() {



    }
}
