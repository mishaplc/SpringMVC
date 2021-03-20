package conrroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/SpringMVC")
    public String index(Model model) {
        model.addAttribute("nick", "Jan");
        return "index";

    }
}
