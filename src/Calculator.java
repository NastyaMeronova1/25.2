import static java.lang.Math.*;
public class Calculator {
    public static void main(String[] args){
        //Math.min()Returns the smaller of two int values.
        int numberMin = min(555, 234);
        //Math.max() Returns the greater of two float values.
        long numberMax = max(568231892, 555123245);
        //Math.abs() Returns the absolute value of a long value.
        long numberMinus = abs(-2356);
        //Math.sgrt() Returns the correctly rounded positive square root of a double value.
        double number = sqrt(25);
        //Math.addExact() Returns the sum of its arguments, throwing an exception if the result overflows an int.
        int numberSum = addExact(256, 235);
        System.out.println("The smaller of two int value: 555 and 234 = " + numberMin);
        System.out.println("The greater of two float values: 568231892 and 555123245 = " + numberMax);
        System.out.println("The absolute value of a long value: -2356 = " + numberMinus);
        System.out.println("The correctly rounded positive square root of a double value: 25 = " + number);
        System.out.println("The sum of its arguments: 256 + 235 = " + numberSum);

    }
}
