package be.intecbrussel;

import java.util.Comparator;

public class BookReleaseDateSorter implements Comparator <Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getReleaseDate().compareTo(o2.getReleaseDate());
    }
}
