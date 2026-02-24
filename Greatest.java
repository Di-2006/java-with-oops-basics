import java.util.*;
public class Greatest {
    public static void main(String[] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("Gretest number is : "+ a);
        }
        else if(b>c && b>a){
            System.out.println("Greatest number is: "+b);
        }
        else if(a==b && a>c ){
            System.out.println(+ a + " "+b+" Both are greatest numbers");
        }
        else if(a==c && a>b){
             System.out.println(+ a + " "+c+" Both are greatest numbers");
        }
        else if(b==c && b>a){
             System.out.println(+ b  + " "+c+" Both are greatest numbers");
        }

        else{
            System.out.println("Greates number is : " + c);
        }


    }
}
