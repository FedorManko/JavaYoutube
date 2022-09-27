package lesson42to65.lesson50HashEquals;

import java.util.Objects;

public class Ticket {
    int number;
    String libraryName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket)) return false;
        Ticket ticket = (Ticket) o;
        return number == ticket.number && Objects.equals(libraryName, ticket.libraryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, libraryName);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "number=" + number +
                ", libraryName='" + libraryName + '\'' +
                '}';
    }
}
