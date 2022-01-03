package academy.learnprogrammng;

//statement that creates a new class in Java
//class can be thought of as a powerful user defined data type
//enable you to have a powerful user defined data type; way m ore powerful than primitive type
public class Main {

    public static void main(String[] args) {
        //how we define a new object of Car named porsche
        Car porsche = new Car();
        Car holden = new Car();
        //for our object porshce, the model is Carrera >> not a good way to access field
//        porsche.model = "Carrera";
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
