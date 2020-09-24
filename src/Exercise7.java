import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Salary  : ");
        double grossSalary = keyboard.nextDouble();

        System.out.print("401(k)  : ");
        double fourOhOneK = keyboard.nextDouble();

        System.out.print("Federal : ");
        double federalTax = keyboard.nextDouble();

        System.out.print("State   : ");
        double stateTax = keyboard.nextDouble();

        fourOhOneK = fourOhOneK / 100;
        federalTax = federalTax / 100;
        stateTax = stateTax / 100;

        double postFourOhOneKSalary = grossSalary - (fourOhOneK * grossSalary);
        double netSalary = postFourOhOneKSalary - (federalTax * postFourOhOneKSalary) - (stateTax * postFourOhOneKSalary);

        double netMonthlySalary = netSalary/12;
        double netBimonthlySalary = netMonthlySalary / 2;

        System.out.println("");
        System.out.printf("$%,.2f.", netBimonthlySalary);
    }
}
