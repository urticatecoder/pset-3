import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Students : ");
        int students = keyboard.nextInt();

        System.out.print("Teachers : ");
        int teachers = keyboard.nextInt();

        System.out.print("Capacity : ");
        int capacity = keyboard.nextInt();

        int totalPeople = students + teachers;
        int busesRequired = totalPeople / capacity;
        int overflow = totalPeople % capacity;

        double modifiedOverflow = overflow - 0.0000001;

        busesRequired += overflow/modifiedOverflow;

        System.out.println("");
        System.out.printf("Buses required      : %d\n", busesRequired);
        System.out.printf("Overflow passengers : %d",overflow);

    }
}
