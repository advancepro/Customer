package kg.iaau.edu.com.controller;

import kg.iaau.edu.com.dao.CustomerDao;
import kg.iaau.edu.com.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    CustomerDao customerDao;

    @RequestMapping("/")
    public String HomePage()
    {
        return "index";
    }

    @RequestMapping("/abouts")
    public String showCustomer()
    {
        return "about";
    }
}
