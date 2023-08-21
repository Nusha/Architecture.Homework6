package data;
import domain.*;
import java.util.List;

public class InMemoryBookRepository implements BookRepository {
    private List<Book> books;
    public InMemoryBookRepository(List<Book> books) {
        this.books = books;
    }
    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }
}


