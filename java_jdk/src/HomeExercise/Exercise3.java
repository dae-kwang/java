package HomeExercise;

public class Exercise3 {

	public static void main(String[] args) {
		//num가 0이면 0이라고 출력하고, num가 양수이면 양수라고 출력하고,
				//num가 음수이면 음수라고 출력하는
				//코드를 작성하세요.
		int num = -10;
		if(num == 0) {
			System.out.println("0");
		}else if(num > 0 ) {
			System.out.println(num + "은 양수입니다");
		}else {
			System.out.println(num + "은 음수입니다");
		}
	}

}
