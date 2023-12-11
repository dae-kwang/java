package day02;

import java.util.Scanner;

public class HomeworkEx1 {

	public static void main(String[] args) {
		/* 성적을 입력받아 성적에 맞는 학점을 출력하는 코드를 작성하세요.
		 * 90이상 ~ 100이하 : A
		 * 80이상 ~ 90미만 : B
		 * 70이상 ~ 80미만 : C
		 * 60이상 ~ 70미만 : D
		 * 60미만 : F
		 * 0보다 작거나 100보다 큰 경우 : 잘못된 점수
		 * */

		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력 : ");
		int num = scan.nextInt();
		
		if(num < 0 || num > 100) {
			System.out.println("잘못된 점수");
		}else if(90 <= num && num <= 100 ) {
			System.out.println("A");
		}else if(80 <= num && num < 90) {
			System.out.println("B");
		}else if(70 <= num && num < 80) {
			System.out.println("C");
		}else if(60 <= num && num < 70) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
	}

}
