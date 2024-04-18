package ch02.sec01;

public class VariableExchangeExample {
		// 변수는 또 다른 변수에 대입되어 메모리 간에 값을 복사할 수 있다
	public static void main(String[] args) {
		// 두 변수의 값을 교환해 보기
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x; // 두 변수의 값을 교환하기 위한 새로운 변수, 이 변수 없으면 중간에 값을 교환해주는 곳이 없어서 값이 날라감.
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);

	}

}
