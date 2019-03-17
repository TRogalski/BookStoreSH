package pl.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.bookstore.dao.PublisherDao;
import pl.bookstore.entity.Book;
import pl.bookstore.entity.Publisher;

import java.util.List;

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

    @GetMapping("/remove/{id}")
    @ResponseBody
    public String removeById(@PathVariable Long id) {
        Publisher publisher = publisherDao.findById(id);
        publisherDao.delete(publisher);
//        may not exist TBD
        return "The publisher has been removed";
    }

    @GetMapping("/edit/{id}/{name}")
    @ResponseBody
    public String editById(@PathVariable Long id,
                           @PathVariable String name) {
        Publisher publisher = publisherDao.findById(id);
        publisher.setName(name);
        publisherDao.update(publisher);

        return "The changes have been saved";
    }

    @GetMapping("/getbyid/{id}")
    @ResponseBody
    public String getById(@PathVariable Long id) {
        Publisher publisher = publisherDao.findById(id);
        return "The publisher has been found: \n" + publisher.toString();
    }

    @GetMapping("/showall")
    @ResponseBody
    public String showAll() {
        List<Publisher> publishers = publisherDao.findAll();
        return "found publishers: \n" + publishers.toString();
    }
}
