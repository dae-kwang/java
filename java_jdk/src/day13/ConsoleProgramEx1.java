package day13;

public class ConsoleProgramEx1 {

	public static void main(String[] args) {
		/*
		ConsoleProgram cp = new ConsoleProgram();
		cp.run();
		*/
		//형변환 : 인터페이스와 구현 클래스 사이에서 형변환이 가능
		Program p = new ConsoleProgram();//오른쪽이 구현 클래스 왼쪽이 인터페이스
		p.run();
	}

}

	
