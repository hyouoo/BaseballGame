package BaseballGame;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumberGenerator {
    ArrayList<Integer> generator () {
        Random random = new Random();
        int num1 = random.nextInt(10);
        int num2, num3;
            while (true) {
            num2 = random.nextInt(10);
            num3 = random.nextInt(10);
            if (num1 == num2 || num2 == num3 || num3 == num1) {
                continue;
            }
            break;
        }
        ArrayList<Integer> outNum = new ArrayList<>();
        outNum.add(num1);
        outNum.add(num2);
        outNum.add(num3);
        System.out.println(outNum);
        return outNum;
    }
}
