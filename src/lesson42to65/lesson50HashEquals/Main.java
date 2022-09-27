package lesson42to65.lesson50HashEquals;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.number = 123;
        Book book = new Book();
        Book book1 = new Book();
        book1.author = "Tolkien";
        book1.name = "Lord of the Rings";
        book.author = "Carnegie";
        book.name = "How to get friends";
        Map<Ticket,Book> library = new HashMap<>();
        library.put(ticket,book);

        Ticket ticket1 = new Ticket();
        ticket1.number = 122;
        library.put(ticket1, book1);
        System.out.println(library.toString());
        Book carnegieBook = library.get(ticket1);
        Book book2 = library.get(ticket);
        System.out.println(carnegieBook.author);
        System.out.println(book2.author);
        System.out.println(ticket.hashCode());
        System.out.println(ticket1.hashCode());
    }
}
