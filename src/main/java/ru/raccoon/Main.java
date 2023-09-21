package ru.raccoon;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        //демонстрация
        String operandOne = "00100101"; //37
        String operandTwo = "00001010"; //10

        System.out.println(bins.sum(operandOne, operandTwo)); //37+10=47=0010 1111
        System.out.println(bins.mult(operandOne, operandTwo)); //37*10=370=0001 0111 0010
    }
}