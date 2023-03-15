package hw2;

public class task4 {
    public static void main(String[] args) {
        int[] mass = {10, -2, 10, 10, -2};
        int[] newMass = new int[mass.length];


        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > 9 && mass[i] < 100) {
                sum += mass[i];
            }
        }

        for (int i = 0; i < newMass.length; i++) {
            if (mass[i] >= 0) {
                newMass[i] = mass[i];
            } else {
                newMass[i] = sum;
            }
        }

        for (int i = 0; i < newMass.length; i++) {
            System.out.print(newMass[i] + " ");
        }
    }
}
