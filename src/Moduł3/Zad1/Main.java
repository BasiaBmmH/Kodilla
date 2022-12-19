package Moduł3.Zad1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Book> booksSet = new HashSet<>(
                Arrays.asList(
                        new Book("Sherlock Holems", "Arthur", "Conan Doyle", 1892, 22, 5),
                        new Book("Under the Dome", "Stephen", "King", 2009, 21, 9),
                        new Book("DOGS", "Shirow", "Miwa", 2001, 9, 10),
                        new Book("Akatsuki no Yona", "Mizuo", "Kusanagi", 2009, 5, 7),
                        new Book("Vinland Saga", "Makto", "Yukimura", 2005, 10, 1),
                        new Book("Norsk Lyrikk", "Soren", "Nurmi", 1950, 21, 3),
                        new Book("Psycho-Pass", "Makoto", "Fukami", 2012, 28, 11)
                )
        );

        for (Book book : booksSet
        ) {neew
            if (book.getReleaseDate().getYear() < 2010) {
                System.out.println(book.getTitle());
            }
        }

    }
}

class Book {
    String title;
    String authorsName;
    String authorsSurname;
    LocalDate releaseDate;

    public Book(String title, String authorsName, String authorsSurname, int releaseDateYear, int releaseDateDay, int releaseDateMonth) {
        this.title = title;
        this.authorsName = authorsName;
        this.authorsSurname = authorsSurname;
        this.releaseDate = LocalDate.of(releaseDateYear, releaseDateMonth, releaseDateDay);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorsName() {
        return authorsName;
    }

    public String getAuthorsSurname() {
        return authorsSurname;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public int hashCode() {
        return releaseDate.getYear();
    }

    public boolean equals(Object o) {
        Book b = (Book) o;
        return (title.equals((b.getTitle()))) &&
                (authorsName.equals((b.getAuthorsName()))) &&
                (authorsSurname.equals((b.getAuthorsSurname()))) &&
                (releaseDate.getYear() == b.getReleaseDate().getYear()) &&
                (releaseDate.getMonth() == b.getReleaseDate().getMonth()) &&
                (releaseDate.getDayOfMonth() == b.getReleaseDate().getDayOfMonth());
    }
}
