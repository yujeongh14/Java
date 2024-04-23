package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		// 자료형 변환의 종류
		// 1. 자동형 변환 (암시적 형 변환) : 컴파일러가 자동으로 형 변환시켜주는 경우
		// 2. 강제형 변환 (명시적 형 변환) : 개발자(프로그래머)가 인위적으로 강제적으로 형 변환시키는 경우

		// 자동형변환
		// 범위가 넓은 자료형에 범위가 좁은 자료형이 대입되는 경우
		// 컴파일러가 알아서 형 변환을 해주게 된다 (데이터 손실 가능성이 낮거나 없을 때)
		// byte < short, char < int < long < float < double - 데이터 손실을 최소화
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);

		// 예외 : byte 타입은 char 타입으로 자동 변환 x -> char 타입의 허용 범위에 음수는 x
		// byte byteValue1 = 65;
		// char charValue = byteValue1; // 컴파일 에러 : Type mismatch: cannot convert from byte to char
	}
	
}

