package academy.learnprogrammng;

//public is access modifier that id's what access we want people to have
//public is unrestricted classes; other classes have access to this class
//other modifiers are private, protected, and also remove completely
//class is a blueprint for an object we are going to create
//variables === fields
//when defining fields need to specify access modifier also >> typically private
//private is adhering to encapsulation
//encapsulation is hiding fields from external views
public class Car {

    //this is the state of the car defined by using 'fields'
    //dont allow a class outside of the Car class to access these variables
    //if you want these accessed outside, change to public
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        //validations for object that's setting model can't set to invalid types
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }

}
