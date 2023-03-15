package hw3;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class Book {
    private String bookName;
    private String familyAutor;
    private int price;
    private int year;
    private int pages;
}
