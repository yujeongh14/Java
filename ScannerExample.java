package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// import : 불러오겠다, 추가하겠다.
		// java라는 폴더 .(안에) util.(안에) Scanner를 추가하겠다.
		// * : 모든것
		
		// 입력문(값, 입력받기, Scanner)
		// System.out : 표준 출력 스트림 생성 - 모니터
		// System.in : 표준 입력 스트림 생성 - 키보드
		// 실수
		// nextDouble();
		// nextFloat();
		
		// 정수
		// nextint();
		// nextLong();
		// nextByte();
		// nextShort();
		
		// 논리
		// nextBoolean();
		
		// 한 단어(String) : 띄어쓰기 기준으로 한 문자열만 가능
		// next();
		
		// 한 문자열(String)
		//nextLine();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x 값 입력: ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.println("y 값 입력: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y: " + result);
		System.out.println();
		
		while(true) {
			System.out.println("입력 문자열: ");
			String data = scanner.nextLine();
			if(data.equals("q")) {
				break;
			}
			System.out.println("출력 문자열: "+ data);
			System.out.println();
		}
		
		System.out.println("종료");
	}
}
