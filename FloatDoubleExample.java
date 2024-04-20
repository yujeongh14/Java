package ch02.sec04;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// 실수 자료형
	
		// float :  4byte 실수(6 ~ 9자리)
		// double : 8byte 실수(기본값) (15 ~ 18자리)
		// 정밀도 확인 : double 타입이 float 타입보다 약 2배 정도 유효 자릿수 가짐
		float var1 = 0.123456789123456789F;
		double var2 = 0.123456789123456789;
		System.out.println(var1);
		System.out.println(var2);
		
		// 실수의 범위는 무한대에 가깝기 때문에 제한된 공간을 가진 컴퓨터는 모든 범위의 수를 담기란 불가능
		// 따라서 근사값, 소수점 이하 (가수부) 유효범위까지만 실수값을 저장하고 나머지 부분에 있어서는 오차가 발생
		// 따라서, 반복적인 실수 연산처리는 오차가 나타날 수 밖에 없음
		
		float b1 = 3.14f; 	// 리터럴접미사 : F, f : float 자료형
		double b2 = 3.14f;  // 리터럴접미사 x ==> 기본자료형 (double)
		
		// 10의 거듭제곱 리터럴
		double var3 = 5e4;			// 5.0 x 10⁴
		double var4 = 3e6F;
		double var5 = 2e-3;
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);

		System.out.println("-------------------실수 자료형 예제------------------");
		double f;
		
		f = 5 / 4;			// 5 나누기 4 == 1 실수형 자료형에 대입 -> 정수값만 계산됨 , 5는 실수 자료형으로 인식되므로
		System.out.println(f);
	
		f = (double)5 / 4;  // 5를 먼저 double 형으로 바꾸고 정수 4로 나눔
		System.out.println(f);
		
		f = (int) 5.5 + (int) 1.5; // 실수형을 int형으로 바꾸면 실수 부분은 내림 됨
		System.out.println(f);
	
	}

}
