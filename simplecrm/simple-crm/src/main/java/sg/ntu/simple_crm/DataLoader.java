package sg.ntu.simple_crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import java.time.LocalDate;

@Component
public class DataLoader {
    
    private CustomerRepository customerRepository;
    private InteractionRepository interactionRepository;
    
    @Autowired
    public DataLoader(CustomerRepository customerRepository, InteractionRepository interactionRepository) {
        this.customerRepository = customerRepository;
        this.interactionRepository = interactionRepository;
    }
    
    @PostConstruct
    public void loadData() {
        // Clear the database first
        interactionRepository.deleteAll();
        customerRepository.deleteAll();
        
        // Load customer data
        Customer tony = customerRepository.save(new Customer("Tony", "Stark", "tony.stark@avengers.com", "+65 9001 0001", "Iron Man", 1970));
        Customer bruce = customerRepository.save(new Customer("Bruce", "Banner", "bruce.banner@avengers.com", "+65 9001 0002", "The Hulk", 1969));
        Customer peter = customerRepository.save(new Customer("Peter", "Parker", "peter.parker@avengers.com", "+65 9001 0003", "Spider-Man", 2001));
        Customer stephen = customerRepository.save(new Customer("Stephen", "Strange", "stephen.strange@avengers.com", "+65 9001 0004", "Doctor Strange", 1976));
        
        // Load interaction data with customer relationships
        interactionRepository.save(new Interaction("Initial consultation and product presentation", LocalDate.of(2023, 8, 1), tony));
        interactionRepository.save(new Interaction("Follow-up call to discuss pricing options", LocalDate.of(2023, 8, 5), tony));
        interactionRepository.save(new Interaction("Presented products to customer", LocalDate.of(2023, 8, 10), bruce));
        interactionRepository.save(new Interaction("Closed the deal and signed contract", LocalDate.of(2023, 8, 15), peter));
    }
}