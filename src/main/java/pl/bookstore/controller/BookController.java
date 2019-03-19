package pl.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.bookstore.dao.BookDao;
import pl.bookstore.dao.PublisherDao;
import pl.bookstore.entity.Book;

import java.util.List;

@RequestMapping("/book")
@Controller
public class BookController {

    @Autowired
    BookDao bookDao;

    @Autowired
    PublisherDao publisherDao;

    @GetMapping("/add/{title}/{author}/{publisher}")
    @ResponseBody
    public String add(@PathVariable String title,
                      @PathVariable String author,
                      @PathVariable Long publisher) {

        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        publisherDao.findById(publisher).getBooks().add(book);

//        rating and description not included
        bookDao.save(book);

        return "The book has been saved: \n" + book.toString();
    }

    @GetMapping("/remove/{id}")
    @ResponseBody
    public String removeById(@PathVariable Long id) {
        Book book = bookDao.findById(id);
        bookDao.delete(book);
//        may not exist TBD
        return "The book has been removed";
    }

    @GetMapping("/edit/{id}/{title}/{author}/{publisher}")
    @ResponseBody
    public String editById(@PathVariable Long id,
                           @PathVariable String title,
                           @PathVariable String author,
                           @PathVariable String publisher) {
        Book book = bookDao.findById(id);
        book.setTitle(title);
        book.setAuthor(author);
        book.setPublisher(publisher);
        bookDao.update(book);

        return "The changes have been saved";
    }

    @GetMapping("/getbyid/{id}")
    @ResponseBody
    public String getById(@PathVariable Long id) {
        Book book = bookDao.findById(id);
        return "The book has been found: \n" + book.toString();
    }

    @GetMapping("/showall")
    @ResponseBody
    public String showAll() {
        List<Book> books = bookDao.findAll();
        return "found books: \n" + books.toString();
    }
}
