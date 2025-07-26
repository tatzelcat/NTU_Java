package sg.ntu.simple_crm;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "interaction")
public class Interaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "interaction_date")
    private LocalDate interactionDate;

    @ManyToOne(optional = false)
    private Customer customer;

    // Default constructor (required by JPA)
    public Interaction() {
    }

    // Constructor without id (for creating new interactions)
    public Interaction(String remarks, LocalDate interactionDate, Customer customer) {
        this.remarks = remarks;
        this.interactionDate = interactionDate;
        this.customer = customer;
    }

    // Constructor with id (for loading from database)
    public Interaction(Long id, String remarks, LocalDate interactionDate, Customer customer) {
        this.id = id;
        this.remarks = remarks;
        this.interactionDate = interactionDate;
        this.customer = customer;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public LocalDate getInteractionDate() {
        return interactionDate;
    }

    public void setInteractionDate(LocalDate interactionDate) {
        this.interactionDate = interactionDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
