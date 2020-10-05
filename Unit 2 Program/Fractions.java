
/**
 * Unit 2 Project
 * 
 * @author (Sydney Lohman_and_Taylor Thompson)
 * @version (a version number or a date)
 */
public class Fractions
{
    private int numerator;
    private int denominator;
    
    Fractions(int num, int den){
        numerator = num;
        denominator = den;
    }

    public static void Addition(Fractions f1,Fractions f2){
        int numSum = (f1.numerator*f2.denominator) + (f2.numerator*f1.denominator);
        int denSum = (f1.denominator*f2.denominator);
        System.out.println("Addition: "+ numSum +"/"+ denSum);
        
    }
    
    public static void Subraction(Fractions f1,Fractions f2){
        int numRem = f1.numerator*f2.denominator - f2.numerator*f1.denominator;
        int denRem = f1.denominator*f2.denominator;
        System.out.println("Subtraction: "+ numRem +"/"+ denRem); 
    }
    
    public static void Multiplicaiton(Fractions f1, Fractions f2){
        int numPro = f1.numerator*f2.numerator;
        int denPro = f1.denominator*f2.denominator;
        System.out.println("Multiplication: "+ numPro +"/"+ denPro);
    }
    
    public static void Divsion(Fractions f1, Fractions f2){
        int numQuo = f1.numerator*f2.denominator;
        int denQuo = f1.denominator*f2.numerator;
        System.out.println("Division: "+ numQuo +"/"+ denQuo);
    }
       
    public static void main(String[] args){
        Fractions f1 = new Fractions(3,4);
        Fractions f2 = new Fractions(1,3);
        
        Addition(f1, f2);
        Subraction(f1, f2);
        Multiplicaiton(f1, f2);
        Divsion(f1, f2);
        

    }
    
}