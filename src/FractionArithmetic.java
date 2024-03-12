
import java.util.Scanner;
public class FractionArithmetic   {

    public static void main(String[] args) {

        //initialization of values
        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction();
        Fraction toReduce = new Fraction(); //for obtaining simplified output

        //for input validation of the menu
        boolean availFrac1 = false;
        boolean availFrac2 = false;
        boolean availOpt = false;

        int choice;

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


            choice = getUserChoice();


            //switch case to assign corresponding instructions to a specific option or number
            switch (choice) {
                case 1:
                    fraction1.inputValues();
                    availFrac1 = true;
                    break;
                case 2:
                    fraction2.inputValues();
                    availFrac2 = true;
                    break;

                case 3:
                    if (!availFrac1  || !availFrac2){ //to check whether there are inputs present in fraction1 and fraction2
                        System.out.println("\nNOTE: PLEASE INPUT FIRST THE VALUE OF FRACTIONS 1 AND 2!\n");
                    }else {
                        System.out.println("Value of fraction 1: " + fraction1);
                        System.out.println("Value of fraction 2: " + fraction2);
                        toReduce = fraction1.addFraction(fraction2);
                        System.out.print("Sum in Fraction: ");
                        toReduce.toStringOutput();
                        System.out.print("Sum in Decimal: ");
                        toReduce.convertToDecimal();
                        availOpt = true;
                    }
                    break;
                case 4:
                    if (!availFrac1 || !availFrac2){

                        System.out.println("\nNOTE: PLEASE INPUT FIRST THE VALUE OF FRACTIONS 1 AND 2!\n");
                    }else{
                        System.out.println("Value of fraction 1: " + fraction1);
                        System.out.println("Value of fraction 2: " + fraction2);
                        toReduce = fraction1.subFractions(fraction2);
                        System.out.print("Difference in Fraction: ");
                        toReduce.toStringOutput();
                        System.out.print("Difference in Decimal: ");
                        toReduce.convertToDecimal();

                        availOpt = true;
                    }
                    break;
                case 5:
                    if (!availFrac1 || !availFrac2){
                        System.out.println("\nNOTE: PLEASE INPUT FIRST THE VALUE OF FRACTIONS 1 AND 2!\n");

                    }else{
                        System.out.println("Value of fraction 1: " + fraction1);
                        System.out.println("Value of fraction 2: " + fraction2);
                        toReduce = fraction1.multiplyFractions(fraction2);
                        System.out.print("Product in Fraction: ");
                        toReduce.toStringOutput();
                        System.out.print("Product in Decimal: ");
                        toReduce.convertToDecimal();
                        availOpt = true;
                    }
                    break;
                case 6:
                    if (!availFrac1 || !availFrac2){
                        System.out.println("\nNOTE: PLEASE INPUT FIRST THE VALUE OF FRACTIONS 1 AND 2!\n");
                    }else{
                        System.out.println("Value of fraction 1: " + fraction1);
                        System.out.println("Value of fraction 2: " + fraction2
                        );
                        toReduce = fraction1.divideFractions(fraction2);
                        System.out.print("Quotient in fraction: " );
                        toReduce.toStringOutput();
                        System.out.print("Quotient in Decimal: ");
                        toReduce.convertToDecimal();
                        availOpt = true;
                    }
                    break;
                case 7:
                    if (!availFrac1 || !availFrac2){
                        System.out.println("\nNOTE: PLEASE INPUT FIRST THE VALUE OF FRACTIONS 1 AND 2!\n");
                    }else if(!availOpt ){
                        System.out.println("\nNOTE: PLEASE CHOOSE AN OPERATION FIRST!\n");
                    }else{
                        System.out.println("Value of fraction to be simplified: " + toReduce
                        );
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

            if (choice > 8 || choice < 0) { //checks if the inputted number is within the given range
                System.out.println(choice + " is an INVALID INPUT!");
                System.out.println("PLEASE INPUT A VALID CHOICE.");
            }
        } while (true);

    }

    private static int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        boolean isProblematic;
        int choice = 0;
        do {
            try{
                System.out.print("Enter choice: ");
                choice = Integer.parseInt(scanner.next());
                isProblematic = true;

            }catch (NumberFormatException e){
                System.out.println("Input a valid number!");
               break;
            }
        }while (!isProblematic);
        return choice;
    }
//ignore Comment
}







