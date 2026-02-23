import java.util.*;
public class CharSwitch {
    public static void main(String[] args){
        char colour;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the colour (R, G, B):");
        colour = sc.next().charAt(0);
        switch(colour){
            case 'R':System.out.println("Red");
            break;
            case 'G':System.out.println("Green");
            break;
            case 'B':System.out.println("Blue");
            break;
            default: System.out.println("Invalid colour");
            break;}
    }
    
}
