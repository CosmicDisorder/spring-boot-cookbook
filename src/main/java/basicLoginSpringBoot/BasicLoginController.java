package basicLoginSpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicLoginController {

    @RequestMapping("/basic-login")
    @ResponseBody
    public String index() {
        return "That's pretty basic";
    }
}
