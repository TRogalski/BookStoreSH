package pl.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.bookstore.dao.BookDao;
import pl.bookstore.entity.Book;

@Controller
public class HomeController {

    @Autowired
    private BookDao bookdao;

    @RequestMapping("/saveBook")
    public String hello() {
        Book book = new Book();
        book.setTitle("1984");
        book.setAuthor("Orwell");
        bookdao.saveBook(book);
        return "index";
    }
}
