package sg.ntu.simple_crm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InteractionRepository extends JpaRepository<Interaction, Long> {
    // JpaRepository provides all basic CRUD operations:
    // - save(S entity) - for create and update
    // - findById(ID id) - returns Optional<Interaction>
    // - findAll() - returns List<Interaction>
    // - deleteById(ID id)
    // - existsById(ID id)
    // - count()
    // - delete(T entity)
    
    // You can add custom query methods here if needed
    // For example:
    // List<Interaction> findByInteractionDate(LocalDate date);
    // List<Interaction> findByRemarksContaining(String keyword);
}
