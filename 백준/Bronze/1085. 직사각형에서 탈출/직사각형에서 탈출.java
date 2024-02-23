import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), y = scan.nextInt(),
                w = scan.nextInt(), h = scan.nextInt(),
                minvalue = 0;
        int x1 = w - x;
        int y1 = h - y;
        if (x <= x1 && y <= y1 ) {
            if (x <= y) {
                minvalue = x;
            } else {
                minvalue = y;
            }
        }
        else if (x <= x1 && y1 < y) {
            if (x <= y1) {
                minvalue = x;
            } else {
                minvalue = y1;
            }
        }
        else if (x1 < x && y <= y1) {
            if (x1 <= y) {
                minvalue = x1;
            } else {
                minvalue = y;
            }
        }
        else if (x1 < x && y1 < y) {
            if (x1 <= y1) {
                minvalue = x1;
            } else {
                minvalue = y1;
            }
        }
        System.out.println(minvalue);
    }
}