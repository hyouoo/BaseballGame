package BaseballGame;

import java.util.ArrayList;

public class Game {
    public static void main(String[] args) {
        RandomNumberGenerator ranNumGen = new RandomNumberGenerator();
        ArrayList<Integer> outNum = ranNumGen.generator();

        UserInput userInput = new UserInput();
        BallCounter ballCounter = new BallCounter();

        System.out.println("컴퓨터가 숫자를 생성하였습니다. 답을 맞춰보세요!");
        int trialNum = 0;
        while (true) {
            trialNum++;
            String trialStr = String.format("%d번째 시도 : ", trialNum);
            System.out.print(trialStr);
            ArrayList<Integer> trial = userInput.getTrialNumber();
            int[] ints = ballCounter.counter(outNum, trial);
            ballCounter.displayResult(ints);

            if (ints[1] == 3) {
                String endResult = String.format("%d번만에 맞히셨습니다.", trialNum);
                System.out.println(endResult);
                System.out.println("게임을 종료합니다.");
                break;
            }
        }
    }
}
