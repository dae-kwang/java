package day08;

public class Car {
	//Car는 클래스라고 한다.
	// -차의 정보 : 멤버변수
	// -무게 : 단위는 톤으로 , 브랜드, 분류, 색상, 바퀴 종류, 차명, 년식
	double weight;//파란색은 멤버변수 갈색은 지역변수, 색상을 보고 구분하면 좋음
	String brand;
	String category;
	//프로그램,홈페이지 만들 때 추상화를 어떻게 표현할지 고민해야한다
	String color;
	String [] tires;
	String carName;
	int year;
	boolean power;//시동이 켜져있는지 꺼져있는지
	int speed;//현재 차의 속력
	boolean leftLight;//왼쪽 깜빡이
	boolean rightLight;//우측 깜빡이
	// -기능 : 메서드
	// -가속,감속,시동을 켜기/끄기
	// -좌측|우측 깜빡이를 켜기/끄기
	
	//시동을 켜기/끄기 => 버튼을 누르고 켜고 끄기(버튼 하나로 누르기 때문에 하나의 기능으로 통합)
	//시동이 꺼져있으면 켜짐, 시동이 켜져있으면 꺼짐
	public void turn() {
		power = !power;
		if(power) {
			System.out.println("시동이 켜졌습니다.");
		}else {
			System.out.println("시동이 꺼졌습니다.");
		}
	}
	//가속(엑셀)
	public void speedUp() {
		speed++;
	}
	//감속(브레이크)
	public void speedDown() {
		speed--;
	}
	//좌측|우측 깜빡이 켜기/끄기(방향에 따라 다른다/위 : 우측(1), 가운데(0), 아래 : 좌측(-1)) 
	// 내 정보를 바꾸면 된다면 void로 입력
	public void  turnLight(int direction) {
		switch(direction) {
		case 1 : 	rightLight = true; leftLight = false; break;
		case -1 : 	rightLight = false; leftLight = true; break;	
		case 0 :	rightLight = false; leftLight = false; break;
			
		}
	}
	
	//자동차 현재 상태를 출력하는 메서드
	public void print() {
		System.out.println("-----------------");
		System.out.println("시동 : " + power);
		System.out.println("속력 : " + speed);
		System.out.println("좌깜 : " + leftLight);
		System.out.println("우깜 : " + rightLight);
		System.out.println("-----------------");
	}
	
}
