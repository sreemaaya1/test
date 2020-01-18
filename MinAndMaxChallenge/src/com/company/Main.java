package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number: ");
            if(scanner.hasNextInt()){
                number = scanner.nextInt();
                if(number > maxNum)
                    maxNum = number;
                else
                    minNum = number;
            }else{
                System.out.println("You have entered Invalid Input");
                break;
            }
        }
        System.out.println("Min number : "+minNum);
        System.out.println("max number : "+maxNum);
        scanner.close();
    }
}
