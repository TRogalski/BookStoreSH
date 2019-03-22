package pl.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.bookstore.dao.AuthorDao;
import pl.bookstore.dao.BookDao;
import pl.bookstore.dao.PublisherDao;
import pl.bookstore.entity.Author;
import pl.bookstore.entity.Book;
import pl.bookstore.entity.Publisher;

import java.util.List;
import java.util.Set;

@RequestMapping("/book")
@Controller
public class BookController {

    @Autowired
    private BookDao bookDao;

    @Autowired
    private PublisherDao publisherDao;

    @Autowired
    private AuthorDao authorDao;


    @GetMapping("/add")
    @ResponseBody
    public String add() {

        Book book = new Book();
        book.setTitle("1984");

        Author author = new Author();
        author.setFirstName("Orwell");

        book.getAuthors().add(author);

        Publisher publisher = new Publisher();
        publisher.setName("Nowy");

        book.setPublisher(publisher);

        bookDao.save(book);

        return "The book has been saved: \n" + book.toString();
    }

    @GetMapping("/edit")
    @ResponseBody
    public String edit() {

        Book book = bookDao.findById(1L);
        book.setTitle("Czarne dziury");

        Author author = new Author();
        author.setFirstName("Stephen");
        author.setLastName("Hawking");

        book.getAuthors().add(author);

        bookDao.update(book);

        return "The book has been saved: \n" + book.toString();
    }

    @GetMapping("/edit2")
    @ResponseBody
    public String edit2() {

        Book book = bookDao.findById(1L);
        book.setTitle("Czarne dziury");


        Author author = new Author();
        author.setLastName("ziemniaczany");


        Publisher publisher = new Publisher();
        publisher.setName("Nowy2");

        book.getAuthors().add(author);
        book.setPublisher(publisher);

        bookDao.update(book);

        return "The book has been saved: \n" + book.toString();
    }

}
