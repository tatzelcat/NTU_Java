package sg.ntu.simple_crm;

import org.springframework.stereotype.Component;

@Component
public class Customer {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String contactNo;
    private String jobTitle;
    private int yearofBirth;


    //Getters and Setters
    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getFirstName() {
       return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo(){
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getJobTitle(){
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getYearOfBirth(){
        return yearofBirth;
    }

    public void setYearOfBirth(int yearofBirth) {
        this.yearofBirth = yearofBirth;
    }

}