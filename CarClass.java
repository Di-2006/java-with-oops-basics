class Car{
    String colour;
    int seating;
    int Model;
    void display(){
        System.out.println("Colour: " + colour);
        System.out.println("Seating: " + seating);
        System.out.println("Model: " + Model);
    }
}
public class CarClass {
    public static void main(String[] args){
        Car obj1 = new Car();
        Car obj2 = new Car();
        obj1.colour = "Red";
        obj1.seating = 5;
        obj1.Model = 2020;
        obj2.colour = "Blue";
        obj2.seating = 7;
        obj2.Model = 2021;
        System.out.println("for object 1:");
        obj1.display();
        System.out.println("for object 2:");
        obj2.display();
    }
}
