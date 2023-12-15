package day06;

import java.util.Scanner;

public class HomeworkEx1 {

	public static void main(String[] args) {
		/* 숫자 야구게임을 구현하세요.
		 * - 1~9 사이의 중복되지 않은 3개의 수를 랜덤으로 선택해서 해당 숫자를 맞추는 게임(로또와 비슷)
		 * - S : 숫자가 있고, 위치가 같은 경우 
		 * - B : 숫자가 있지만 위치가 다른 경우
		 * - O : 일치하는 숫자가 하나도 없는 경우
		 * - 3S가 되면 게임이 종료
		 * 
		 * 예시
		 * 랜덤으로 생성된 숫자 : 3 9 1(안 보이는 상태)
		 * 입력 : 1 2 3
		 * 결과 : 2B
		 * 입력 : 4 5 6
		 * 결과 : O
		 * 입력 : 7 9 8
		 * 결과 : 1S
		 * 입력 : 3 1 9
		 * 결과 : 1S2B
		 * 입력 : 3 9 1
		 * 결과 : 3S
		 * 정답입니다.
		 * */
		//랜덤한 수 1~9까지 중 랜덤으로 숫자 3개 생성
		Scanner scan = new Scanner(System.in);
		
		int min = 1, max = 9;
		int arr[] = new int [3];
		int count = 0;
		while(count < arr.length) {
		int r = (int)(Math.random()*(max - min +1) + min);
		boolean duplicated = false;
		for(int i = 0; i < count; i++) {
			if(arr[i] == r) {
				duplicated = true;
				break;
			}
		}
		if(!duplicated) {
			arr[count] = r;
			count++;
			}
		}
		for(int i = 0; i <arr.length; i++) {
			System.out.print(arr[i] + " ");
	
		}
		System.out.println(" ");
		System.out.print("입력 : ");
		int user = scan.nextInt();
	
		
	}
		
	
		

	

}
	

	
			

