import java.util.Scanner;

public class Snail {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println((1 + (h - b - 1) / (a - b)));

    }

}
