package day08;

public class MethodEx1 {

	public static void main(String[] args) {
		//재귀메서드를 이요하여 스택 오버플로우가 발생하는 예제
		//이런 거를 만들면 안 된다.
		recursive();
	}
	
	public static void recursive() {
		System.out.println("재귀 메서드입니다.");
		recursive();
	}

}