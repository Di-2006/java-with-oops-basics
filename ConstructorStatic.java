
class Parent{
    int age = 50;
    String name = "Ravi";
    Parent(){
        age = 60;
        name = "some";
    }
}
class Child extends Parent{
    int age;
    Child(){
        age = 20;
    }
    void display(){
        System.out.println("Child age = "+age);
        System.out.println("Parent age = "+ super.age+"\n"+"Parent name  = "+name);
    }
}
public class ConstructorStatic {
    public static void main(String[] args){
        Child c = new Child();
        c.display();
    }
    
}
