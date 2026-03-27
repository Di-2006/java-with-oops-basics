interface Landvehicle{
    void display();  // abstract
}
interface WaterVehicle {
    void display();
}
class AmphiVehicle implements Landvehicle,WaterVehicle{
    public void display(){
        System.out.println("Mutilple inheritance");
    }
}
public class Multipleinheritance {
    public static void main(String[] args){
    AmphiVehicle ob1 = new AmphiVehicle();
    ob1.display();
    }
}
