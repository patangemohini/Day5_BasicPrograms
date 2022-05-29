package com.bl.basicprograms;

import java.util.Scanner;

public class BasicCorePrograms {
    static final int FLIP_COIN = 1;
    static final int EVEN_ODD = 2;
    static final int VOWEL_CONSONANT = 3;
    static final int SWAP_TWO_NUMBERS = 4;
    static final int QUOTIENT_REMAINDER = 5;
    static final int LEAP_YEAR = 6;
    static final int POWER_OF_TWO = 7;
    static final int LARGEST_OF_THREE_DIGIT = 8;
    static final int HARMONIC_NUMBER = 9;
    static final int PRIME_FACTOR = 10;

    public static void main(String[] args) {
        System.out.println("Welcome to java basic programs!!!");
        AllBasicPrograms allBasicPrograms = new AllBasicPrograms();
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to run the program !!");
        choice = sc.nextInt();

        switch (choice) {
            case FLIP_COIN:
                allBasicPrograms.flipCoil();
                break;
            case EVEN_ODD:
                allBasicPrograms.evenOdd();
                break;
            case VOWEL_CONSONANT:
                allBasicPrograms.vowelsConsonant();
                break;
            case SWAP_TWO_NUMBERS:
                allBasicPrograms.swapTwoNumbers();
                break;
            case QUOTIENT_REMAINDER:
                allBasicPrograms.quotientAndRemainder();
                break;
            case LEAP_YEAR:
                allBasicPrograms.leapYear();
            case POWER_OF_TWO:
                allBasicPrograms.powerOfTwo();
            case LARGEST_OF_THREE_DIGIT:
                allBasicPrograms.largestOfDigit();
                break;
            case HARMONIC_NUMBER:
                allBasicPrograms.harmonicNumber();
                break;
            case PRIME_FACTOR:
                allBasicPrograms.primeFactor();
                break;
            default:
                System.out.println("invalid input");
                break;
        }
    }
}
