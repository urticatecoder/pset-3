import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Wage      : ");
        double hourlyWage = keyboard.nextDouble();

        System.out.print("Monday    : ");
        double mondayHours = keyboard.nextDouble();

        System.out.print("Tuesday   : ");
        double tuesdayHours = keyboard.nextDouble();

        System.out.print("Wednesday : ");
        double wednesdayHours = keyboard.nextDouble();

        System.out.print("Thursday  : ");
        double thursdayHours = keyboard.nextDouble();

        System.out.print("Friday    : ");
        double fridayHours = keyboard.nextDouble();

        System.out.print("Saturday  : ");
        double saturdayHours = keyboard.nextDouble();

        System.out.print("Sunday    : ");
        double sundayHours = keyboard.nextDouble();

        double weeklyPay = hourlyWage * (mondayHours + tuesdayHours + wednesdayHours + thursdayHours + fridayHours + saturdayHours + sundayHours);

        System.out.println("");

        System.out.printf("$%,.2f.", weeklyPay);
    }
}
