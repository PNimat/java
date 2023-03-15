package hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ex1 {
    public static void main(String[] args) {
        Goods myka = new Goods("GreatMyka", 99, "Высший сорт");
        Goods smetana = new Goods("GreatSmetana", 87, "2 сорт");
        Goods milk = new Goods("GreatMilk", 110, "Высший сорт");

        List<Goods> goods = new ArrayList<>();
        goods.add(myka);
        goods.add(smetana);
        goods.add(milk);

        System.out.println(foundTheGreatPrice(goods));
    }

    public static int foundTheGreatPrice(List<Goods> goods) {

        int maxPrice = goods.get(0).getPrise();

        for (int i = 0; i < goods.size(); i++) {
            if (goods.get(i).getGrade().toLowerCase(Locale.ROOT).contains("высший")
                    && (goods.get(i).getPrise() > maxPrice)) {
                maxPrice = goods.get(i).getPrise();
            }
        }
        return maxPrice;

    }


}
