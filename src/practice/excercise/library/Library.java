package practice.excercise.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList;

    public Library(){
        bookList = new ArrayList<>();
        System.out.println("Inside Library Constructor");
            }
    public void addBook(Book book){
        bookList.add(book);
    }
    public void removeBook(Book book){
        bookList.remove(book);
    }
    public void showBook(){
        if(bookList.isEmpty()) {
            System.out.println("No books found!");
        }
            else{
                System.out.println("Books in the library:");
                for(Book book : bookList){
                    System.out.println(book);
                }
            }
        }

     public void destroyLibrary(){
        bookList.clear();
         System.out.println("Library destroyed");
     }

    }

