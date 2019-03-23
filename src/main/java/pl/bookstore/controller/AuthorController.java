package pl.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.bookstore.dao.AuthorDao;
import pl.bookstore.entity.Author;


@RequestMapping("/author")
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

}
