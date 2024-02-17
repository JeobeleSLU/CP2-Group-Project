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

    //tama ba to?
    public Fraction (int numerator, int denominator){ //nicole w/ jeobel
        this.numerator = numerator;
        this.denominator = denominator;
    }//pwede na ba gumamit ng this?
    // ata?

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

    public String toString(){ //nicole
        return "Value of Numerator: \nValue of Denominator: ";
    }// tama ba gamit ng \n? I belib yes


    public double toDouble(){
        return (double) this.numerator / this.denominator;
    }


    public int getCommonDen(int firstDenom, int secondDenom){

        int commonden = this.denominator * denominator;
        return commonden;
    }

    private int computeGCD(double finNum, double finDenom){ // nicole
        int rem = 0;
        int value1 = numerator;
        int value2 = denominator;

        do {
            rem = value1 % value2;
            value1 = value2;
            value2 = rem;
        }while (rem != 0); // ang value ng lcd dito is yung value1
        return value1;
    }
    //todo: Debug on how to simplify hehe
    // gumagana na to except sa simplify
    public void add(Fraction other ){
        //checks if the denominator is equal
        boolean check = checkEqualityDenom(this.denominator, other.denominator);
        if (check){
            int newNumerator = this.numerator+ other.numerator;
            System.out.println(newNumerator+"/"+this.denominator);
        }else {
            //store the original value of the variable
            int origNum = this.numerator;
            int origdenom = this.denominator;

            int origNum2 = other.numerator;
            int origDenom2 = other.denominator;

        //multiply the left side from the denominator of the right side
            this.numerator =calculateNewNum(origNum, origDenom2);
            this.denominator =calculateNewNum(origdenom, origDenom2);
            System.out.println(other.denominator);

        //multiply the right side from the denominator of the left side
            other.numerator = calculateNewNum(origNum2,origdenom);
            other.denominator = calculateNewNum(origDenom2,origdenom);
            System.out.println(other.denominator);
        //add the numerators
            this.numerator += other.numerator;
            System.out.println(this.numerator);
            //todo : Fix simplifyNum
            int tmpNum = this.numerator;
            this.numerator =simplifyNum(this.numerator, this.denominator) ;
            this.denominator =simplifyDen(tmpNum, this.denominator) ;

            System.out.println(this.numerator+"/"+this.denominator);
            //restore the original values of the fractions
            this.numerator = origNum;
            this.denominator = origdenom;
            other.numerator = origNum;
            other.denominator = origDenom2;


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

    private int calculateNewNum(int multiplicand, int multiplier) {
        System.out.println(multiplicand*multiplier);
        return multiplicand*multiplier;
    }

    private boolean checkEqualityDenom(int firstdenom, int seconddenom) {
            return firstdenom == seconddenom;
    }

    public int subFractions(Fraction other){//hello po //mag eexperiment lng


        computeGCD(this.numerator, this.denominator);

    return 0;
    }


    public static double multiplyfractions(Fraction fraction1, Fraction fraction2){ //
        //double product=0.0;
        //product = (Fraction fraction1 * Fraction fraction2)
        //try ko lang
        int num=fraction1.getNumerator()*fraction2.getNumerator();
        int denom=fraction1.getDenominator()*fraction2.getDenominator();
//        computeGCD(num, denom);
        return (num/denom);
    }


    public double divideFractions(){
        double reciprocal = (double) denominator / numerator;

        int newNumerator = this.numerator;
        int newDenominator = this.denominator;
        double quotient = 0;
        return quotient;
    }



}//ask natin sa consultation?
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
