package ch02.sec02;

public class LongExample {

	public static void main(String[] args) {
		// 정수 타입의 메모리 크기
		// long : 8byte 정수
		
		long var1 = 10;
		long var2 = 20L;
		// long var3 = 1000000000000; 컴파일러 에러 The literal 1000000000000 of type int is out of range 
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
