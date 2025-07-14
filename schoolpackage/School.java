package schoolpackage;

class School implements Building {
    
    //Properties
    public String name;
    public int numberOfFloors;
    public String address;

    //constructors
    public School() {
        this.name = "";
        this.numberOfFloors = 0;
        this.address = "";
    }

    public School(String name, int numberOfFloors, String address) {
        this.name = name;
        this.numberOfFloors = numberOfFloors;
        this.address = address;
    }

    //Methods
    public void addFloor(int floors) {
        this.numberOfFloors += floors;
    }

    public void describe() {
        System.out.println("School Name: " + this.name);
        System.out.println("Address: " + this.address);
    }


}