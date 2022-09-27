package lesson155to200.lesson156equals;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Book x = new Book("X");
        Book y = new Book("X");
        Book z = new Book("X");

        System.out.println("reflexive");
        System.out.println(x.equals(x));
        System.out.println("");
        System.out.println("symmetric");
        System.out.println(x.equals(y));
        System.out.println(y.equals(x));
        System.out.println("");
        System.out.println("transitive");
        System.out.println(x.equals(y));
        System.out.println(y.equals(z));
        System.out.println(x.equals(z));
        System.out.println("");
        System.out.println("consistent");
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));
        System.out.println("");
        System.out.println("not null");
        System.out.println(x.equals(null));
    }
}
class Book{
    String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}