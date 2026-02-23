import java.util.*;
public class SwitchStatement {
    public static void main(String[] args){
        int day;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from 0 to 6:");
        day = sc.nextInt();
        switch(day){
            case 0: System.out.println("Sunday");
            break;
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuseday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            default : System.out.println("Invalid day");
            break;
        }


    }
    
}
