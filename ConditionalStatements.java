import java.util.Scanner;
class ConditionalStatements {
    public static void main(String[] args) {
        int num1, num2,num3;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        // only if statements
        if(num1 > num2 && num1 > num3){
            System.out.println("num1 is the greater number");
        }
        if(num2 > num1 && num2 > num3){
            System.out.println("num2 is the greater number");
        }
        System.out.println("num3 is the greater number");
        // if-else statements
        if(num1 > num2 && num1 > num3){
            System.out.println("num1 is the greater number");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println("num2 is the greater number");
        }
        else{
            System.out.println("num3 is the greater number");
        }
        // nested if statements
        if(num1 > num2){ 
            if(num1 > num3){
                System.out.println("num1 is the greater number");
            }
            else{
                System.out.println("num3 is the greater number");
            }
        }
        else{
            if(num2 > num3){
                System.out.println("num2 is the greater number");
            }
            else{
                System.out.println("num3 is the greater number");
            }
        }   
    }
}