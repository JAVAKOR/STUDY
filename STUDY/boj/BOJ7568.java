package boj;
import java.util.*;

public class BOJ7568 { // 덩치
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 전체 사람의 수
		int[][] arr = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			int cnt = 1;
			
			for (int j = 0; j < N; j++) {
				if (i == j) {
					continue;
				}
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					cnt++;
				}
			}
			
			System.out.print(cnt + " ");
		}
		
		sc.close();
	}
}