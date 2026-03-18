class Vehicle{
    Vehicle(){
        System.out.println("This is a class Vehicle constructor");
    }
}
class fourwheeler extends Vehicle{
    fourwheeler(){
        System.out.println("This is a class fourwheeler constructor");
    }
}
class Car extends fourwheeler{
    Car(){
        System.out.println("This is a class Car constructor");
    }
}
public class InheritanceMultilevel {
    public static void main(String[] args){
        Car obj1 = new Car();
    }
    
}
