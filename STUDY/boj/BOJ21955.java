package boj;
import java.util.*;

public class BOJ21955 { // Split

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String N = sc.next(); // the number told by Mihai’s mother

        for (int i = 0; i < N.length() / 2; i++) {
            System.out.print(N.charAt(i));
        }

        System.out.print(" ");

        for (int i = N.length() / 2; i < N.length(); i++) {
            System.out.print(N.charAt(i));
        }

        sc.close();
    }
}
