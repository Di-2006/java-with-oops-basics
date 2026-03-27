class Vehicle{
    int wheels;
    String type;
    void display(){
        System.out.println("This is vehicle class");
    }
}
class car extends Vehicle{
    void display(){
        System.out.println("car class Number of wheels : "+wheels);
    }
}
class bus extends Vehicle{
    void display(){
        System.out.println("bus class Number of wheels :"+wheels);
    }
}
class Mini extends bus{
    void display(){
        System.out.println("MIni class number of wheels :"+wheels);
    }
}
public class Hybridinheritance {
    public static void main(String[] args){
        Mini m = new Mini();
        m.display();
    }
}
