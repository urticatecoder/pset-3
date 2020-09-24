import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Amount   : ");
        double dollarAmount = keyboard.nextDouble();

        double numOfQuarters = dollarAmount / 0.25;
        numOfQuarters = (int) numOfQuarters;

        double numOfDimes = (dollarAmount - (numOfQuarters*0.25)) / 0.1;
        numOfDimes = (int) numOfDimes;

        double numOfNickels = (dollarAmount - (numOfQuarters*0.25) - (numOfDimes*0.1)) / 0.05;
        numOfNickels = (int) numOfNickels;

        double numOfPennies = (dollarAmount - (numOfQuarters*0.25) - (numOfDimes*0.1) - (numOfNickels*0.05)) / 0.01;

        System.out.println("");
        System.out.printf("Quarters : %.0f\n", numOfQuarters);
        System.out.printf("Dimes    : %.0f\n", numOfDimes);
        System.out.printf("Nickels  : %.0f\n", numOfNickels);
        System.out.printf("Pennies  : %.0f\n", numOfPennies);


    }
}
