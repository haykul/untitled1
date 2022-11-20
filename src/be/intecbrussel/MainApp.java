package be.intecbrussel;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.stream.Stream;

public class MainApp {
    public static void main(String[] args) {
        // create authors
        // create books
        //put books in array
        //create methods
        //test methods

        Person person = new Person("Stephan", "Hawking", LocalDate.of(1942, 1, 2));
        Person person1 = new Person("Dan", "Brown", LocalDate.of(1964, 6, 22));
        Person person2 = new Person("Agatha", "Christie", LocalDate.of(1890, 9, 15));


        Book book = new Book("Brief History Of Time", person, LocalDate.of(1988, 4, 1), "Fiction");
        Book book2 = new Book("Da Vinci Code", person1, LocalDate.of(2003, 3, 18), "Adventure");
        Book book3 = new Book("Murder On The Orient Express", person2, LocalDate.of(1934, 2, 10), "Murder");
        Book book4 = new Book("Moord Op De Nijl", person2, LocalDate.of(1937, 6, 17), "Murder");
        Book book5 = new Book("Het Vale Paard", person2, LocalDate.of(1961, 9, 21), "Murder");

        // put books in array
        Book[] books = {book, book2, book3, book4, book5};
        Book mostRecentBook = getNewestBook(books);
        //naturally sorted on Title because of comparator
    }
        public static Book getNewestBook(Book []books){
               Stream.of(books)
               // .sorted(new BookReleaseDateSorter())
                .sorted(Comparator.comparing(Book::getReleaseDate))
                .forEach(book -> System.out.println(book));
                return null;
    }
    //sorting by comparator


    public static void printyoungestWriter (Book[]book){

    }
    public static void printSortedByTitle (Book[]book){

    }
    public static void countBooksPerAuthor (Book[]book){

    }
    public static void printBooksReleasedIn2016 (Book[]book){

    }





}
