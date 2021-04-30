// 13-05, 06

import java.util.Scanner;
import java.util.Random;

abstract class Player {
    int hand;
}

// 사용자
class User extends Player {
    Scanner sc = new Scanner(System.in);

    public int humanHand() {
        do {
            System.out.print("가위바위보!!! 0...주먹/1...가위/2...보자기: ");
            hand = sc.nextInt();
        } while (hand < 0 || hand > 2);
        return hand;
    }
}

// 컴퓨터
class Computer extends Player {
    Random rand = new Random();

    public int ComputerHand() {
        return rand.nextInt(3);
    }
}

public class quiz13_05 {
    public static void main(String[] args) {

        User hp = new User();
        Computer cp = new Computer();
        String[] hands = { "주먹", "가위", "보자기" };

        int humanHand = hp.humanHand();
        int computerHand = cp.ComputerHand();

        System.out.println("나는 " + hands[humanHand] + "이고, 당신은 " + hands[computerHand] + "입니다. ");
        System.out.println(rps(computerHand, humanHand));
    }

    public static String rps(int com, int user) {
        if (user - com == 0)
            return "비겼습니다.";
        else if (user - com == -1 || user - com == 2)
            return "당신이 이겼습니다.";
        else
            return "당신이 졌습니다.";
    }
}