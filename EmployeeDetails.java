import java.util.Scanner;
public class EmployeeDetails {
    public static void main(String[] args){
        String name;
        int age;
        long phonenumber;
        float salary;
        String department;
        char gender;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        age = sc.nextInt();
        phonenumber = sc.nextLong();
        salary = sc.nextFloat();
        department = sc.next();
        gender = sc.next().charAt(0);
        System.out.println("The name is : " + name );
        System.out.println("The age is :" + age);
        System.out.println("The PhoneNumber is:" + phonenumber);
        System.out.println("The salary is :" + salary);
        System.out.println("The department is : " + department);
        System.out.println("The gender is : " + gender);
    }



    
}
