import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Fahrenheit : ");
        double fahrenheit = keyboard.nextDouble();

        System.out.println("");
        double celsius = fahrenheit-32;
        celsius = celsius * 5.0;
        celsius = celsius / 9.0;
        double kelvin = celsius + 273.15;

        System.out.printf("Celsius : %.2f\n", celsius);
        System.out.printf("Kelvin  : %.2f", kelvin);
    }
}
