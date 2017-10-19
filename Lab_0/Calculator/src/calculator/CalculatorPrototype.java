/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author abisbano
 */
public class CalculatorPrototype implements CalculatorIF {

    @Override
    public int sum(int m, int n) {
        int result = m;
        while (n != 0) {
            result += 1;
            n -= 1;
        }
        return result;
    }

    @Override
    public int divide(int m, int n) {
        if (n == 0) {
            throw new ArithmeticException("Division by zero.");
        }
        int result = 0;
        while(m > 0){
            m -= n;
            result++;
        }
        if (m!=0){
            result-= 1;
        }
        return result;
    }

    @Override
    public int subtract(int m, int n) {
        int result = m;
        while (n != 0) {
            result -= 1;
            n -= 1;
        }
        return result;
    }

    @Override
    public int multiply(int m, int n) {
        int result = 0;
        while (n != 0) {
            result += m;
            n -= 1;
        }
        return result;
    }
    
}
