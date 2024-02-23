import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int cycle = 0;
        int answerNum = N;

        for (;;) {
            int firstNum = answerNum / 10;
            int secondNum = answerNum % 10;
            answerNum = secondNum * 10 + ((firstNum + secondNum) % 10);

            cycle++;

            if (answerNum == N) {
                break;
            }
        }

        System.out.println(cycle);
    }
}