package BaseballGame;

import java.util.ArrayList;

public class BallCounter {

    public int[] counter (ArrayList<Integer> trial, ArrayList<Integer> outNum) {
        int strikes = 0;
        int balls = 0;
        int[] ints = new int[2];
        for (int c : trial) {
            if (outNum.contains(c)) {
                if (trial.indexOf(c) == outNum.indexOf(c)) {
                    strikes++;
                } else {
                    balls++;
                }
            }
        }
        ints[0] = balls;
        ints[1] = strikes;
        return ints;
    }

    public void displayResult (int[] ints) {
        String result;
        if (ints[1] == 0) {
            if (ints[0] == 0) {
                result = String.format("%dB%dS", ints[0], ints[1]);
            } else {
                result = String.format("%dB", ints[0]);
            }
        } else if (ints[0] == 0) {
            result = String.format("%dS", ints[1]);
        } else {
            result = String.format("%dB%dS", ints[0], ints[1]);
        }
        System.out.println(result);

    }
}
