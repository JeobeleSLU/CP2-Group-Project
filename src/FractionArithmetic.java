
import java.util.Scanner;
public class FractionArithmetic { //ito executable class


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction();


        int choice;
        do { //jhez w/ charles
            //w/ chaz
            System.out.println("+------------------------------------------+");
            System.out.println("|  What do you want to do?                 |");
            System.out.println("|     1. Enter value of fraction 1         |");
            System.out.println("|     2. Enter value of fraction 2         |");
            System.out.println("|     3. Add fractions                     |");
            System.out.println("|     4. Subtract fractions                |");
            System.out.println("|     5. Multiply fractions                |");
            System.out.println("|     6. Divide fractions                  |");
            System.out.println("|     7. Reduce a fraction                 |");
            System.out.println("|     8. Quit                              | ");
            System.out.println("+------------------------------------------+");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            switch (choice) {
                case 1: //chaz w/ jhezz
                    System.out.println("Please input the Values of Fraction 1");
                    fraction1.inputValues();
                    break;
                case 2: //chaz
                    System.out.println("Please input the Values of Fraction 2");
                    fraction2.inputValues();
                    break;
                case 3:
                    fraction1.add(fraction2); // pa check if tama nasa isip ko hehe //same tot


                    break;
                case 4:
                    fraction1.subFractions(fraction2);
                    break;
                case 5:
                    double product = Fraction.multiplyfractions(fraction1, fraction2);
                    break;
                case 6:
                    break;

                case 7:
                    break;

                case 8://jeobele po /charles
                    System.out.println("Thank you for using this system!");
                    System.out.println("Exiting....");
                    System.exit(0);
                    break;

            }
            if (choice > 8 || choice < 1) {
                System.out.println(choice + " is an INVALID INPUT!");
                System.out.println("PLEASE INPUT A VALID CHOICE.");
            }//replaced loop
        } while (true); //jhez

    }
}
//    public static void addAnotherFraction() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Input number of fractions to add: ");
//        int j = sc.nextInt();
//
//        Fraction newFrac = new Fraction();
//
//        for (int i = 1; i <= j; i++) {
//            Fraction[] fraction = inputFraction ();
//    }
//
//}


