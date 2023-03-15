package hw3;

import java.text.Format;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

public class Ex3 {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Толстой", 400, 1867, 1300);
        Book book2 = new Book("Евгейий Онег", "Пушкин", 350, 1823, 272);
        Book book3 = new Book("абвгд", "Автор", 1234, 2011, 1111);
        Book book4 = new Book("asdf", "автор", 1234, 2010, 1111);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        List<String> result = new ArrayList<>();


        for (int i = 0; i < books.size(); i++) {
            if (isNumSimple(books.get(i).getPages())
                    || (books.get(i).getFamilyAutor().toLowerCase(Locale.ROOT).contains("а"))
                    || (books.get(i).getYear() > 2009))
            {
                result.add(books.get(i).getBookName());
            }
        }

        System.out.println("Список авторов:");

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static Boolean isNumSimple(int num) {
        boolean result = true;
        if (num == 1) {
            return false;
        }
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                result = false;
            }
        }
        return result;
    }
}



