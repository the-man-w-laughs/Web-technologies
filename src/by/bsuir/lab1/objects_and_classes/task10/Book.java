package src.by.bsuir.lab1.objects_and_classes.task10;

public class Book implements Cloneable, Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    public int isbn;

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPrice() {
        return this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Book book = (Book) o;

        return book.author == this.author && book.title == this.title;
    }

    @Override
    public String toString() {
        return "Автор: " + this.author + ", название: " + this.title + " издание: " + Book.edition + ", цена: "
                + this.price + ".";
    }

    @Override
    public int hashCode() {
        return (this.author + this.title).hashCode();
    }

    public Book clone() {
        Book book = new Book();
        book.author = this.author;
        book.price = this.price;
        book.title = this.title;
        return book;
    }

    public int compareTo(Book book) {
        return this.isbn - book.isbn;
    }
}
