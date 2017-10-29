package com.hmwrk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numOfGuesses = 0;
        SimpleDotCom dot = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};

        dot.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive) {
            System.out.println("Введите число: ");
            String userGuess = new Scanner(System.in).nextLine();
            String result = dot.checkYourself(userGuess);

            numOfGuesses++;
            if (result.equals("Destroyed")) {
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
            }
        }

    }
}