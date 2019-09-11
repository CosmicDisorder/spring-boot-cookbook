package persistCustomerForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @GetMapping("/customer-form")
    public String customerForm(Model model) {
        model.addAttribute("customerPersist", new CustomerPersist());
        return "customer-form";
    }
    @PostMapping("/customer-form")
    public String customerSubmit(@ModelAttribute CustomerPersist customerPersist) {return "customer-result";}
}
