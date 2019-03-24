package pl.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.bookstore.entity.Student;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String showAddStudentForm(Model model){
        model.addAttribute("student",new Student());
        return "form/addStudent";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public String showAddStudentForm(@ModelAttribute Student student){
        return student.toString();
    }

    @ModelAttribute("countries")
    public List<String> countries() {
        return Arrays.asList("Poland", "Germany", "France", "Russia", "Denmark");
    }

    @ModelAttribute("hobbies")
    public List<String> hobbies() {
        return Arrays.asList("Diving", "Board games", "Computer Games", "Solving jigsaw puzzles", "Photography");
    }

    @ModelAttribute("programmingSkills")
    public List<String> programmingSkills() {
        return Arrays.asList("Java", "Python", "C++", "C#", "Scala");
    }
}
