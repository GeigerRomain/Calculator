import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @org.junit.jupiter.api.Test
    void addition() {
        System.out.println("Testing Addition...");
        Calc unitTest = new Calc();
        int result = unitTest.addition(10, 12);
        if(result == 22){
            System.out.println("The result is 22. Test successful.");
        }else{
            System.out.println("The result is " + result + " but should be 22. Test failed.");
        }
    }

    @org.junit.jupiter.api.Test
    void division() {
        System.out.println("Testing Division...");
        Calc unitTest = new Calc();
        double result = unitTest.division(18, 12);
        if(result == 1.5){
            System.out.println("The result is 1.5. Test successful.");
        }else{
            System.out.println("The result is " + result + " but should be 1.5. Test failed.");
        }
    }

    @org.junit.jupiter.api.Test
    void multiplication() {
        System.out.println("Testing Multiplication...");
        Calc unitTest = new Calc();
        int result = unitTest.multiplication(5, 13);
        if(result == 65){
            System.out.println("The result is 65. Test successful.");
        }else{
            System.out.println("The result is " + result + " but should be 65. Test failed.");
        }
    }

    @org.junit.jupiter.api.Test
    void subtraction() {
        System.out.println("Testing Subtraction...");
        Calc unitTest = new Calc();
        int result = unitTest.subtraction(13, 8);
        if(result == 5){
            System.out.println("The result is 5. Test successful.");
        }else{
            System.out.println("The result is " + result + " but should be 5. Test failed.");
        }
    }

    @org.junit.jupiter.api.Test
    void subtraction_negative() {
        System.out.println("Testing Subtraction...");
        Calc unitTest = new Calc();
        int result = unitTest.subtraction(8, 12);
        if(result == -4){
            System.out.println("The result is -4. Test successful.");
        }else{
            System.out.println("The result is " + result + " but should be -4. Test failed.");
        }
    }
}