package sg.ntu.simple_crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.*;

@RestController
public class CustomerController {


    // Pre-defined customer data
    private Map<String, Customer> customers = new HashMap<>();
    
    public CustomerController() {
        customers.put("1", new Customer("1", "John", "Doe", "john.doe@email.com", "+65 9123 4567", "Software Engineer", 1990));
        customers.put("2", new Customer("2", "Jane", "Smith", "jane.smith@email.com", "+65 9234 5678", "Product Manager", 1985));
        customers.put("3", new Customer("3", "Mike", "Johnson", "mike.johnson@email.com", "+65 9345 6789", "Data Analyst", 1992));
    }

    //======= Customer Data Endpoint ===========
    @GetMapping("/customer/{customerId}")
    public ResponseEntity<?> getCustomer(@PathVariable String customerId) {
        if (customers.containsKey(customerId)) {
            return ResponseEntity.ok(customers.get(customerId));
        } else {
            return ResponseEntity.ok("No customer found");
        }
    }
}


