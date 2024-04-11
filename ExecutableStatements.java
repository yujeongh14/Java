package ch01;

public class ExecutableStatements {

	public static void main(String[] args) {
//		실행문
//		: main() 메소드 블록 내부에는 다양한 실행문이 작성
//		: 변수 선언, 변수값 저장, 메소드 호출에 해당하는 코드들
//		: 실행문의 끝에는 반드시 세미콜론을 붙여야 함. 그렇지 않으면 컴파일 에러 발생
		
		int x = 1;						// 변수 x를 선언하고 1을 저장
		int y = 2;						// 변수 y를 선언하고 2를 저장
		int result = x + y;				// 변수 result를 선언하고 x와 y를 더한 값을 저장
		System.out.println(result);		// 콘솔에 호출하는 메소드 호출
				

	}

}
