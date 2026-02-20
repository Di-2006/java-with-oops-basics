import java.util.Scanner;
public class Import {
    public static void main(String[] ars){
        int age;
        String name;
        float cgpa;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        age = sc.nextInt();
        cgpa = sc.nextFloat();
        System.out.println("Name : " + name+ " "+ "Age : "+ age + " " + "CGPA : " + cgpa);
    }
    
}
