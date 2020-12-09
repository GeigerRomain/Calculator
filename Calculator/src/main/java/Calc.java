public class Calc implements Calculations{

    public int addition(int summand1, int summand2) {
        int sum = summand1 + summand2;
        return sum;
    }

    public double division(int dividend, int divisor) {
        double result = (double)dividend/(double)divisor;
        return result;
    }

    public int multiplication(int factor1, int factor2) {
        return factor1*factor2;
    }

    public int subtraction(int minuend, int subtrahend) {
        return minuend-subtrahend;

    }
}
