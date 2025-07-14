package petpackage;

public class Pet {

    //Attributes
    private String name;
    private String breed;
    private String gender;
    private Integer age;
    private Boolean isVaccinated;

    //Empty constructor
    public Pet(){
    }

    //Parameterized constructor
    public Pet(String name, String breed, String gender, Integer age, Boolean isVaccinated) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.isVaccinated = isVaccinated;
    }

    //Method 1 - prints sound 3 times
    public void call(String sound) {
        System.out.println(sound + " " + sound + " " + sound);
    }

    //Method 2 - prints "'name' loves eating 'food'"
    public void eat(String food) {
        System.out.println(name + " loves eating " + food);
    }

    //Method 3 - prints "'name' is currently sleeping"
    public void sleep() {
        System.out.println(name + " is currently sleeping");
    }

    //Getters
    public String getName(){
        return name;
    }

    public String getBreed(){
        return breed;
    }

    public String getGender(){
        return gender;
    }

    public Integer getAge(){
        return age;
    }

    public Boolean getVaccination(){
        return isVaccinated;
    }


    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public void setVaccination(Boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

}