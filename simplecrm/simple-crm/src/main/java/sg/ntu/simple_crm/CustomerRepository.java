package sg.ntu.simple_crm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // JpaRepository provides all basic CRUD operations:
    // - save(S entity) - for create and update
    // - findById(ID id) - returns Optional<Customer>
    // - findAll() - returns List<Customer>
    // - deleteById(ID id)
    // - existsById(ID id)
    // - count()
    // - delete(T entity)
    
    // You can add custom query methods here if needed
    // For example:
    // List<Customer> findByFirstName(String firstName);
    // List<Customer> findByEmail(String email);
    // List<Customer> findByYearOfBirthGreaterThan(int year);
}