import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] array = new int[N];
        for(int i=0; i<N; i++) {
            int a = scan.nextInt();
            array[i] = a;
        }

        int maxInt=Integer.MIN_VALUE, minInt=Integer.MAX_VALUE; // 수정된 부분
        for(int i=0; i<N; i++) {
            if(array[i]<=minInt) {
                minInt=array[i];
            }
            if(array[i]>=maxInt) {
                maxInt=array[i];
            }
        }
        System.out.printf("%d %d", minInt, maxInt);
    }
}
