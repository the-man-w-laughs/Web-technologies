package src.by.bsuir.lab1.objects_and_classes.task15;

import java.util.Comparator;

import src.by.bsuir.lab1.objects_and_classes.task10.Book;

public class AuthorTitleComparator implements Comparator<Book> {

    private Comparator<Book> comparator;

    public AuthorTitleComparator() {
        comparator = new AuthorComparator().thenComparing(new TitleComparator());
    }

    public int compare(Book book1, Book book2) {
        return comparator.compare(book1, book2);
    }
}