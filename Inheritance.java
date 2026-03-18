class Animal{ // superclass or parent class
    String name;
    void sound_animal(){
        System.out.println("this is a Animal class");
    }
}
class cat extends Animal{ // subclass or child class
    void sound(){
        System.out.println("This is a cat class");
    }}
class dog extends Animal{
    void sound(){
        System.out.println("THis ia a dog class");
    }
}
class cow extends Animal{
    void sound(){
        System.out.println("this is a cow class");
    }
}
public class Inheritance {
    public static void main(String[] args){
        dog obj1 = new dog();
        obj1.sound();
        obj1.sound_animal();
        obj1.name = "tom";
        Animal obj = new Animal();
        obj.sound_animal();
        cat obj2 = new cat();
        obj2.name = "jerry";
        obj2.sound();
        obj2.sound_animal();
        cow obj3 = new cow();
        obj3.name = "mow";
        obj3.sound();
        obj3.sound_animal();
    }
    
}
