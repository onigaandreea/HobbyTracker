package org.example.hobby;

import org.example.item.Book;
import org.example.item.Item;

import java.util.ArrayList;
import java.util.List;

class BookHobby extends Hobby {
    private List<Book> readBooks = new ArrayList<>();
    private List<Book> booksToRead = new ArrayList<>();
    private List<Book> booksToBuy = new ArrayList<>();

    public BookHobby(String name) {
        super(name);
    }

    @Override
    public String getDetails() {
        return "Book Hobby: " + name + "\nRead Books: " + readBooks.size() + "\nBooks to Read: " + booksToRead.size() + "\nBooks to Buy: " + booksToBuy.size();
    }

    @Override
    public void addItem(Item item) {
        if (item instanceof Book) {
            readBooks.add((Book) item);
        } else {
            throw new IllegalArgumentException("Invalid item type for BookHobby");
        }
    }

    @Override
    public void removeItem(Item item) {
        if (item instanceof Book) {
            readBooks.remove(item);
        } else {
            throw new IllegalArgumentException("Invalid item type for BookHobby");
        }
    }
}
