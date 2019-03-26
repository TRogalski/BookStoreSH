package pl.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.bookstore.dao.PublisherDao;
import pl.bookstore.entity.Publisher;

@Controller
@RequestMapping("/publisher")
public class PublisherController {

    @Autowired
    private PublisherDao publisherDao;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("publisher", new Publisher());
        return "publisher/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@ModelAttribute Publisher publisher) {
        publisherDao.save(publisher);
        return "redirect:list";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String showAll(Model model) {
        model.addAttribute("publishers", publisherDao.findAll());
        return "publisher/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable Long id, Model model) {
        Publisher publisher = publisherDao.findById(id);
        model.addAttribute("publisher", publisher);
        return "publisher/edit";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String edit(@ModelAttribute Publisher publisher) {
        publisherDao.update(publisher);
        return "redirect:list";
    }

    @RequestMapping(value = "/remove/{id}", method = RequestMethod.GET)
    public String remove(@PathVariable Long id, Model model) {
        Publisher publisher = publisherDao.findById(id);
        model.addAttribute("publisher", publisher);
        return "publisher/remove";
    }

    //    this will not work if publisher is assigned to a book TODO
    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public String remove(@RequestParam Long id) {
        Publisher publisher = publisherDao.findById(id);
        publisherDao.delete(publisher);
        return "redirect:list";
    }
}
