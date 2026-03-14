
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MatheusPC
 */
public class Library {

    private List<Book> listOfBooks;

    public Library() {
        this.listOfBooks = new ArrayList<>();
    }

    public void add(Book book) {
        if (book == null) {
            return;
        }
        this.listOfBooks.add(book);
    }

    public int quantityBooks() {
        if (this.listOfBooks.isEmpty() || this.listOfBooks == null) {
            return 0;
        }

        return this.listOfBooks.size();
    }

    public List<Book> listLibrary() {
        List<Book> copyLibrary = new ArrayList<>(this.listOfBooks);
        return copyLibrary;
    }

}
