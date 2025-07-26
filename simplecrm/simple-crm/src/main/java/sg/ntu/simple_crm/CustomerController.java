package sg.ntu.simple_crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.*;

@RestController
public class CustomerController {

    // Logger
    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    // Inject the service
    @Autowired
    private CustomerService customerService;

    // Get customer by ID
    @GetMapping("/customer/{customerId}")
    public ResponseEntity<?> getCustomer(@PathVariable Long customerId) {
        logger.info("GET request received for customer ID: {}", customerId);
        
        Customer customer = customerService.getCustomer(customerId);
        if (customer != null) {
            logger.info("Customer found :D");
            return ResponseEntity.ok(customer);
        } else {
            logger.info("Customer not found D:");
            return ResponseEntity.status(404).body("No customer found");
        }
    }

    // Get all customers
    @GetMapping("/customers")
    public ResponseEntity<?> getAllCustomers() {
        logger.info("GET request received for all customers");
        Map<Long, Customer> allCustomers = customerService.getAllCustomers();
        return ResponseEntity.ok(allCustomers);
    }

    // Create new customer
    @PostMapping("/customer")
    public ResponseEntity<?> createCustomer(@RequestBody Customer customer) {
        Customer createdCustomer = customerService.createCustomer(customer);
        logger.info("Customer created successfully with ID: {}", customer.getId());
        return ResponseEntity.status(201).body(createdCustomer);
    }

    // Update existing customer
    @PutMapping("/customer/{customerId}")
    public ResponseEntity<?> updateCustomer(@PathVariable Long customerId, @RequestBody Customer customer) {
        logger.info("PUT request received for customer ID: {}", customerId);
        
        Customer updatedCustomer = customerService.updateCustomer(customerId, customer);
        if (updatedCustomer != null) {
            logger.info("Customer updated successfully with ID: {}", customerId);
            return ResponseEntity.ok(updatedCustomer);
        } else {
            logger.info("Customer not found for update: {}", customerId);
            return ResponseEntity.status(404).body("Customer not found");
        }
    }

    // Delete customer
    @DeleteMapping("/customer/{customerId}")
    public ResponseEntity<?> deleteCustomer(@PathVariable Long customerId) {
        logger.info("DELETE request received for customer ID: {}", customerId);
        
        boolean deleted = customerService.deleteCustomer(customerId);
        if (deleted) {
            logger.info("Customer deleted successfully with ID: {}", customerId);
            return ResponseEntity.ok("Customer deleted successfully");
        } else {
            logger.info("Customer not found for deletion: {}", customerId);
            return ResponseEntity.status(404).body("Customer not found");
        }
    }
}