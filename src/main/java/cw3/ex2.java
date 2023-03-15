package cw3;

import java.util.ArrayList;
import java.util.List;

public class ex2 {
    public static void main(String[] args) {
        Students first = new Students("Петров", 266, 2000, 5);
        Students second = new Students("Сидорова", 267, 3000, 4);
        Students firth = new Students("Баширова", 268, 2500, 5);

        List<Students> students = new ArrayList<>();
        students.add(first);
        students.add(second);
        students.add(firth);


        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFamily().substring(students.get(i).getFamily().length()-3,
                    students.get(i).getFamily().length()).equals("ова") &&
                    (students.get(i).getBall()%2 == 0)){
                System.out.println(students.get(i).getFamily());
            }
        }
    }
}
