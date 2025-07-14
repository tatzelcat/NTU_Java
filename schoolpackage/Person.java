package schoolpackage;

import java.util.Scanner;


class Person {
    //Properties
    public String name;
    public int age;
    public String gender;

    //Constructor
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //Methods
    public void greet(){       
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your name? ");
        String inputName = scanner.nextLine();
        System.out.println("Hello " + inputName + "!");
    }

    public void introduce(){
        System.out.println("Hello, my name is " + this.name);
    }

    public void haveBirthday(){
        this.age ++;
    }

    //Getters and setters

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }


}
