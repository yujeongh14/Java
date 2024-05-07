package ch04.sec02;

public class IfElseExample {

	public static void main(String[] args) {
		// if문과 else문
		// if : 만약에
		// else : 그렇지 않으면

//		if (조건문1) {
//			조건문 1만 참이여도 실행된다.
//			if (조건문2) {
//				조건문 1, 2가 모두 참이여야 실행되는 코드
//			}
//			else {
//				//조건문 1은 참이나 조건문2가 거짓이면 실행된다.
//			}
//		} 
		
		int score = 85;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}else{
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
	}

}
