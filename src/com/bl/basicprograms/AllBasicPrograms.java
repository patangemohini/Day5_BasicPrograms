package com.bl.basicprograms;

import java.util.Scanner;

public class AllBasicPrograms {

    public void flipCoil() {
        int flips;
        int head = 0;
        int tail = 0;
        double perOfHead;
        double perOfTail;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of time you want to flip the coin!!");
        flips = scanner.nextInt();

        for (int i = 0; i < flips; i++) {
            double random = Math.random() % 2;
            if (random < 0.5) {
                tail++;
            } else {
                head++;
            }
            perOfHead = head / flips * 100.0;
            perOfTail = tail / flips * 100.0;
            System.out.println("Percentage of head " + " is : " + perOfHead + "%");
            System.out.println("Percentage of tail id : " + perOfTail + "%");
        }
    }

    public void evenOdd() {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even ");
        } else {
            System.out.println(number + " is odd ");
        }
    }

    public void vowelsConsonant() {
        char ch;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an Alphabet : ");
        ch = s.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is vowel ");
        } else {
            System.out.println(ch + " is consonant ");
        }
    }

    public void swapTwoNumbers() {
        int x;
        int y;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the any two numbers ");
        x = scanner.nextInt();
        y = scanner.nextInt();

        System.out.println("Before swap");
        System.out.println("Enter the first number " + " x " + " = " + x);
        System.out.println("Enter the second number " + " y " + " = " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swap");
        System.out.println("Enter the first number " + " x " + " = " + x);
        System.out.println("Enter the second number " + " y " + " = " + y);
    }
}

