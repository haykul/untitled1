package be.intecbrussel;

import java.time.LocalDate;
import java.util.stream.Stream;

public class MainApp {
    public static void main(String[] args) {
       // create authors
       // create books
        //put books in array
        //create methods
        //test methods

        Person person=new Person("Stephan","Hawking", LocalDate.of(1942,1,2));
        Person person1=new Person("Dan","Brown", LocalDate.of(1964,6,22));
        Person person2=new Person("Agatha","Christie", LocalDate.of(1890,9,15));
        Person person3=new Person("Agatha","Christie", LocalDate.of(1890,9,15));
        Person person4=new Person("Agatha","Christie", LocalDate.of(1890,9,15));


        Book book=new Book("Brief History Of Time",person,LocalDate.of(1988,4,1),"Fiction");
        Book book1=new Book("Da Vinci Code",person1,LocalDate.of(2003,3,18),"Adventure");
        Book book2=new Book("Murder On The orient Express",person2,LocalDate.of(1934,2,10),"Murder");
        Book book3=new Book("Murder On The orient Express",person3,LocalDate.of(1934,2,10),"Murder");
        Book book4=new Book("Murder On The orient Express",person4,LocalDate.of(1934,2,10),"Murder");

        // put books in array
        Book[]books={book,book1,book2, book3, book4};
       //naturally sorted on Title because of comparator
        Stream.of(books)
                .sorted()
                .forEach(b->System.out.println(b.getTitle()));

    }
    //sorting by comparator

    public static Book getNewestBoek (Book []books){
        return null;
    }
    public static void printyoungestWriter (Book[]books){

    }
    public static void printSortedByTitle (Book[]books){

    }
    public static void countBooksPerAuthor (Book[]books){

    }
    public static void printBooksReleasedIn2016 (Book[]books){

    }





}
