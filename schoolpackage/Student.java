package schoolpackage;

public class Student extends Person {
    //properties
    private int yrLevel;

    //constructor
    public Student(String name, int age, String gender, int yrLevel){
        super(name, age, gender);
        this.yrLevel = yrLevel;
    }

    //Methods
    @Override
    public void introduce(){
        System.out.println("Hello, my name is " + this.name + " and I am a " + this.yrLevel + " student.");
    }

    //Getters and setters
    public int getYrLevel(){
        return yrLevel;
    }

    public void setYrLevel(int yrLevel){
        this.yrLevel = yrLevel;
    }

}