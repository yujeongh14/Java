package ch04.sec07;

public class BreakExample {

	public static void main(String[] args) {
		// 제어문 - break
		// 제어문은 반복문과 조건문에 필터링 기능을 부여하는 방법
		// 1. 반복문 탈출에 사용
		// 2. switch문 case 탈출에 사용
		
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num == 6){
				break;
			}
		}

		System.out.println("프로그램 종료");
	}

}
