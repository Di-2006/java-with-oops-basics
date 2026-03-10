class Student{
    String name;
    int age;
    int marks1;
    int marks2;
    int marks3;
    Student(){
        marks1 = 0;
        marks2 = 0;
        marks3 = 0;
        name = "Null";
        age = 0;
    }
    Student(String name,int age,int marks1,int marks2,int marks3){
        this.name = name;
        this.age = age;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    void average(){
        int avg ;
        avg = (marks1+marks2+marks3)/3;
        System.out.println(+avg);
    }
}
public class StudentClass {
    public static void main(String[] args){
        Student obj1 = new Student("divya",21,10,20,30);
        System.out.println(obj1.name+" "+obj1.age);
        obj1.average();


    }

    
}
