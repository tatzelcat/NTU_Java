package sg.ntu.simple_crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class InteractionServiceImpl implements InteractionService {

    @Autowired
    private InteractionRepository interactionRepository;

    @Override
    public Interaction createInteraction(Interaction interaction) {
        return interactionRepository.save(interaction);
    }

    @Override
    public Interaction getInteraction(Long id) {
        return interactionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Interaction> getAllInteractions() {
        return interactionRepository.findAll();
    }

    @Override
    public Interaction updateInteraction(Long id, Interaction interaction) {
        // Check if interaction exists first
        Optional<Interaction> optionalInteraction = interactionRepository.findById(id);
        if (optionalInteraction.isEmpty()) {
            return null;
        }
        
        // Retrieve the interaction from the database
        Interaction interactionToUpdate = optionalInteraction.get();
        
        // Update the interaction retrieved from the database
        interactionToUpdate.setRemarks(interaction.getRemarks());
        interactionToUpdate.setInteractionDate(interaction.getInteractionDate());
        interactionToUpdate.setCustomer(interaction.getCustomer());
        
        // Save the updated interaction back to the database
        return interactionRepository.save(interactionToUpdate);
    }

    @Override
    public boolean deleteInteraction(Long id) {
        // Check if interaction exists first
        if (!interactionRepository.existsById(id)) {
            return false;
        }
        interactionRepository.deleteById(id);
        return true;
    }
}