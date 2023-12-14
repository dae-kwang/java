package HomeExercise;

public class Exercise1 {

	public static void main(String[] args) {
		/* 성적이 A인지 아닌지를 판별하는 예제
		 * 성적이 100이하이고 90이상이면 A,아니면 A가 아님
		 */
		int score = 80;
		String result = " ";
		
		result = score <= 100 && score >= 90? "성적은 A입니다" : "성적은 A가 아닙니다";
		System.out.println(result);
				
	}

}
