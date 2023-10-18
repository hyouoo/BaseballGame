package BaseballGame;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    private Scanner sc= new Scanner(System.in);

    ArrayList<Integer> getTrialNumber (){
        int input = sc.nextInt();
        ArrayList<Integer> trial = new ArrayList<>();
        trial.add(input / 100);
        trial.add((input % 100) / 10);
        trial.add(input % 10);

        return trial;
    }
}
