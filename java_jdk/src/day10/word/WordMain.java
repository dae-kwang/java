package day10.word;

import java.util.Scanner;


public class WordMain {
	
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
	private static void runMenu(int menu) {
		
		
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
	public static void reunMenu(int menu) {
		switch(menu) {
		case 1:
			//단어 등록 기능 구현
			insertWord();
			System.out.println("단어 등록");
			break;
		case 2:
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
	private static void insertWord() {
		scan.nextLine();
		System.out.println("영단어 : ");
		String word = scan.nextLine();
		System.out.println("단어 뜻 : ");
		String meaning = scan.nextLine();
		
	}
}





