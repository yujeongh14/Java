package ch04.sec03;

public class SwitchExample {

	public static void main(String[] args) {
		// Switch문 (다중 분기)
		// 조건 문 중 하나
		// 조건이 여러 개일 때 각 조건에 따른 코드를 실행할 수 있다.
				
		// Switch문 구조
				
//		switch (변수) {
//		case 값1: 	// case는 여러 개일 수 있다. / case는 if문이면서 else if문이기도 하다.
//			값이 1일 경우 실행되는 코드 블럭
//			break; // 위 코드를 실행 후 break; 만나면 stop
//		case 값2:
//			값이 2일 경우 실행되는 코드 블럭
//			break;
//		default:	// else문
//			break;
//		}
		
		int num = (int)(Math.random()*6) + 1;
		
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
			System.out.println("6번이 나왔습니다.");
		}
	}

}
