package practice.excercise.library;

public class Book {
    /*
    5. Composition Assignment (Library Management System)
    Scenario:
    A Library has Books. If a Library is removed, all books should also be removed.
    Task:
    Create a Book class with title and author.
    Create a Library class containing multiple books (List<Book>).
    If the library is destroyed, all books should be destroyed too.
    */
    private String titleOfBook;
    private String authorOfBook;
    public Book(String titleOfBook, String authorOfBook){

        this.titleOfBook = titleOfBook;
        this.authorOfBook = authorOfBook;
        System.out.println("Inside the Book constructor");
    }


    public String getTitleOfBook() {
        return titleOfBook;
    }

    public void setTitleOfBook(String titleOfBook) {
        this.titleOfBook = titleOfBook;
    }


    public String getAuthorOfBook() {
        return authorOfBook;
    }

    public void setAuthorOfBook(String authorOfBook) {
        this.authorOfBook = authorOfBook;
    }


    public String toString() {
        return "Book{" +
                "titleOfBook='" + titleOfBook + '\'' +
                ", authorOfBook='" + authorOfBook + '\'' +
                '}';
    }
}


