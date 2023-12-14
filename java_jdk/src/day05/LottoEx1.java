package day05;

import java.util.Arrays;

public class LottoEx1 {

	public static void main(String[] args) {
		/* 1~45사이의 랜덤한 수 6개를 생성하여 출력하는 예제를 작성하세요.
		 * 단, 정렬이 되도록
		 * */
		
		int min = 1, max = 45;
		int arr[] = new int[6];
		int count = 0;
		while( count< 6 ) {
			//랜덤수 생성
			int r = (int)(Math.random() * (max-min+1) + min);
			
			//중복 확인
			boolean duplicated = false;//중복 여부를 알려주는 변수로,true이면 중복, false이면 중복이 아님
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
		Arrays.sort(arr);
		for(int i = 0; i <arr.length; i++) {
			System.out.print(arr[i] + " ");
	
		}
	}
}
