package com.bl.basicprograms;

import java.util.Scanner;

public class BasicCorePrograms {
    static final int FLIP_COIN = 0;
    static final int EVEN_ODD = 1;
    static final int VOWEL_CONSONANT = 2;
    static final int SWAP_TWO_NUMBERS = 3;

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
        }
    }
}
