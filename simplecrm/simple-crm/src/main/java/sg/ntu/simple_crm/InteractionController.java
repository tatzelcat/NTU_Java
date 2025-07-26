package sg.ntu.simple_crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalDate;
import java.util.List;

@RestController
public class InteractionController {

    // Logger
    private static final Logger logger = LoggerFactory.getLogger(InteractionController.class);

    @Autowired
    private InteractionService interactionService;
    
    @Autowired
    private CustomerService customerService;

    // Get interaction by ID
    @GetMapping("/interaction/{interactionId}")
    public ResponseEntity<?> getInteraction(@PathVariable Long interactionId) {
        logger.info("GET request received for interaction ID: {}", interactionId);
        
        Interaction interaction = interactionService.getInteraction(interactionId);
        if (interaction != null) {
            logger.info("Interaction found");
            return ResponseEntity.ok(interaction);
        } else {
            logger.info("Interaction not found");
            return ResponseEntity.status(404).body("No interaction found");
        }
    }

    // Get all interactions
    @GetMapping("/interactions")
    public ResponseEntity<?> getAllInteractions() {
        logger.info("GET request received for all interactions");
        List<Interaction> allInteractions = interactionService.getAllInteractions();
        return ResponseEntity.ok(allInteractions);
    }

    // Create new interaction for a specific customer
    @PostMapping("/customer/{customerId}/interaction")
    public ResponseEntity<?> createInteractionForCustomer(@PathVariable Long customerId, @RequestBody Interaction interaction) {
        logger.info("POST request received to create interaction for customer ID: {}", customerId);
        
        // Get the customer first
        Customer customer = customerService.getCustomer(customerId);
        if (customer == null) {
            logger.info("Customer not found: {}", customerId);
            return ResponseEntity.status(404).body("Customer not found");
        }
        
        // Set the customer for the interaction
        interaction.setCustomer(customer);
        
        Interaction createdInteraction = interactionService.createInteraction(interaction);
        logger.info("Interaction created successfully with ID: {} for customer ID: {}", createdInteraction.getId(), customerId);
        return ResponseEntity.status(201).body(createdInteraction);
    }

    @PostMapping("/interaction")
    public ResponseEntity<?> createInteraction(@RequestBody InteractionRequest interactionRequest) {
        logger.info("POST request received to create interaction");
        
        Customer customer = customerService.getCustomer(interactionRequest.getCustomerId());
        if (customer == null) {
            logger.info("Customer not found: {}", interactionRequest.getCustomerId());
            return ResponseEntity.status(404).body("Customer not found");
        }
        
        Interaction interaction = new Interaction(interactionRequest.getRemarks(), interactionRequest.getInteractionDate(), customer);
        
        Interaction createdInteraction = interactionService.createInteraction(interaction);
        logger.info("Interaction created successfully with ID: {} for customer ID: {}", createdInteraction.getId(), interactionRequest.getCustomerId());
        return ResponseEntity.status(201).body(createdInteraction);
    }

    public static class InteractionRequest {
        private String remarks;
        private LocalDate interactionDate;
        private Long customerId;

        // Getters and setters
        public String getRemarks() { return remarks; }
        public void setRemarks(String remarks) { this.remarks = remarks; }
        public LocalDate getInteractionDate() { return interactionDate; }
        public void setInteractionDate(LocalDate interactionDate) { this.interactionDate = interactionDate; }
        public Long getCustomerId() { return customerId; }
        public void setCustomerId(Long customerId) { this.customerId = customerId; }
    }

    // Update existing interaction
    @PutMapping("/interaction/{interactionId}")
    public ResponseEntity<?> updateInteraction(@PathVariable Long interactionId, @RequestBody Interaction interaction) {
        logger.info("PUT request received for interaction ID: {}", interactionId);
        
        Interaction updatedInteraction = interactionService.updateInteraction(interactionId, interaction);
        if (updatedInteraction != null) {
            logger.info("Interaction updated successfully with ID: {}", interactionId);
            return ResponseEntity.ok(updatedInteraction);
        } else {
            logger.info("Interaction not found for update: {}", interactionId);
            return ResponseEntity.status(404).body("Interaction not found");
        }
    }

    @DeleteMapping("/interaction/{interactionId}")
    public ResponseEntity<?> deleteInteraction(@PathVariable Long interactionId) {
        logger.info("DELETE request received for interaction ID: {}", interactionId);
        
        boolean deleted = interactionService.deleteInteraction(interactionId);
        if (deleted) {
            logger.info("Interaction deleted successfully with ID: {}", interactionId);
            return ResponseEntity.ok("Interaction deleted successfully");
        } else {
            logger.info("Interaction not found for deletion: {}", interactionId);
            return ResponseEntity.status(404).body("Interaction not found");
        }
    }
}