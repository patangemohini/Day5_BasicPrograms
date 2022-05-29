package com.bl.basicprograms;

import java.util.Scanner;

public class AllBasicPrograms {

    Scanner scanner = new Scanner(System.in);

    public void flipCoil() {
        int flips;
        int head = 0;
        int tail = 0;
        double perOfHead;
        double perOfTail;

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
        System.out.println("Enter an Alphabet : ");
        ch = scanner.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is vowel ");
        } else {
            System.out.println(ch + " is consonant ");
        }
    }

    public void swapTwoNumbers() {
        int x;
        int y;

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

    public void quotientAndRemainder() {
        int dividend;
        int divisor;
        int quotient;
        int remainder;

        System.out.println("Enter Dividend : ");
        dividend = scanner.nextInt();
        System.out.println("Enter Divisor : ");
        divisor = scanner.nextInt();

        quotient = dividend / divisor;
        remainder = dividend % divisor;

        System.out.println("Quotient : " + quotient);
        System.out.println("Remainder : " + remainder);
    }

    public void leapYear() {
        int year;
        int length;
        String input;

        System.out.println("Enter the year !!");
        input = scanner.nextLine();
        year = Integer.parseInt(input);
        length = input.length();

        if (length != 4) {
            System.out.println("Enter year as 4 digit number!");
            return;
        } else {
            if (year % 400 == 0 && year % 100 == 0) {
                System.out.println("Year " + year + " is a leap year ");
            } else if
            (year % 100 != 0 && year % 4 == 0)
                System.out.println("Year" + year + "is a leap year");
            else {
                System.out.println("Year " + year + "is not leap year");
            }
        }
    }

    public void powerOfTwo() {
        int baseNumber = 2;
        int outputNumber = 1;

        System.out.println("Please enter number  in between 0 to 31 ");
        int PowerNumber = scanner.nextInt();

        if (PowerNumber >= 0 && PowerNumber < 31) {
            for (int i = 0; i < PowerNumber; i++) {
                outputNumber = outputNumber * baseNumber;
                System.out.println(outputNumber);
            }
        } else {
            System.out.println("Please re-enter number in between 0 to 31 ");

        }
    }

    public void largestOfDigit() {
        System.out.println("Enter 1st number : ");
        int a = scanner.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = scanner.nextInt();
        System.out.println("Enter 3rd number : ");
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("Largest number is : " + a);
        } else if (b > a && b > c) {
            System.out.println("Largest number is : " + b);
        } else if (c > a && c > b) {
            System.out.println("Largest number is : " + c);
        } else {
            System.out.println("can not validate");
        }
    }

    public void harmonicNumber() {
        double result = 0;
        double harmonic = 0;
        int number;
        System.out.println("enter the harmonic you want to find : ");
        number = scanner.nextInt();

        for (double i = 1; i <= number; i++) {
            harmonic = harmonic + (1 / i);
            result = harmonic;
        }
        System.out.println("the value of harmonic no." + number + " is: " + result);
    }

    public void primeFactor(){
        int input;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        input = s.nextInt();

        System.out.println("The Prime Factors of " + input + " are : ");
        int Number = 2;

        while (input > 1) {
            if (input % Number == 0) {
                System.out.print(Number + " ");
                input = input / Number;
            } else
                Number++;
        }
    }
}




