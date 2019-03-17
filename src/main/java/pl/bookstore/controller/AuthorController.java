package pl.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.bookstore.dao.AuthorDao;
import pl.bookstore.entity.Author;

import java.util.List;

@RequestMapping("/Author")
@Controller
public class AuthorController {

    @Autowired
    AuthorDao authorDao;

    @GetMapping("/add/{firstName}/{lastName}")
    @ResponseBody
    public String add(@PathVariable String firstName,
                      @PathVariable String lastName) {

        Author author = new Author();
        author.setFirstName(firstName);
        author.setLastName(lastName);

        authorDao.save(author);

        return "The author has been saved: \n" + author.toString();
    }

    @GetMapping("/remove/{id}")
    @ResponseBody
    public String removeById(@PathVariable Long id) {
        Author author = authorDao.findById(id);
        authorDao.delete(author);
//        may not exist TBD
        return "The author has been removed";
    }

    @GetMapping("/edit/{id}/{firstName}/{lastName}")
    @ResponseBody
    public String editById(@PathVariable Long id,
                           @PathVariable String firstName,
                           @PathVariable String lastName) {
        Author author = authorDao.findById(id);
        author.setFirstName(firstName);
        author.setLastName(lastName);
        authorDao.update(author);

        return "The changes have been saved";
    }

    @GetMapping("/getbyid/{id}")
    @ResponseBody
    public String getById(@PathVariable Long id) {
        Author author = authorDao.findById(id);
        return "The author has been found: \n" + author.toString();
    }

    @GetMapping("/showall")
    @ResponseBody
    public String showAll() {
        List<Author> authors = authorDao.findAll();
        return "found authors: \n" + authors.toString();
    }
}
