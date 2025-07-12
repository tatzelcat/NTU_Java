package sg.ntu.spring_demo;

import org.springframework.stereotype.Component;

@Component
public class SampleItem {
    private int id;
    private String name;
    private double price;
    private String desc;


    //Getters and Setters
    public int getID(){
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String name(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc(){
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
