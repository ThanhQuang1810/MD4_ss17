package controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {

    @RequestMapping("/list")
    public String showForm() {
        return "list";
    }

    @RequestMapping("/save")
    public String save(@RequestParam("condiment") String[] condiment, Model model) {
        model.addAttribute("condiments", condiment);
        return "result";
    }

}
