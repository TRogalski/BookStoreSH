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
    public String add(Model model) {
        model.addAttribute("book", new Book());
        return "book/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@ModelAttribute Book book) {
        bookDao.update(book);
        return "redirect:list";
    }


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String showAll(Model model) {
        model.addAttribute("books", bookDao.findAll());
        return "book/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable Long id, Model model) {
        Book book = bookDao.findById(id);
        model.addAttribute("book", book);
        return "book/edit";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String edit(@ModelAttribute Book book) {
        bookDao.update(book);
        return "redirect:list";
    }

    @RequestMapping(value = "/remove/{id}", method = RequestMethod.GET)
    public String remove(@PathVariable Long id, Model model) {
        Book book = bookDao.findById(id);
        model.addAttribute("book", book);
        return "book/remove";
    }

    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public String remove(@RequestParam Long id) {
        Book book = bookDao.findById(id);
        bookDao.delete(book);
        return "redirect:list";
    }

    @ModelAttribute("publishers")
    public List<Publisher> publishers() {
        return publisherDao.findAll();
    }

    @ModelAttribute("authors")
    public List<Author> authors() {
        return authorDao.findAll();
    }

}
