package ch04.sec05;

public class PringFrom1To10Example {

	public static void main(String[] args) {
		// while문의 구조
		// 조건식이 참인 경우 반복적으로 코드를 실행한다.

		// while (조건식) {
		// 반복실행 코드 // 예) 조건식이 참이면 코드 실행
		// }

		// 조건문은 탈출용 변수가 필요하다.
		// 탈출용 변수
		int i = 1;
		// 탈출용 조건식
		while(i<=10) {
			System.out.println(i + " ");
			i++; // 탈출을 위한 연산식
		}
	}

}
