package schoolpackage;


public class Main {
    public static void main(String[] args) {

    School mySchool = new School("Nanyang Technical University", 5, "42 Nanyang Road");

    Teacher teacher1 = new Teacher("Miss Jones", 35, "Female", "Literature");
    Teacher teacher2 = new Teacher("Mr James", 39, "Male", "History");
    
    Student student1 = new Student("Alice", 20, "Female", 2);
    Student student2 = new Student("Bob", 21, "Male", 3);

        System.out.println("=== SCHOOL INFORMATION ===");
        mySchool.describe();
        
        System.out.println("\nAdding 2 more floors to the school...");
        mySchool.addFloor(2);
        System.out.println("Floors after addition: " + mySchool.numberOfFloors);
        
        // Use methods of Teacher object
        System.out.println("\n === TEACHER INTRODUCTION ===");
        teacher1.introduce();
        teacher2.introduce();
        
        System.out.println("\nTeacher having a birthday...");
        teacher1.haveBirthday();
        System.out.println("Teacher's new age: " + teacher1.getAge());
        
        // Use methods of Student objects
        System.out.println("\n === STUDENT INTRODUCTIONS ===");
        student1.introduce();
        student2.introduce();
        
        System.out.println("\n" + student1.name + " is having a birthday...");
        student1.haveBirthday();
        System.out.println(student1.name +"'s new age: " + student1.getAge());
        
        System.out.println("\nStudent 2 greeting someone:");
        student2.greet();
        
        // Demonstrate getters and setters
        System.out.println("\n=== USING GETTERS AND SETTERS ===");
        System.out.println(teacher1.name +"'s subject: " + teacher1.getSubject());
        teacher1.setSubject("Advanced Mathematics");
        System.out.println(teacher1.name +"'s updated subject: " + teacher1.getSubject());
        
        System.out.println(student1.name +"'s year level: " + student1.getYrLevel());
        student1.setYrLevel(3);
        System.out.println(student1.name + "'s updated year level: " + student1.getYrLevel());
    }

}