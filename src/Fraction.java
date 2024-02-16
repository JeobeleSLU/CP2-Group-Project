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


    private void computeGCD(double finNum, double finDenom){ // nicole
        int rem = 1;
        int value1 = numerator;
        int value2 = denominator;

        while (rem != 0) {
            rem = value1 % value2;
            value1 = value2;
            value2 = rem;
        } // ang value ng lcd dito is yung value1

    }

    public double getCommonDen(int denominator){
        double commonden = this.denominator * denominator;
        return commonden;
    }
    public void add(Fraction other ){
        double commonDenominator = getCommonDen(other.denominator);
        computeGCD(commonDenominator);
        int newNumerator = this.numerator * ;
    //return
    }

    public int subFractions(Fraction other){//hello po //mag eexperiment lng


        computeGCD(this.denominator);

    //return
    }


    public static double multiplyfractions(Fraction fraction1, Fraction fraction2){ //
        //double product=0.0;
        //product = (Fraction fraction1 * Fraction fraction2)
        //try ko lang
        int num=fraction1.getNumerator()*fraction2.getNumerator();
        int denom=fraction1.getDenominator()*fraction2.getDenominator();
        computeGCD(num, denom);
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
