import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Height : ");
        double height = keyboard.nextDouble();
        height = height * 25.4;

        System.out.print("Width  : ");
        double width = keyboard.nextDouble();
        width = width * 25.4;

        System.out.println("");

        double area = height * width;
        System.out.printf("%,.2f square millimeters.",area);
    }
}
