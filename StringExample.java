package ch02.sec06;

public class StringExample {

	public static void main(String[] args) {
		// 문자열 자료형
		// String : 클래스 자료형 
		
		// ESCAPE 문자		
		// '정보 표시' 목적으로 사용된 기존 그래픽문자(영소문자, 숫자, 특수문자)와는 다르게 '제어'목적으로 사용되는 특수문자
		// \(역슬래쉬)를 앞에 붙여 사용
		// 1. \n : 개행(줄바꿈)
		// 2. \t : Tap Key의 약어 -> 탭키만큼 이동
		// 3. \" , \' : 큰따옴표, 작은따옴표 출력
		
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);

		String str = "나는 \"자바\"를 배웁니다";
		System.out.println(str);
		
		str = "번호\t이름\t직업";
		System.out.println(str);
		
		System.out.print("나는\n");
		System.out.print("자바를\n");
		System.out.print("배웁니다.");
	}

}
