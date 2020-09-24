import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Height : ");
        double height = keyboard.nextDouble();
        height = height * 2.54;

        System.out.print("Width  : ");
        double width = keyboard.nextDouble();
        width = width * 2.54;

        System.out.println("");

        double perimeter = (2*height) + (2*width);
        System.out.printf("%.2f centimeters.", perimeter);
    }
}
