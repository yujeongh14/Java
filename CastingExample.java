package ch02.sec08;

public class CastingExample {

	public static void main(String[] args) {
		// 자료형 변환의 종류
		// 1. 자동형 변환 (암시적 형 변환) : 컴파일러가 자동으로 형 변환시켜주는 경우
		// 2. 강제형 변환 (명시적 형 변환) : 개발자(프로그래머)가 인위적으로 강제적으로 형 변환시키는 경우

		// 강제형변환
		// int : 약 -21 ~ 21까지
		// short : 약 -32000 ~ 32000
		// byte :  -128 ~ 127
				
		// 프로그래머(개발자)가 특정 자료형을 강제로 형 변환하는 경우
		// -> 데이터 손실의 가능성 O
		// -> 당연히 좁은 범위의 자료형에다가 큰 값을 넣으려는 경우
		
		int var1 = 10;
		byte var2 = (byte) var1;
		System.out.println(var2); // 강제 타입 변환 후에 10이 그대로 유지
		
		long var3 = 300;
		int var4 = (int) var3;
		System.out.println(var4); // 강제 타입 변환 후에 300이 그대로 유지
		
		int var5 = 65;
		char var6 = (char) var5;
		System.out.println(var6); // 'A'가 출력
		
		double var7 = 3.14;
		int var8 = (int) var7;
		System.out.println(var8); // 3이 출력
	}
	
}
