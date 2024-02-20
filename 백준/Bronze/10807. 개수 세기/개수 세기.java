import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i < N; i++) {
            list.add(scan.nextInt());
        }
        int selectNum = scan.nextInt();
        int count = 0;
        for (int element : list) {
            if (element == selectNum) {
                count++;
            }
        }
        System.out.println(count);
    }
}