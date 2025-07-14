package schoolpackage;

public class Teacher extends Person {
    //properties
    private String subject;

    //constructor
    public Teacher (String name, int age, String gender, String subject){
        super(name, age, gender);
        this.subject = subject;
    }
    
    //Methods
    @Override
    public void introduce(){
        System.out.println("Hello, my name is " + this.name + " and I will be teaching you " + this.subject);
    }

    //Getter and setter
    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

}