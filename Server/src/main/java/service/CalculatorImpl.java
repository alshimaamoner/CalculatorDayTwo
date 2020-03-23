package service;

import javax.jws.*;
import javax.jws.soap.*;

@WebService
public class CalculatorImpl {

    public double add(double num1, double num2) {
        return num1+num2;
    }

    public double sub(double num1, double num2) {
        return num1-num2;
    }

    public double mul(double num1, double num2) {
        return num1*num2;
    }

    public double div(double num1, double num2) {
        return num1/num2;
    }

}