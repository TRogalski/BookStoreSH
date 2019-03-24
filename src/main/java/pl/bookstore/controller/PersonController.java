package pl.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.bookstore.dao.PersonDao;
import pl.bookstore.dao.PersonDetailsDao;
import pl.bookstore.entity.Person;
import pl.bookstore.entity.PersonDetails;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonDao personDao;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showRegistrationForm(Model model) {
        model.addAttribute("person", new Person());
        return "form/addPerson";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String showRegistrationForm(@ModelAttribute Person person) {

        personDao.save(person);

        return "Zapisano: " + person.toString();
    }

    @RequestMapping(value = "/addwithdetails",method = RequestMethod.GET)
    @ResponseBody
    public String addWithDetails(){
        Person person = new Person("Antoni", "Bierut", "mokasyn@o2.pl");
        PersonDetails personDetails = new PersonDetails("zxxzc","zxczxczx","zxcxzczxc","a","a");
        person.setPersonDetails(personDetails);

        personDao.save(person);

        return person.toString();
    }

}
