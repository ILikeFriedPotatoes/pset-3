/**
 * Problem Set 3.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * conditional control structures. It's also your first introduction to methods,
 * so things look a little different. The main method is done for you. Lines 31-40
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet3 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ProblemSet3 ps = new ProblemSet3();

        // comment out or uncomment as needed

        //ps.sign();          // executes Exercise 1
        //ps.parity();        // executes Exercise 2
        //ps.ordered();       // executes Exercise 3
        //ps.gpa();           // executes Exercise 4
<<<<<<< HEAD
        ps.grade();         // executes Exercise 5
        //ps.cards();         // executes Exercise 6
=======
        //ps.grade();         // executes Exercise 5
        ps.cards();         // executes Exercise 6
>>>>>>> 387ef04bbb211525fbda129fc75c147fd944d522
        //ps.leapYear();      // executes Exercise 7
        //ps.state();         // executes Exercise 8
        //ps.months();        // executes Exercise 9
        //ps.salary();        // executes Exercise 10

        in.close();
    }

    /*
     * Exercise 1.
     *
     * Prompt the user to enter an integer. Is it positive, negative, or zero?
     */

    public void sign() {

        System.out.print("Enter an integer: ");
        long firstInteger = in.nextLong();
        if(firstInteger == 0) {
            System.out.print("\nZero.\n");
        } else if (firstInteger > 0) {
            System.out.print("\nPositive.\n");
        } else if (firstInteger < 0) {
            System.out.print("\nNegative.\n");
        }

    }

    /*
     * Exercise 2.
     *
     * Prompt the user to enter an integer. Is it even or odd?
     */

    public void parity() {

        System.out.print("Enter an integer: ");
        long secondInteger = in.nextLong();
        if(secondInteger % 2 == 0) {
            System.out.println("\nEven.");
        } else if (secondInteger % 2 == 1) {
            System.out.println("\nOdd.");
        }

    }

    /*
     * Exercise 3.
     *
     * Prompt the user to enter three integers. How are the integers ordered?
     */

    public void ordered() {
        System.out.println("Enter three integers: \n");
        System.out.print("Enter an integer: ");
        long thirdInteger = in.nextLong();
        System.out.print("Enter an integer: ");
        long fourthInteger = in.nextLong();
        System.out.print("Enter an integer: ");
        long fifthInteger = in.nextLong();
        if(fifthInteger > fourthInteger && fourthInteger > thirdInteger) {
            System.out.println("\nStrictly Increasing.");
        } else if(fifthInteger >= fourthInteger && fourthInteger >= thirdInteger) {
            System.out.println("\nIncreasing.");
        } else if(fifthInteger == fourthInteger && fourthInteger == thirdInteger) {
            System.out.println("\nSame.");
        } else if(fifthInteger <= fourthInteger && fourthInteger <= thirdInteger) {
            System.out.println("\nDecreasing.");
        } else if(fifthInteger < fourthInteger && fourthInteger < thirdInteger) {
            System.out.println("\nStrictly Decreasing.");
        } else {
            System.out.println("\nUnordered.");
        }

    }

    /*
     * Exercise 4.
     *
     * Prompt the user to enter a letter grade. What's the corresponding GPA?
     */

    public void gpa() {
        System.out.print("Enter a letter grade: ");
        String letterGrade = in.nextLine();
        if (letterGrade.equalsIgnoreCase("A+") || letterGrade.equalsIgnoreCase("A")) {
            System.out.print("\nYour GPA is 4.00.\n");
        } else if (letterGrade.equalsIgnoreCase("A-")) {
            System.out.print("\nYour GPA is 3.66.\n");
        } else if (letterGrade.equalsIgnoreCase("B+")) {
            System.out.print("\nYour GPA is 3.33.\n");
        } else if(letterGrade.equalsIgnoreCase("B")) {
            System.out.print("\nYour GPA is 3.00.\n");
        } else if (letterGrade.equalsIgnoreCase("B-")) {
            System.out.print("\nYour GPA is 2.66.\n");
        } else if (letterGrade.equalsIgnoreCase("C+")) {
            System.out.print("\nYour GPA is 2.33.\n");
        } else if (letterGrade.equalsIgnoreCase("C")) {
            System.out.print("\nYour GPA is 2.00.\n");
        } else if (letterGrade.equalsIgnoreCase("C-")) {
            System.out.print("\nYour GPA is 1.66.\n");
        } else if (letterGrade.equalsIgnoreCase("D+")) {
            System.out.print("\nYour GPA is 1.33.\n");
        } else if (letterGrade.equalsIgnoreCase("D")) {
            System.out.print("\nYour GPA is 1.00.\n");
        } else if (letterGrade.equalsIgnoreCase("D-")) {
            System.out.print("\nYour GPA is 0.66.\n");
        } else if (letterGrade.equalsIgnoreCase("F")) {
            System.out.print("\nYour GPA is 0.00.\n");
        }
    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */

    public void grade() {

        System.out.print("Enter a grade: ");
        double grade = in.nextDouble();
        if (grade >= 90 && grade <= 100) {
            System.out.print("\nYou received an A. ");
        } else if (grade >= 80 && grade <= 89) {
            System.out.print("\nYou received a B.");
        } else if (grade >= 70 && grade <=79) {
            System.out.print("\nYou received a C.");
        } else if (grade >= 60 && grade <=69) {
            System.out.print("\nYou received a D.");
        } else if (grade >= 0 && grade <= 59) {
            System.out.print("\nYou received a F.");
        } else if (grade > 100) {
            System.out.print("\nGrades above 100 are invalid");
        } else if (grade < 0) {
            System.out.print("\nGrades below 0 are invalid.");
        } else {
            System.out.print("\nPlease enter a valid grade.");
        }

    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a playing card. What card was entered?
     */

    public void cards() {

        System.out.print("Enter a card: ");
        String cardSuit = in.nextLine();
           
    }

    public void cardRank() {

    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a year. Is it a leap year or not?
     */

    public void leapYear() {

    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */

    public void state() {

    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter a month. How many days are in that month?
     */

    public void months() {

    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */

    public void salary() {

    }
}
