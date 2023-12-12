package day03;

import java.util.Scanner;

public class SwtichEx2 {

	// switch문 예제
	public static void main(String[] args) {
		//정수를 입력받아 홀짝 판별 예제를 switch문을 이용하여 작성하세요.
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력 : ");
		int num = scan.nextInt();
		
		switch(num % 2) {
		case(0) :
			System.out.println("짝수 입니다");
			break;
		default:
			System.out.println("홀수 입니다");
			
		}
		
	}

}
