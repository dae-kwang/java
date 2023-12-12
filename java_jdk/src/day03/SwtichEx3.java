package day03;

import java.util.Scanner;

public class SwtichEx3 {
	//swtich문
	public static void main(String[] args) {
		/* 월을 입력받아 입력받은 월의 계절을 출력하세요.
		 * 3,4,5 : 봄
		 * 6,7,8 : 여름
		 * 9,10,11 : 가을
		 * 12, 1, 2 : 겨울
		 * 그 외 : 잘못된 월
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("월을 입력 : ");
		int month = scan.nextInt();
		
		switch(month) {
		case 3, 4, 5: 
			//case 쓰고 ()를 안 써도 괜찮음 case(5):->case 5:
			// case 3, 4, 5: 로 입력해도 괜찮음 jdk 1.7버전 이상부터
			System.out.println(month + "월은 봄입니다");
			break;
		case(6) : case(7) : case(8) :	
			System.out.println(month + "월은 여름입니다");
			break;
		case(9) : case(10) : case(11) :
			System.out.println(month + "월은 가을입니다");
			break;
		case(12) : case(1) : case 2:
			System.out.println(month + "월은 겨울입니다");
			break;
		default:
			System.out.println(month + "월은 잘못된 월입니다");
			
			scan.close();
			
		}
		
		
		
		
		
		
		
		

	}

}
