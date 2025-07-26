package sg.ntu.simple_crm;

import java.util.Map;

public interface CustomerService {
    Customer createCustomer(Customer customer);
    Customer getCustomer(Long id);
    Map<Long, Customer> getAllCustomers(); // Using Map with Long keys
    Customer updateCustomer(Long id, Customer customer);
    boolean deleteCustomer(Long id); // Returns boolean to indicate success/failure
}