package codeup;
import java.util.*;

public class CODEUP1058 { // 둘 다 거짓일 경우만 참 출력하기

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 0 && b == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}