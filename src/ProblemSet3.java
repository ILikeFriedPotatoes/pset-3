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
        ps.grade();         // executes Exercise 5
        //ps.cards();         // executes Exercise 6
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

        System.out.print("\nEnter an integer: ");
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

        System.out.print("\nEnter an integer: ");
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
        System.out.println("\nEnter three integers: \n");
        System.out.print("Enter an integer: ");
        long thirdInteger = in.nextLong();
        System.out.print("Enter an integer: ");
        long fourthInteger = in.nextLong();
        System.out.print("Enter an integer: ");
        long fifthInteger = in.nextLong();
        in.nextLine();
        if(fifthInteger > fourthInteger && fourthInteger > thirdInteger) {
            System.out.println("\nStrictly Increasing.\n");
        } else if(fifthInteger == fourthInteger && fourthInteger == thirdInteger) {
            System.out.println("\nSame.\n");
        } else if(fifthInteger >= fourthInteger && fourthInteger >= thirdInteger) {
            System.out.println("\nIncreasing.\n");
        } else if(fifthInteger < fourthInteger && fourthInteger < thirdInteger) {
            System.out.println("\nStrictly Decreasing.\n");
        } else if(fifthInteger <= fourthInteger && fourthInteger <= thirdInteger) {
            System.out.println("\nDecreasing.\n");
        } else {
            System.out.println("\nUnordered.\n");
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
        letterGrade = letterGrade.toUpperCase();
        switch (letterGrade) {
            case "A+":
                System.out.println("\nYour GPA is 4.00.");
                break;
            case "A":
                System.out.println("\nYour GPA is 4.00.");
                break;
            case "A-":
                System.out.println("\nYour GPA is 3.66.");
                break;
            case "B+":
                System.out.println("\nYour GPA is 3.33.");
                break;
            case "B":
                System.out.println("\nYour GPA is 3.00.");
                break;
            case "B-":
                System.out.println("\nYour GPA is 2.66.");
                break;
            case "C+":
                System.out.println("\nYour GPA is 2.33.");
                break;
            case "C":
                System.out.println("\nYour GPA is 2.00.");
                break;
            case "C-":
                System.out.println("\nYour GPA is 1.66.");
                break;
            case "D+":
                System.out.println("\nYour GPA is 1.33.");
                break;
            case "D":
                System.out.println("\nYour GPA is 1.00.");
                break;
            case "D-":
                System.out.println("\nYour GPA is 0.66.");
                break;
            case "F":
                System.out.println("\nYour GPA is 0.00.");
                break;
            default:
                System.out.println("\nThat's not a valid letter grade.");
        }
    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */

    public void grade() {

        System.out.print("\nEnter a grade: ");
        double grade = in.nextDouble();
        in.nextLine();
        if (grade >= 90 && grade <= 100) {
            System.out.print("\nYou received an A.");
        } else if (grade >= 80 && grade <= 89) {
            System.out.print("\nYou received a B.");
        } else if (grade >= 70 && grade <=79) {
            System.out.print("\nYou received a C.");
        } else if (grade >= 60 && grade <=69) {
            System.out.print("\nYou received a D.");
        } else if (grade >= 0 && grade <= 59) {
            System.out.print("\nYou received a F.");
        } else if (grade > 100) {
            System.out.print("\nGrades above 100 are invalid/");
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
        System.out.print("\n\nEnter a card: ");
        String cardSuitAndRank = in.nextLine();
        String cardSuit;
        String cardRank = cardRank(cardSuitAndRank);
        switch (cardSuitAndRank.substring(1, 2).toLowerCase()) {
            case "c":
                cardSuit = "Clubs";
                break;
            case "d":
                cardSuit = "Diamonds";
                break;
            case "h":
                cardSuit = "Hearts";
                break;
            case "s":
                cardSuit = "Spades";
                break;
            default:
                cardSuit = "false";
        }
        if(cardSuit == "false") {
            System.out.print("\nThat's not a valid suit.");
        } else if(cardRank == "false") {
            System.out.print("\nThat's not a valid rank.");
        } else {
            System.out.printf("\n%s of %s.", cardRank, cardSuit);
        }
    }

    //Returns the rank of the card given the character representing the rank
    public String cardRank(String cardSuitAndRank) {
        String cardRank;
        switch (cardSuitAndRank.substring(0, 1).toLowerCase()) {
            case "2":
                cardRank = "Two";
                return cardRank;
            case "3":
                cardRank = "Three";
                return cardRank;
            case "4":
                cardRank = "Four";
                return cardRank;
            case "5":
                cardRank = "Five";
                return cardRank;
            case "6":
                cardRank = "Six";
                return cardRank;
            case "7":
                cardRank = "Seven";
                return cardRank;
            case "8":
                cardRank = "Eight";
                return cardRank;
            case "9":
                cardRank = "Nine";
                return cardRank;
            case "t":
                cardRank = "Ten";
                return cardRank;
            case "j":
                cardRank = "Jack";
                return cardRank;
            case "q":
                cardRank = "Queen";
                return cardRank;
            case "k":
                cardRank = "King";
                return cardRank;
            case "a":
                cardRank = "Ace";
                return cardRank;
        }
        return "false";
    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a year. Is it a leap year or not?
     */

    public void leapYear() {
        System.out.print("\n\nEnter a year: ");
        long year = in.nextLong();
        if(year % 400 == 0) {
            System.out.printf("\n%d is a leap year.", year);
        } else if (year % 100 == 0) {
            System.out.printf("\n%d is not a leap year.", year);
        } else if (year % 4 == 0) {
            System.out.printf("\n%d is a leap year.", year);
        } else {
            System.out.printf("\n%d is not a leap year.", year);
        }
    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */

    public void state() {
        System.out.print("\n\nEnter a temperature: ");
        double temperature = in.nextDouble();
        System.out.print("Enter a scale: ");
        char scale = in.next().charAt(0);
        in.nextLine();
        scale = Character.toLowerCase(scale);
        String state = "This is a bug.";
        if (scale == 'f') {
            state = determineStateFahrenheit(temperature);
        } else if (scale == 'c') {
            state = determineStateCelsius(temperature);
        } else {
            System.out.print("That's not a valid scale.");
        }
        System.out.printf("\n%s",state);
    }

    //Calculates the state on a Fahrenheit scale
    public String determineStateFahrenheit(double temperature) {
        if(temperature >= 212) {
            return "Gas.";
        } else if (temperature > 32 && temperature < 212) {
            return "Liquid";
        } else if (temperature <= 32) {
            return "Solid";
        }
        return "This is a bug";
    }

    //Calculates the states on a Celsius scale
    public String determineStateCelsius(double temperature) {
        if(temperature >= 100) {
            return "Gas.";
        } else if (temperature > 0 && temperature < 100) {
            return "Liquid";
        } else if (temperature <= 0) {
            return "Solid";
        }
        return "This is a bug";
    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter a month. How many days are in that month?
     */

    public void months() {
        System.out.print("\n\nEnter a month: ");
        String month = in.nextLine();
        System.out.println("");
        month = month.toLowerCase();
        switch (month) {
            case "january":
                System.out.print("31 days.");
                break;
            case "jan":
                System.out.print("31 days.");
                break;
            case "jan.":
                System.out.print("31 days.");
                break;
            case "janu":
                System.out.print("31 days.");
                break;
            case "janu.":
                System.out.print("31 days.");
                break;
            case "february":
                System.out.print("28 or 29 days.");
                break;
            case "feb":
                System.out.print("28 or 29 days.");
                break;
            case "feb.":
                System.out.print("28 or 29 days.");
                break;
            case "febr":
                System.out.print("28 or 29 days.");
                break;
            case "febr.":
                System.out.print("28 or 29 days.");
                break;
            case "march":
                System.out.print("31 days");
                break;
            case "mar":
                System.out.print("31 days");
                break;
            case "mar.":
                System.out.print("31 days");
                break;
            case "marc":
                System.out.print("31 days");
                break;
            case "marc.":
                System.out.print("31 days");
                break;
            case "may":
                System.out.print("31 days.");
                break;
            case "may.":
                System.out.print("31 days.");
                break;
            case "april":
                System.out.print("30 days.");
                break;
            case "apr":
                System.out.print("30 days.");
                break;
            case "apr.":
                System.out.print("30 days.");
                break;
            case "apri":
                System.out.print("30 days.");
                break;
            case "apri.":
                System.out.print("30 days.");
                break;
            case "june":
                System.out.print("31 days.");
                break;
            case "jun":
                System.out.print("31 days.");
                break;
            case "jun.":
                System.out.print("31 days.");
                break;
            case "june.":
                System.out.print("31 days.");
                break;
            case "july":
                System.out.print("31 days.");
                break;
            case "jul":
                System.out.print("31 days.");
                break;
            case "jul.":
                System.out.print("31 days.");
                break;
            case "july.":
                System.out.print("31 days.");
                break;
            case "august":
                System.out.print("31 days.");
                break;
            case "aug":
                System.out.print("31 days.");
                break;
            case "aug.":
                System.out.print("31 days.");
                break;
            case "augu":
                System.out.print("31 days.");
                break;
            case "augu.":
                System.out.print("31 days.");
                break;
            case "september":
                System.out.print("30 days.");
                break;
            case "sep":
                System.out.print("30 days.");
                break;
            case "sep.":
                System.out.print("30 days.");
                break;
            case "sept":
                System.out.print("30 days.");
                break;
            case "sept.":
                System.out.print("30 days.");
                break;
            case "october":
                System.out.print("31 days.");
                break;
            case "oct":
                System.out.print("31 days.");
                break;
            case "oct.":
                System.out.print("31 days.");
                break;
            case "octo":
                System.out.print("31 days.");
                break;
            case "octo.":
                System.out.print("31 days.");
                break;
            case "november":
                System.out.print("30 days.");
                break;
            case "nov":
                System.out.print("30 days.");
                break;
            case "nov.":
                System.out.print("30 days.");
                break;
            case "nove":
                System.out.print("30 days.");
                break;
            case "nove.":
                System.out.print("30 days.");
                break;
            case "december":
                System.out.print("31 days.");
                break;
            case "dec":
                System.out.print("31 days.");
                break;
            case "dec.":
                System.out.print("31 days.");
                break;
            case "dece":
                System.out.print("31 days.");
                break;
            case "dece.":
                System.out.print("31 days.");
                break;
            default:
                System.out.print("That's not a valid month.");
        }
    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */

    public void salary() {
        final double OVERTIME_THRESHOLD = 40;
        final double OVERTIME_MULTIPLIER = 1.5;
        System.out.print("\n\nWage: ");
        double wage = in.nextDouble();
        System.out.print("Hours: ");
        double hours = in.nextDouble();
        double salary;
        if (hours > 40) {
            salary = (OVERTIME_THRESHOLD * wage) + ((hours - OVERTIME_THRESHOLD) * OVERTIME_MULTIPLIER * wage);
            System.out.printf("You will make %,.2f this week.", salary);
        } else if (hours < 40 && hours >= 0 && wage >= 0){
            salary = hours * wage;
            System.out.printf("\nYou will make %,.2f this week.", salary);
        } else if (wage < 0){
            System.out.print("\nYour wage must be greater than or equal to $0.00/hour.");
        } else if (hours < 0) {
            System.out.print("\nYour hours must be greater than or equal to 0.0.");
        } else {
            System.out.print("\nThis is a bug");
        }
    }
}
