public class Fraction {
    public int numerator;
    public int denominator;
    public  float num;


    Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        System.out.println(numerator + "/" + denominator);
    }
    Fraction(float num){
        this.num = num;
    }
}
