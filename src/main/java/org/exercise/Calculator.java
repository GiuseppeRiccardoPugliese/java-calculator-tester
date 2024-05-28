package org.exercise;

public class Calculator {

    //Metodo per sommare due numeri
    public float add(float num1, float num2){
        return num1 + num2;
    }

    //Metodo per sottrarre due numeri
    public float substract(float num1, float num2){
        return num1 - num2;
    }

    //Metodo per dividere due numeri
    public float divide(float num1, float num2) throws IllegalArgumentException{
        if (num2 == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return num1 / num2;
    }

    //Metodo per moltiplicare due numeri
    public float multiply(float num1, float num2){
        return num1 * num2;
    }
}
