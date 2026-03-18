class Vehicle{
    String Name;
    Vehicle(){
        System.out.println("Constructor of vehicle class");
    }
}
class car extends Vehicle{
    car(){
        System.out.println("Constructor of car class");
    }
}
public class InheitanceSingle {
    public static void main(String[] args){
        car obj1 = new car();
    }
}
