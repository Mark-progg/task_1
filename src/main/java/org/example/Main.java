package org.example;

public class Main {
    public static void main(String[] args) {
        int creditCardNumber = 0xCC275;
        long mobileNumber = 89537772211L;
        int twoLastDigits = 0b1011;
        int fourLastDigits = 04243;
        int magicNumber = (13 - 1) % 26 + 1;
        char engSymbol = (char) (magicNumber + 64);

        System.out.println(creditCardNumber);
        System.out.println(mobileNumber);
        System.out.println(twoLastDigits);
        System.out.println(fourLastDigits);
        System.out.println(magicNumber);
        System.out.println(engSymbol);
    }
}