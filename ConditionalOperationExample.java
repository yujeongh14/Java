package ch03.sec11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		// 삼항 연산자
		// (조건식) ? 참인경우 실행코드 : 거짓인경우 실행코드
		
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + " 점은 " + grade + " 등급입니다.");
	}

}
