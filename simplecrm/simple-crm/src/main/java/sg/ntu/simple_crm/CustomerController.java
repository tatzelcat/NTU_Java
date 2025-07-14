package sg.ntu.simple_crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;

@RestController
public class CustomerController {

    //======= Customer Data Endpoint ===========
    @Autowired
    private Customer customer;
    
    @GetMapping("/customer")
    public Customer getCustomer(){
        customer.setID("42");
        customer.setFirstName("Keagan");
        customer.setLastName("Rubel");
        customer.setEmail("kr82@gmail.com");
        customer.setContactNo("+65 9372 6485");
        customer.setJobTitle("The Lorax");
        customer.setYearOfBirth(1982);

        return customer;
    }


}
