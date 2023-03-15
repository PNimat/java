package cw2;

import model.Vector;

public class ex4 {
    public static void main(String[] args) {

        Vector vector1 = new Vector(1.9,1.9,1.9);
        Vector vector2 = new Vector(1.2,1.2,1.2);
//
//        System.out.println(vector1.length());
//        System.out.println(vector2.length());

        System.out.println("Произведение векторов " + vector1.sumOfVec(vector2));
        System.out.println("Разность векторов " + vector1.difOfVec(vector2));

//        System.out.println(vector.toString());
    }
}
