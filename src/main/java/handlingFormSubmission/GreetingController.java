package handlingFormSubmission;
// from https://spring.io/guides/gs/handling-form-submission/

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

    @GetMapping("/greeting-form")
    public String greetingForm(Model model) {
        model.addAttribute("greetingForm", new GreetingForm());
        return "greeting-form";
    }

    @PostMapping("/greeting-form")
    public String greetingSubmit(@ModelAttribute GreetingForm greetingForm){
        return "result-form";
    }
}
