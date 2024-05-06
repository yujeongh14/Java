package ch03.sec10;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		// 대입 연산자
		// ' = ' : 왼쪽은 '공간' 오른쪽은 '값'으로 해석
		// 오른쪽 값 저장 후 왼쪽 공간으로 대입
		
		// 복합 대입 연산자(산술 + 대입)
		// 복합대입 연산자 = 대입연산자 + 산술연산자
		
		int result = 0;
		result += 10;
		System.out.println("result=" + result);
		result -= 5;
		System.out.println("result=" + result);
		result *= 3;
		System.out.println("result=" + result);
		result /= 5;
		System.out.println("result=" + result);
		result %= 3;
		System.out.println("result=" + result);
	}		
}