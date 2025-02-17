package practice.excercise.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryRunner {

    public static void main(String[] args) {

        Book book1 = new Book("Fun time","Harry" );
        Book book2 = new Book("Food time","Marry" );
        Book book3 = new Book("Study time","John" );
        Book book4 = new Book("Gym time","Bob" );

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.showBook();

        library.addBook(new Book("Artist", "Kalpna"));

        library.showBook();

        library.destroyLibrary();

        library.showBook();
        library.addBook(book1);
        library.showBook();

    }
}
