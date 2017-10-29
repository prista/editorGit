package test;

import com.hmwrk.SimpleDotCom;
// тестовый класс
public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult = "Test failed";

        if (result.equals("Got")) {
            testResult = "Test success";
        }
        System.out.println(testResult);
    }
}
