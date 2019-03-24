package pl.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.bookstore.dao.AuthorDao;
import pl.bookstore.dao.BookDao;
import pl.bookstore.dao.PublisherDao;
import pl.bookstore.entity.Author;
import pl.bookstore.entity.Book;
import pl.bookstore.entity.Publisher;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookDao bookDao;

    @Autowired
    private PublisherDao publisherDao;

    @Autowired
    private AuthorDao authorDao;


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showAddBookForm(Model model) {

        model.addAttribute("book", new Book());

        return "book/addBook";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String showAddBookForm(@ModelAttribute Book book) {

        bookDao.save(book);

        return "redirect:showall";
    }


    @RequestMapping(value="/showall", method=RequestMethod.GET)
    public String showAllBooks(Model model){
        model.addAttribute("books",bookDao.findAll());
        return "book/list";
    }

    @ModelAttribute("publishers")
    public List<Publisher> publishers() {
        return publisherDao.findAll();
    }


//    @GetMapping("/edit")
//    @ResponseBody
//    public String edit() {
//
//        Book book = bookDao.findById(1L);
//        book.setTitle("Czarne dziury");
//
//        Author author = new Author();
//        author.setFirstName("Stephen");
//        author.setLastName("Hawking");
//
//        book.getAuthors().add(author);
//
//        bookDao.update(book);
//
//        return "The book has been saved: \n" + book.toString();
//    }


}
