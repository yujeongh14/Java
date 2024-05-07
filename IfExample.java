package ch04.sec02;

public class IfExample {

	public static void main(String[] args) {
		// 01 if문
		// 조건문을 작성할 때 사용하는 구문

		// 조건식이 참이라면 코드 블럭을 실행
		// 조건식이 거짓이라면 코드 블럭을 무시(스킵)
		// else문을 통해 조건이 거짓인 경우 실행코드를 지정할 수 있다.

		// 조건식은 참 또는 거짓을 판단할 수 있는 식이어야만 한다.
		// 참 : 1, 거짓 0

		// 즉시 줄바꿈 : shift + enter
		// System.out.println("---------------------if문---------------------");

//		if (조건문) {
//			 조건문이 참이면 실행
//		}

//		if (true) {
//			System.out.println("조건문이 참이면 실행!");
//		}

		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if(score < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
			

	}

}
