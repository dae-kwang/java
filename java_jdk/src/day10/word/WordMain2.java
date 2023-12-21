package day10.word;

import java.util.Scanner;


public class WordMain2 {
	
	private static Scanner scan = new Scanner(System.in);
	
	private static Word [] list = new Word[10];//단어장
	private static int count = 0; //저장된 단어 개수
	/* 영어 단어장 프로그램을 만드세요.
	 * 1. 기능 정리
	 * - 단어는 영어 단어와 한글 뜻으로 구성
	 * - 영어 단어는 영어이고, 공백이 없는 단어
	 * - 한글 뜻은 한글이고, 한 문장으로 되어 있다
	 * - 한 단어에 뜻이 한개만 있다고 가정
	 * -기능
	 * 	- 단어 등록
	 * 	- 단어 검색
	 * 	- 단어 수정
	 * 	- 단어 삭제
	 * -Word 클래스
	 * 	- word : 영단어
	 * 	- meaning : 뜻
	 * 	- 단어 출력, 단어 수정, 단어 확인 : 주어진 문자열과 같은 단어인지 확인
	 *  
	 * 2. 틀 작성
	 * 	 
	 * 3. 필요한 메서드 구현
	 * */
	public static void main(String[] args) {
		int menu;
		//반복문
		do {	
			//메뉴 출력
			printMenu();
			//메뉴 선택
			menu = scan.nextInt();
			
			//선택한 메뉴에 맞는 기능 실행
			runMenu(menu);
		}while(menu != 5);
	}

	public static void printMenu() {
		System.out.println("---------------");
		System.out.println("1. 단어 등록");
		System.out.println("2. 단어 검색");
		System.out.println("3. 단어 수정");
		System.out.println("4. 단어 삭제");
		System.out.println("5. 종료");
		System.out.println("---------------");
		System.out.print("메뉴 선택 : ");
	}
	public static void runMenu(int menu) {
		switch(menu) {
		case 1:
			//단어 등록 기능 구현
			insertWord();
			break;
		case 2:
			//단어 검색 기능 구현
			System.out.println("단어 검색");
			break;
		case 3:
			System.out.println("단어 수정");
			break;
		case 4:
			System.out.println("단어 삭제");
			break;
		case 5:
			System.out.println("프로그램 종료!");
			break;
		default:
			System.out.println("잘못된 메뉴를 선택했습니다.");
		}
	}
	public static void insertWord() {
		//단어와 뜻 입력
		scan.nextLine();
		System.out.print("단어 : ");
		String word = scan.next();
		
		System.out.print("의미 : ");
		scan.nextLine();//엔터 처리
		String meaning = scan.nextLine();
		//단어와 뜻을 이용하여 Word의 인스턴스를 생성
		Word tmp = new Word(word, meaning);
		
		//위에서 생성한 인스턴스를 단어장에 저장
		list[count] = tmp;
		//저장된 단어의 개수를 1증가
		count++;
		
		//테스트용으로 단어장 목록 출력
		for(int i = 0; i<count; i++) {
			list[i].print();
		}
		
		//단어장이 꽉 차면 단어장 크기를 늘림
		if(count == list.length) {
			expandWordList();
		}
		
	}
	public static void expandWordList() {
		//기존 단어장보다 큰 새 단어장 생성
		Word[] tmpList = new Word[list.length + 10];
		//새 단어장에 기존 단어들을 복붙
		System.arraycopy(list, 0, tmpList, 0, count);
	    //새 단어장을 내 단어장이라고 선언
		list = tmpList;
	}
}





