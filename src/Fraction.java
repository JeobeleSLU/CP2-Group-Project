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


    public Fraction (int numerator, int denominator){ //nicole w/ jeobel
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setNumerator (int num){ //nicole
        this.numerator = num;
    }


    public int getNumerator(){ //   nicole
        return numerator;
    }
    public void setDenominator(int den){
        this.denominator=den;
    }

    public int getDenominator () {
        return denominator;
    }
//gagi sorry maling class
    public String toString(){ //nicole
        return "Value of Numerator: \nValue of Denominator: ";
    }


    public double toDouble(){
        return (double) this.numerator / this.denominator;
    }


   public int getCommonDen(int firstDenom, int secondDenom){

        int commonden = this.denominator * denominator;
        return commonden;
    }

    int computeGCD(double finNum, double finDenom){ // nicole
        int rem = 0;
        int value1 = numerator;
        int value2 = denominator;

        do {
            rem = value1 % value2;
            value1 = value2;
            value2 = rem;
        }while (rem != 0); // ang value ng gcd dito is yung value1
        return value1;
    }

    //todo: Debug on how to simplify hehe
    // gumagana na to except sa simplify -  ay gcd pala
    //
    public void add(Fraction other){//jeobele
        //checks if the denominator is equal
        boolean check = checkEqualityDenom(this.denominator, other.denominator);
        if (check){
            int newNumerator = this.numerator+ other.numerator;
            System.out.println(newNumerator+"/"+this.denominator);
        }else {
            //store the original value of the variable
            int origNum = this.numerator;
            int origDenom = this.denominator;

            int origNum2 = other.numerator;
            int origDenom2 = other.denominator;

        //multiply the left side from the denominator of the right side
            this.numerator =calculateNewNum(origNum, origDenom2);
            this.denominator =calculateNewNum(origDenom, origDenom2);
            System.out.println(other.denominator);

        //multiply the right side from the denominator of the left side
            other.numerator = calculateNewNum(origNum2,origDenom);
            other.denominator = calculateNewNum(origDenom2,origDenom);
            System.out.println(other.denominator);
        //add the numerators
            this.numerator += other.numerator;
            System.out.println(this.numerator);
            //todo : Fix simplifyNum
//            int tmpNum = this.numerator;
//            this.numerator =simplifyNum(this.numerator, this.denominator) ;
//            this.denominator =simplifyDen(tmpNum, this.denominator) ;

            System.out.println(this.numerator+"/"+this.denominator);
            //restore the original values of the fractions
            this.numerator = origNum;
            this.denominator = origDenom;
            other.numerator = origNum;
            other.denominator = origDenom2;

//
        }

    }

    private int simplifyNum(int firstNum, int secondNum) {//pa check if tama -jeo
        int gcd = computeGCD(firstNum , secondNum);
        firstNum /=gcd;
        return firstNum;
    }
    private int simplifyDen(int firstNum, int secondNum) {//pa check if tama -jeo
        int gcd = computeGCD(firstNum, secondNum);
        secondNum /=gcd;
        return secondNum;
    }
    // ano ung bug dito na sinasabi mo jeobel?

    private int calculateNewNum(int multiplicand, int multiplier) {
        System.out.println(multiplicand*multiplier);
        return multiplicand*multiplier;
    }

    private boolean checkEqualityDenom(int firstDenom, int secondDenom) {
            return firstDenom == secondDenom;
    }

    public void subFractions(Fraction other) {//hello po //mag eexperiment lng //josh
        //checks if the denominator is equal
        boolean check = checkEqualityDenom(this.denominator, other.denominator);
        if (check) {
            int newNumerator = this.numerator + other.numerator;
            System.out.println(newNumerator + "/" + this.denominator);
        } else {
            //store the original value of the variable
            int origNum = this.numerator;
            int origDenom = this.denominator;

            int origNum2 = other.numerator;
            int origDenom2 = other.denominator;

            //multiply the left side from the denominator of the right side
            this.numerator = calculateNewNum(origNum, origDenom2);
            this.denominator = calculateNewNum(origDenom, origDenom2);
            System.out.println(other.denominator);

            //multiply the right side from the denominator of the left side
            other.numerator = calculateNewNum(origNum2, origDenom);
            other.denominator = calculateNewNum(origDenom2, origDenom);
            System.out.println(other.denominator);
            //subtracts the numerators
            this.numerator -= other.numerator;
            System.out.println(this.numerator);
            //todo : Fix simplifyNum
////            int tmpNum = this.numerator;/
//          this.numerator = simplifyNum(this.numerator, this.denominator);
//            this.denominator = simplifyDen(tmpNum, this.denominator);

            System.out.println("The Answer is "+this.numerator + "/" + this.denominator);
            //restore the original values of the fractions
//            this.numerator = origNum;
//            this.denominator = origDenom;
//            other.numerator = origNum;
//            other.denominator = origDen
        }
    }


    public void multiplyFractions(Fraction other){ // jhez // gumana man to ngay nung nitryko saken haha//
        int origNum = this.numerator;
        int origDen = this.denominator;

        int origNum2 = other.numerator;
        int origDen2 = other.denominator;

        //multiply the numerators
        this.numerator =calculateNNum(origNum, origNum2);
        //multiply the denominator
        this.denominator =calculateNewDen(origDen, origDen2);
        int calculatedN = this.numerator;
        int calculatedD = this.denominator;
        //lowest form
        int tempNum = this.numerator;
        this.numerator = simplifyNum(this.numerator, this.denominator);
        this.denominator = simplifyDen(tempNum, this.denominator);
        //convert to decimals
        double dec = calculateDecimals(calculatedN,calculatedD);

        System.out.println(this.numerator+"/"+this.denominator + " or " + dec);
        //restore the original values of the fractions
        this.numerator = origNum;
        this.denominator = origDen;
        other.numerator = origNum;
        other.denominator = origDen2;
    }
    private int calculateNNum(int multiplicand, int multiplier) {
        System.out.println(multiplicand * multiplier);
        return multiplicand * multiplier;
    }
    private int calculateNewDen(int multiplicand, int multiplier) {
        System.out.println(multiplicand * multiplier);
        return multiplicand * multiplier;

    }
    private double calculateDecimals(int numerator, int denominator) {
        System.out.println(numerator/denominator);
        return (double) numerator / denominator;
    }



        public double divideFractions(Fraction other){ //chaz
        // heheheh try ko po muna gawin --- chaz
        int num1 = this.numerator;
        int denom1 = this.denominator;

        double recipNum2 = other.denominator;
        double recipDenom2 = other.numerator;

        double quot1 = num1 * recipNum2;
        double quot2 = denom1 * recipDenom2;

        double quotInDec = quot1 / quot2;
        System.out.println(quot1 + "/" + quot2);
        return quotInDec;
    }

    //public void divideFractionsFracForm(Fraction other){
      //  int num1 = this.numerator;
       // int denom1 = this.denominator;

        //int recipNum2 = other.denominator;
       // double recipDenom2 = other.numerator;

       // int quot1 = num1 * recipNum2;
      //  int quot2 = denom1 * recipDenom2;
        // int simpNum = simplifyNum(


      //  return
   // }

    public void reduceFraction(Fraction other) { //sam //charles
            int gcd = computeGCD(this.numerator, this.denominator);
            this.numerator /= gcd;
            this.denominator /= gcd;

            gcd = computeGCD(other.numerator, other.denominator);
            other.numerator /= gcd;
            other.denominator /= gcd;

    }

    public void inputValues(){//jeobele pwede ba maging 0 < ang denom? //oo pero d pwede 0 // undefined na ata pag zero
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Numerator: ");
        setNumerator(scanner.nextInt());
        int tmp;
        do {
            System.out.println("Input Denominator: ");

             tmp = scanner.nextInt();
             if (tmp == 0){
                 System.out.println("A Denominator Cannot be Zero");
             }
        }while(tmp == 0 );
        setDenominator(tmp);
    }


}

//ask natin sa consultation?
// bale ung menu nandon na sa main? ung pipili ng operation
// ay gawan din method yon? kasi kung oo, dito yon
//naririnig ba pag nag voice chat dito?
//oo pwede pa ata mag video call HAHAHAHAHAHAHA
//
//
// nakita ko lang sa yt
 //ge nagchat na tayo HAHAHAHAHAHAHAH
//pwede naman mag call try niyo mag join HASHAHa
//pinindot ko
//jhez join ka daw
// gagawa yung add ata
