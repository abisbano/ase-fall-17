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
public class CalculatorMain {
    
    public static void main(String[] args){

        CalculatorPrototype c = new CalculatorPrototype();

        System.out.println(c.sum(5,5));
        System.out.println(c.subtract(5,-2));
        System.out.println(c.divide(23,5));
        System.out.println(c.multiply(5,5));
    }
}
