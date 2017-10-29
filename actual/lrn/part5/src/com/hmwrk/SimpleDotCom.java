package com.hmwrk;

public class SimpleDotCom {

    int numOfHits;

    boolean[] hitCells = new boolean[6];

    int[] location;
    public void setLocationCells(int[] locationCells) {
        this.location = locationCells;
    }

    public String checkYourself(String userGuess) {
        int guess = Integer.parseInt(userGuess);

        String result = "Вы уже стреляли в эту клетку!";

        if (!hitCells[guess]) {
            result = "Miss";
            hitCells[guess] = true;
            for (int cell : location) {
                if (cell == guess) {
                    numOfHits++;

                    if (numOfHits == location.length) {
                        result = "Destroyed";
                    } else {
                        result = "Got";
                    }
                    break;
                }
            }
        }


        System.out.println(result);
        return result;
    }
}
