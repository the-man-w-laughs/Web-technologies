package src.by.bsuir.lab1.objects_and_classes.task15;

import java.util.Comparator;

import src.by.bsuir.lab1.objects_and_classes.task10.Book;

public class TitleComparator implements Comparator<Book>{
    public int compare(Book book1, Book book2) {
        return book1.getTitle().compareTo(book2.getTitle());
    }
}
