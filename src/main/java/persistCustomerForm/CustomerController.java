package persistCustomerForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customer-form")
    public String customerForm(Model model) {
        model.addAttribute("customerPersist", new CustomerPersist());
        return "customer-form";
    }
    @PostMapping("/customer-form")
    public String customerSubmit(@ModelAttribute CustomerPersist customerPersist) {
        CustomerPersist newCustomer = customerPersist;
        customerRepository.save(newCustomer);
        return "customer-result";}
}
