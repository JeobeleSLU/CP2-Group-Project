
import java.util.Scanner;

//class file
public class Fraction {

    //instance variables
    private int numerator;
    private int denominator;

    //constructors
    public Fraction (){
        numerator = 0;
        denominator = 0;
    }

    public Fraction (int wholeNumVal){
        this.numerator = wholeNumVal;
        this.denominator = 1;
    }


    public Fraction (int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setNumerator (int num){  //for setting value of numerator
        this.numerator = num;
    }
    public int getNumerator(){ //for getting value of numerator
        return numerator;
    }
    public void setDenominator(int den){ //for setting value of denominator
        this.denominator = den;
    }

    public int getDenominator () {//for getting value of denominator
        return denominator;
    }

    public String toString(){ //to convert the input values into a string
        return this.numerator + "/" + this.denominator;
    }


    private int computeGCD(int num, int denom){  //used for simplifying fractions

        //initialization of variables
        int rem = 0;
        int value1 = num;
        int value2 = denom;

        do { // loop for getting the GCD between two numbers
            rem = value1 % value2;
            value1 = value2;
            value2 = rem;
        }while (rem != 0); //loop will terminate if value of rem is 0 because it means that the GCD is already computed
        return value1;
    }

    public Fraction addFraction(Fraction other ) {
        Fraction nFrac = new Fraction();
        //checks if the denominator is equal
        boolean check = checkEqualityDenom(this.denominator, other.denominator);
        if (check) {
            int newNumerator = this.numerator + other.numerator;
            //prints the sum; if the sum is negative, the sum will be printed in the format -(fraction)
            if(newNumerator < 0){
                System.out.println("Sum in Fraction: -(" + (newNumerator * -1) + "/" + this.denominator + ")");
            } else if (this.denominator < 0) {
                System.out.println("Sum in Fraction: -(" + newNumerator+ "/" + (this.denominator * -1) + ")");
            } else{
                System.out.println("Sum in Fraction: " + newNumerator + "/" + this.denominator);
            }

            nFrac = new Fraction(newNumerator, this.denominator);
        } else {
            //store the original value of the variable
            int origNum = this.numerator;
            int origDenom = this.denominator;

            int origNum2 = other.numerator;
            int origDenom2 = other.denominator;

            //multiply the left side from the denominator of the right side
            this.numerator = calculateNewNum(origNum, origDenom2);
            this.denominator = calculateNewNum(origDenom, origDenom2);

            //multiply the right side from the denominator of the left side
            other.numerator = calculateNewNum(origNum2, origDenom);
            other.denominator = calculateNewNum(origDenom2, origDenom);

            //add the numerators
            this.numerator += other.numerator;

            nFrac = new Fraction(this.numerator, this.denominator);

            //restore the original values of the fractions

            nFrac = new Fraction(this.numerator, this.denominator);
            returnOrigValues(origNum, origDenom, origNum2, origDenom2, other);
        }
        return nFrac;
    }


    public Fraction subFractions(Fraction other) {
        Fraction nFrac = new Fraction ();
        //checks if the denominator is equal
        boolean check = checkEqualityDenom(this.denominator, other.denominator);
        if (check) {
            int newNumerator = this.numerator - other.numerator;
            nFrac = new Fraction(newNumerator, this.denominator);
        } else {
            //store the original value of the variable
            int origNum = this.numerator;
            int origDenom = this.denominator;

            int origNum2 = other.numerator;
            int origDenom2 = other.denominator;

            //multiply the left side numerator from the denominator of the right side
            this.numerator = calculateNewNum(origNum, origDenom2);
            this.denominator = calculateNewNum(origDenom, origDenom2);

            //multiply the right side numerator from the denominator of the left side
            other.numerator = calculateNewNum(origNum2, origDenom);

            this.numerator -= other.numerator;

            nFrac = new Fraction(this.numerator, this.denominator);

            //restore the original values of the fractions
            returnOrigValues(origNum, origDenom, origNum2, origDenom2, other);
        }

        return nFrac;
    }

    public Fraction multiplyFractions(Fraction other){ // multiplication process
        Fraction nFrac = new Fraction();
        int origNum = this.numerator;
        int origDen = this.denominator;

        int origNum2 = other.numerator;
        int origDen2 = other.denominator;

        //multiply the numerators
        this.numerator =calculateNewNum(origNum, origNum2);
        //multiply the denominator
        this.denominator =calculateNewNum(origDen, origDen2);

         nFrac = new Fraction(this.numerator, this.denominator);

        //restore the original values of the fractions
        returnOrigValues(origNum, origDen, origNum2, origDen2,other);

        return nFrac;
    }

    public Fraction divideFractions(Fraction other){
        Fraction nFrac = new Fraction();
        int num1 = this.numerator;
        int denom1 = this.denominator;

        int reciprocalNum = other.denominator;
        int reciprocalDenom = other.numerator;

        this.numerator = num1 * reciprocalNum;
        this.denominator = denom1 * reciprocalDenom;

        nFrac = new Fraction(this.numerator, this.denominator);
        returnOrigValues(num1, denom1, reciprocalNum, reciprocalDenom, other);
        return nFrac;

    }

    public void inputValues() {
        Scanner scanner = new Scanner(System.in);
            boolean isCorrect = true;
            do {
                try {
                    System.out.print("Enter value of numerator: ");
                    setNumerator(Integer.parseInt(scanner.next()));
                    isCorrect = false;

                }catch (NumberFormatException e){
                    System.out.println("You must enter a valid number!");

                }

            }while(isCorrect);
            isCorrect = true;
            int tmp = 0;
            do {
                try {
                    System.out.print("Enter value of denominator: ");
                    tmp = Integer.parseInt(scanner.next());
                    if (tmp == 0) {
                        System.out.println("A denominator cannot be zero");
                    }
                    isCorrect = false;
                }catch (NumberFormatException e){
                    System.out.println("Input a valid Number! ");
                }
            } while (tmp == 0 && isCorrect );
            setDenominator(tmp);

    }
    public Fraction reduceFraction() {

        int num = this.numerator;
        int denom = this.denominator;
        int gcd = computeGCD(num, denom);
        this.numerator /= gcd;
        this.denominator /= gcd;

        Fraction nFrac = new Fraction (this.numerator, this.denominator);

        return nFrac;
    }

//General Methods (used in all operators)

    private int calculateNewNum(int multiplicand, int multiplier) {
        return multiplicand*multiplier;
    }

    public void convertToDecimal() {
        System.out.println((double) this.numerator / this.denominator);
    }

    private boolean checkEqualityDenom(int firstdenom, int seconddenom) {
        return firstdenom == seconddenom;
    }

    private void returnOrigValues (int n1, int d1, int n2, int d2, Fraction other){
        this.numerator = n1;
        this.denominator = d1;
        other.numerator = n2;
        other.denominator = d2;
    }
    public void toStringOutput (){
        //makes the format: - numerator/denominator
        if (this.denominator < 0) {
            System.out.println("-" + this.numerator + "/" + (this.denominator * -1)); ;
        } else{
            System.out.println(this.numerator + "/" + this.denominator);
        }
    }
}