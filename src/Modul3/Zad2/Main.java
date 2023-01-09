package Modul3.Zad2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Deque<Book> books = new ArrayDeque<>();

        Book theBook1 = new Book("The Witcher", "Andrzej Sapkowski", 1986);
        Book theBook2 = new Book("Kłamca", "Jakub Ćwiek", 2005);
        Book theBook3 = new Book("Szamański Blues", "Aneta Jadowska", 2016);
        Book theBook4 = new Book("Under the Dome", "Stephen King", 2009);
        Book theBook5 = new Book("The Bell", "Iris Murdoch", 1958);

        books.offer(theBook1);
        books.offer(theBook2);
        books.offer(theBook3);
        books.offer(theBook4);
        books.offer(theBook5);

        Delete.delete(books);
    }
}

class Delete {
    public static void delete(Deque<Book> books) {

        System.out.println("Poczatkowy rozmar stosu: " + books.size());

        while (books.size() > 0) {
            books.poll();
            if (books.size() == 1) {
                System.out.println("Ostatnia usunieta pozycja: " + books.poll());
            }
        }
        System.out.println("Koncowy rozmiar stosu: " + books.size());
    }
}

class Book {

    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Title: \"" + title + "\", author: " + author + ", " + year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void delete() {

    }

}

