import java.util.*;
public class StringSwitch {
    public static void main(String[] args){
        String month;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month:");
        month = sc.next();
        switch(month){
            case "January":System.out.println("First month of the year");
            break;
            case "February":System.out.println("Second month of the year");
            break;
            case "March":System.out.println("Third month of the year");
            break;
            case "April":System.out.println("Fourth month of the year");
            break;
            case "May":System.out.println("Fifth month of the year");
            break;
            case "June":System.out.println("Sixth month of the year");
            break;
            case "July":System.out.println("Seventh month of the year");
            break;
            case "August":System.out.println("Eighth month of the year");
            break;
            case "September":System.out.println("Ninth month of the year");
            break;
            case "October":System.out.println("Tenth month of the year");
            break;
            case "November":System.out.println("Eleventh month of the year");
            break;
            case "December":System.out.println("Twelfth month of the year");
            break;
            default: System.out.println("Invalid month");
            break;
        }

    
}
}
