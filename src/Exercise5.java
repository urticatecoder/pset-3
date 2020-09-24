import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Homework 1 : ");
        double homeworkOne = keyboard.nextDouble();

        System.out.print("Homework 2 : ");
        double homeworkTwo = keyboard.nextDouble();

        System.out.print("Homework 3 : ");
        double homeworkThree = keyboard.nextDouble();

        System.out.print("Quiz 1     : ");
        double quizOne = keyboard.nextDouble();

        System.out.print("Quiz 2     : ");
        double quizTwo = keyboard.nextDouble();

        System.out.print("Test 1     : ");
        double testOne = keyboard.nextDouble();

        double homeworkAverage = (homeworkOne + homeworkTwo + homeworkThree) / 3;
        double quizAverage = (quizOne + quizTwo) / 2;
        double testAverage = testOne;

        double homeworkWeighted = homeworkAverage * 0.15;
        double quizWeighted = quizAverage * 0.35;
        double testWeighted = testAverage * 0.5;

        double weightedAverage = homeworkWeighted + quizWeighted + testWeighted;

        System.out.println("");

        System.out.printf("%.2f%%.", weightedAverage);

    }
}
