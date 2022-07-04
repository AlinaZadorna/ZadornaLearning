package homeWork8_Exceptions.Task2;

import homeWork7_Collections.FirstTask.Book;

import java.util.ArrayList;

public class Books {

    /*2. В класса main cоздать ArrayList - потом наполнить его 5 элементами Book из
        предидущего урока. После этого попытаться достучаться до элемента с
        индексом 5. Обработать эксепшен в try - catch.*/

    public static void main(String[] args) {

        ArrayList<Book> booksList = new ArrayList<>();
        booksList.add(new Book(230, "Title1", "hard", 179));
        booksList.add(new Book(109, "Title2", "hard", 109));
        booksList.add(new Book(88, "Title3", "hard", 99));
        booksList.add(new Book(178, "Title4", "soft", 130));
        booksList.add(new Book(500, "Title5", "hard", 400));

        try {
            System.out.println(booksList.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("This book does not exist");
        }
    }
}
