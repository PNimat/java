package cw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        items items = new items("Нефть", "Россия", 10.0);
        items items2 = new items("Пшеница", "Украина", 11.9);
        items items3 = new items("Газ", "Азербайджан", 3.4);
        items items4 = new items("Картошка", "Беларусь", 5.0);


        List<items> itemsList = new ArrayList<>();
        itemsList.add(items);
        itemsList.add(items2);
        itemsList.add(items3);
        itemsList.add(items4);

        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();

        int sumVolume = 0;
        List<String> country = new ArrayList<>();
        for (int i = 0; i < itemsList.size(); i++) {
//            System.out.println("here");
            if (itemsList.get(i).getCountry().equals(searchName)){
                System.out.println(itemsList.get(i).getName());
            }
        }

    }
}
