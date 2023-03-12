package hw2;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();
        int n = random.nextInt(11);

        int[] simple = new int[n];
        int sumof = 0;


        for (int i = 0; i < n; i++) {
            simple[i] = random.nextInt(50);
        }

        for (int i = 0; i < simple.length; i++) {
            System.out.print(simple[i] + " ");
        }

        for (int i = 0; i < simple.length; i++) {
            boolean isSimpple = true;
            if ((simple[i] == 2) || (simple[i] == 0)) {
                isSimpple = false;
            }
            for (int j = 2; j < simple[i]; j++) {
//                System.out.println(simple[i] + " " + j);
                if ((simple[i] % j == 0)) {
                    isSimpple = false;
                }
                if (simple[i] == 1) {
                    isSimpple = true;
                }
            }
            if (isSimpple) {
                sumof += simple[i];
            }
        }

        System.out.printf("Сумма простых чисел = %s", sumof);

    }
}
