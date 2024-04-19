package ch02.sec03;

public class CharExample {
	public static void main(String[] args) {
		// 정수 타입의 메모리 크기
		// 단일(한문자)자료형
		// char : 2byte 문자 저장 자료형
		
		// ASCII 코드 : 영어, 특수문자만 가능 
		// 유니코드 :  전 세계 모든 문자를 다룰 수 있는 표준 인코딩 방식(UTF-8)
		// 단일 문자 저장을 위해서 표준화된 ASCII 코드표를 참고하는데 문자 또는 숫자를 비트열로 저장
		
		// char와 short 비교
		// char : 2byte 정수 부호 X, 단일 문자 저장용으로 주로 사용
		// short : 2byte 정수 부호 O
		
		
		// char c = ''; // 컴파일 에러 Invalid character constant
		char c = ' ';	// 공백 하나를 포함해서 초기화
		
		char c1 = 'A';	// 문자 저장
		char c2 = 65;	// 유니코드 직접 저장
		
		char c3 = '가';
		char c4 = 44032;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}
