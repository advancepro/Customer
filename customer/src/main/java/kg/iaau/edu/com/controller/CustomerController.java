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
public class CustomerController {

    @Autowired
    CustomerDao customerDao;

    @RequestMapping("/customers")
    public String showHome(ModelMap model)
    {
        model.addAttribute("customers", customerDao.getCustomers());

        return "customers";
    }

    @RequestMapping("/getCustomer")
    public String showCustomers(ModelMap model, @RequestParam("id") int id)
    {
        model.addAttribute("customer", customerDao.getCustomer(id));

        return "customer";
    }

    @RequestMapping("/addCustomer")
    public String addCostumer()
    {
        return "createCustomer";
    }

    @RequestMapping(value = "/createCustomer", method = RequestMethod.POST)
    public String createCustomer(Customer customer)
    {
        return "redirect:customers";
    }
}
