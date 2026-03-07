class Box{
    double height;
    double width;
    double breath;
    void volume(){
        double volume = height * width * breath;
        System.out.println("Volume: " + volume);
    }
}
public class ClassesObjects {
    public static void main(String[] args){
        Box obj1 = new Box();
        Box obj2 = new Box();
        obj1.height = 2.0;
        obj1.width = 5.0;
        obj1.breath = 3.0;
        obj2.height = 10.0;
        obj2.width = 15.0;
        obj2.breath = 20.0;
        System.out.println("for object 1:");
        System.out.println("Height: " + obj1.height);
        System.out.println("Width: " + obj1.width);
        System.out.println("Breath: " + obj1.breath);
        obj1.volume();
        System.out.println("for object 2:");
        System.out.println("Height: " + obj2.height);
        System.out.println("Width: " + obj2.width);
        System.out.println("Breath: " + obj2.breath);
        obj2.volume();
    }
    
}
