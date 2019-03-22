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

        Publisher publisher=new Publisher();
        publisher.setName("Nowy");

        book.setPublisher(publisher);
        publisher.getBooks().add(book);

        bookDao.save(book);

        return "The book has been saved: \n" + book.toString();
    }

}
