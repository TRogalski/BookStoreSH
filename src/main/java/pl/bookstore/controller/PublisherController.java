package pl.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.bookstore.dao.PublisherDao;
import pl.bookstore.entity.Publisher;

@RequestMapping("/publisher")
@Controller
public class PublisherController {

    @Autowired
    private PublisherDao publisherDao;

    @GetMapping("/add/{name}")
    @ResponseBody
    public String add(@PathVariable String name) {

        Publisher publisher = new Publisher();
        publisher.setName(name);

        publisherDao.save(publisher);

        return "The publisher has been saved: \n" + publisher.toString();
    }

}
