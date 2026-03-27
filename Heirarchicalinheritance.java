class Vehical{
    int wheels;
    String type;
    Vehical(){
        wheels = 10;
        type = "truck";
    }
    void display(){
        System.out.println("This is vehical class");
    }
}
class car extends Vehical{ /// default super(); is called here if not mentioned
    car(){
        wheels = 4;
        type = "passanger";
    }
    void display_car(){
        System.out.println("Wheels = "+wheels+"Type = "+type);
    }
}
class bus extends Vehical{
    void display_bus(){
        System.out.println("Wheels = "+wheels+"Type = "+type);
    }
}
public class Heirarchicalinheritance {
    public static void main(String[] args){ ///driver class
        car c = new car();
        c.display_car();
        bus b = new bus();
        b.display_bus();
    }
    
}

