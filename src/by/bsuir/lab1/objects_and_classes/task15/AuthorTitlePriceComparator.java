package src.by.bsuir.lab1.objects_and_classes.task15;

import java.util.Comparator;

import src.by.bsuir.lab1.objects_and_classes.task10.Book;

public class AuthorTitlePriceComparator implements Comparator<Book> {
    private Comparator<Book> comparator;

    public AuthorTitlePriceComparator() {
        comparator = new AuthorTitleComparator().thenComparing(new PriceComparator());
    }

    public int compare(Book book1, Book book2) {
        return comparator.compare(book1, book2);
    }
}
