package hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ex2 {
    public static void main(String[] args) {
        Goods car = new Goods("BMW", "Germany", 2000.3, 2000000, "Высший");
        Goods fridge = new Goods("Indesit", "Great Britain", 40.5, 50000, "Высший");
        Goods coffemachine = new Goods("Nescafe", "USA", 2.5, 15000, "Второй сорт");
        Goods something = new Goods("Name", "Country", 3.2, 15000, "Второй сорт");

        List<Goods> goods = new ArrayList<>();
        goods.add(car);
        goods.add(fridge);
        goods.add(coffemachine);
        goods.add(something);

        int minPrise = goods.get(0).getPrise();

        for (int i = 0; i < goods.size(); i++) {
            if ((goods.get(i).getGrade().toLowerCase(Locale.ROOT).contains("второй"))
                    && (goods.get(i).getPrise() < minPrise)) {
//                System.out.println(goods.get(i).getName());
                minPrise = goods.get(i).getPrise();
            }
        }

        for (int i = 0; i < goods.size(); i++) {
            if (goods.get(i).getGrade().toLowerCase(Locale.ROOT).contains("второй"))
//                    && (goods.get(i).getPrise() == minPrise)) {
                System.out.println(goods.get(i).getName());
            }
        }
    }
