package homeWork7_Collections.FirstTask;

import java.util.ArrayList;
import java.util.List;

public class BookTester {
    public static void main(String[] args) {

        List<Book> bookCollection = new ArrayList<>();

        bookCollection.add(new Book(230, "Title1", "hard", 179));
        bookCollection.add(new Book(109, "Title2", "hard", 109));
        bookCollection.add(new Book(88, "Title3", "hard", 99));
        bookCollection.add(new Book(178, "Title4", "soft", 130));
        bookCollection.add(new Book(500, "Title5", "hard", 400));
        bookCollection.add(new Book(280, "Title6", "hard", 312));
        bookCollection.add(new Book(230, "Title7", "soft", 200));
        bookCollection.add(new Book(490, "Title8", "soft", 249));
        bookCollection.add(new Book(416, "Title9", "hard", 302));
        bookCollection.add(new Book(377, "Title10", "hard", 308));

        List<Book> booksWithSoftCover = new ArrayList<>();
        List<Book> booksWithHardCover = new ArrayList<>();

        for (Book i : bookCollection) {
            if (i.getCoverType().equals("soft")) {
                booksWithSoftCover.add(i);
            } else booksWithHardCover.add(i);
        }
        System.out.println("In the book shop we have the following books: ");


        for (Book i : bookCollection) {
            System.out.println(i.getTitle());
        }

        System.out.println("The books with soft cover are: ");


        for (Book i : booksWithSoftCover) {
            System.out.println(i.getTitle());
        }

        System.out.println("The books with hard cover are: ");

        for (Book i : booksWithHardCover) {
            System.out.println(i.getTitle());
        }
    }
}
