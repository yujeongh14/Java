package ch03.sec07;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// 논리연산자
		// AND 연산자 (&&)
		// 1. 왼쪽이 거짓이라면 오른쪽을 연산하지 않는다.
		// 2. "&&" 연산자는 일반적으로 or(||) 연산자보다 우선순위가 높다.
		// 3. "&&" 연산자의 결과는 논리값(참 또는 거짓)
		// (조건식) && (조건식)
		// (true) && (true) = (true)
		// 그 외는 모두 거짓
		// && 기호를 기준으로 왼/오른쪽 둘 다 true이면 true

		// OR 연산자 (||)
		// 왼쪽, 오른쪽 식 중 하나라도 참이면 True다
		// || 기호를 기준으로 왼/오른쪽 중 하나라도 true이면 true

		// NOT 연산자 (!) , 논리부정연산자
		// true이면 false, false이면 true
		
		int charCode = 'A';
		// int charCode = 'a';
		// int charCode = 5;
		
		if ((65<=charCode) & (charCode<=90)) {
			System.out.println("대문자이군요.");
		}
		
		if ((97<=charCode) && (charCode<=122)) {
			System.out.println("소문자이군요.");
		}
		
		if ((48<=charCode) && (charCode<=57)) {
			System.out.println("0~9 숫자이군요.");
		}
		
		//---------------------------------------------------------------
		
		int value = 6;
		// int value = 7;

		if ((value%2==0) && (value%3==0)) {
			System.out.println("2 또는 3의 배수이군요.");
		}
		
		boolean result = (value%2==0) || (value%3==0);
		if(!result) {
			System.out.println("2또는 3의 배수가 아니군요");
		}
	}
}
