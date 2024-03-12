
import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class FractionArithmetic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //initialization of values
        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction();
        Fraction toReduce = new Fraction(); //for obtaining simplified output

        //for input validation of the menu
        boolean availfrac1 = false;
        boolean availfrac2 = false;
        boolean availopt = false;
        boolean isProblematic = true;

        int choice =0 ;

        do { //loop for showing the menu every after execution of an option
            System.out.println("\n+------------------------------------------+");
            System.out.println("|  What do you want to do?                 |");
            System.out.println("|     1. Enter value of fraction 1         |");
            System.out.println("|     2. Enter value of fraction 2         |");
            System.out.println("|     3. Add fractions                     |");
            System.out.println("|     4. Subtract fractions                |");
            System.out.println("|     5. Multiply fractions                |");
            System.out.println("|     6. Divide fractions                  |");
            System.out.println("|     7. Reduce a fraction                 |");
            System.out.println("|     8. Quit                              | ");
            System.out.println("+------------------------------------------+\n");
            System.out.print("Enter choice: ");

            choice = getUserChoice();


            //switch case to assign corresponding instructions to a specific option or number
            switch (choice) {
                case 1:
                    fraction1.inputValues();
                    availfrac1 = true;
                    break;
                case 2:
                    fraction2.inputValues();
                    availfrac2 = true;
                    break;

                case 3:
                    if (availfrac1 == false || availfrac2 == false){ //to check whether there are inputs present in fraction1 and fraction2
                        System.out.println("\nNOTE: PLEASE INPUT FIRST THE VALUE OF FRACTIONS 1 AND 2!\n");
                    }else {
                        System.out.println("Value of fraction 1: " + fraction1.toString());
                        System.out.println("Value of fraction 2: " + fraction2.toString());
                        toReduce = fraction1.addFraction(fraction2);
                        System.out.print("Sum in Fraction: ");
                        toReduce.toStringOutput();
                        System.out.print("Sum in Decimal: ");
                        toReduce.convertToDecimal();
                        availopt = true;
                    }
                    break;
                case 4:
                    if (availfrac1 == false || availfrac2 == false){

                        System.out.println("\nNOTE: PLEASE INPUT FIRST THE VALUE OF FRACTIONS 1 AND 2!\n");
                    }else{
                        System.out.println("Value of fraction 1: " + fraction1.toString());
                        System.out.println("Value of fraction 2: " + fraction2.toString());
                        toReduce = fraction1.subFractions(fraction2);
                        System.out.print("Difference in Fraction: ");
                        toReduce.toStringOutput();
                        System.out.print("Difference in Decimal: ");
                        toReduce.convertToDecimal();

                        availopt = true;
                    }
                    break;
                case 5:
                    if (availfrac1 == false || availfrac2 == false){
                        System.out.println("\nNOTE: PLEASE INPUT FIRST THE VALUE OF FRACTIONS 1 AND 2!\n");

                    }else{
                        System.out.println("Value of fraction 1: " + fraction1.toString());
                        System.out.println("Value of fraction 2: " + fraction2.toString());
                        toReduce = fraction1.multiplyFractions(fraction2);
                        System.out.print("Product in Fraction: ");
                        toReduce.toStringOutput();
                        System.out.print("Product in Decimal: ");
                        toReduce.convertToDecimal();
                        availopt = true;
                    }
                    break;
                case 6:
                    if (availfrac1 == false || availfrac2 == false){
                        System.out.println("\nNOTE: PLEASE INPUT FIRST THE VALUE OF FRACTIONS 1 AND 2!\n");
                    }else{
                        System.out.println("Value of fraction 1: " + fraction1.toString());
                        System.out.println("Value of fraction 2: " + fraction2.toString());
                        toReduce = fraction1.divideFractions(fraction2);
                        System.out.print("Quotient in fraction: " );
                        toReduce.toStringOutput();
                        System.out.print("Quotient in Decimal: ");
                        toReduce.convertToDecimal();
                        availopt = true;
                    }
                    break;
                case 7:
                    if (availfrac1 == false || availfrac2 == false){
                        System.out.println("\nNOTE: PLEASE INPUT FIRST THE VALUE OF FRACTIONS 1 AND 2!\n");
                    }else if(availopt == false){
                        System.out.println("\nNOTE: PLEASE CHOOSE AN OPERATION FIRST!\n");
                    }else{
                        System.out.println("Value of fraction to be simplified: " + toReduce.toString());
                        System.out.println();
                        if (toReduce.reduceFraction().getNumerator() == toReduce.reduceFraction().getDenominator())
                            System.out.print("Simplified value: 1" );
                        else {
                            System.out.print("Simplified fraction: ");
                            toReduce.reduceFraction().toStringOutput();
                        }
                    }
                    break;
                case 8:
                    System.out.println("Thank you for using this system!");
                    System.out.println("Exiting....");
                    System.exit(0);
                    break;

            }

            if (choice > 8 || choice < 1) { //checks if the inputted number is within the given range
                System.out.println(choice + " is an INVALID INPUT!");
                System.out.println("PLEASE INPUT A VALID CHOICE.");
            }
        } while (true);

    }

    private static int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0 ;
        boolean isCorrect = true;
        do {
            try{
                choice = Integer.parseInt(scanner.next());
                isCorrect = false;

            }catch (NumberFormatException e){
                System.out.println("Input a valid number!");
                System.out.print("Enter Choice: ");

            }
        }while (isCorrect);
        return choice;
    }
}





