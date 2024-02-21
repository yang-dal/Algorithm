import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(), X = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<N; i++) {
            list.add(scan.nextInt());
        }
        ArrayList<Integer> answer = new ArrayList<>();
        for (int n : list) {
            if(X > n) {
                answer.add(n);
            }
        }
        for (int i=0; i<answer.size(); i++) {
            System.out.print(answer.get(i)+" ");
        }
    }
}