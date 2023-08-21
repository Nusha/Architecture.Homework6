package presentation;

import data.BookRepository;
import data.InMemoryBookRepository;
import domain.Book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем репозиторий книг с использованием коллекции
        List<Book> books = new ArrayList<>();
        BookRepository bookRepository = new InMemoryBookRepository(books);

        // Добавляем книги в магазин
        Book book1 = new Book("1", "Clean Code", "Robert C. Martin", 34.99);
        Book book2 = new Book("2", "Effective Java", "Joshua Bloch", 29.99);
        bookRepository.addBook(book1);
        bookRepository.addBook(book2);

        // Получаем список всех книг в магазине
        List<Book> allBooks = bookRepository.getAllBooks();
        for (Book book : allBooks) {
            System.out.println("Книга: " + book.getTitle() + ", Автор: " + book.getAuthor() + ", Цена: $" + book.getPrice());
        }
    }
}