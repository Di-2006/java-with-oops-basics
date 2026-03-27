class Parent{
    int age = 50;
    String name = "Ravi";
    void display(){
        System.out.println("Parent age is : "+age+"\n"+"parent name is : "+name);
    }
}
class Child extends Parent{
    int age;
    void display(){
        super.display();
        System.out.println("Child age = "+age);
        System.out.println("Parent age = "+ super.age+"\n"+"Parent name  = "+name);
    }
}
public class Static {
    public static void main(String[] args){
        Child c = new Child();
        c.display();
    }
}
