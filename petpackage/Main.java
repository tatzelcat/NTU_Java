package petpackage;

public class Main {
    public static void main(String[] args) {
        // Create a cat object
        Pet cat = new Pet("Whiskers", "Persian", "Female", 3, true);
        
        // Create a dog object
        Pet dog = new Pet("Buddy", "Golden Retriever", "Male", 5, true);
        

        // Use methods for the cat
        cat.call("Meow");
        cat.eat("fish");
        cat.sleep();
        

        // Use methods for the dog
        dog.call("Woof");
        dog.eat("bones");
        dog.sleep();
        

        // Using getters
        System.out.println("Cat name: " + cat.getName() + ", Age: " + cat.getAge() + ", Vaccinated: " + cat.getVaccination());
        System.out.println("Dog name: " + dog.getName() + ", Age: " + dog.getAge() + ", Vaccinated: " + dog.getVaccination());
    }
}