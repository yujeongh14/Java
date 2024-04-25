package ch03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// 증감연산자
		// 1. 전치연산자 (++a, --a) : 먼저 1증가 및 감소 이후에 다른 연산 처리
		// 2. 후치연산자 (a++, a--) : 다른 연산 처리 이후에 1증가 및 감소
		
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x = "+ x);
		
		System.out.println("-----------------------");
		y--;
		--y;
		System.out.println("y = " + y);
		
		System.out.println("-----------------------");
		z = x++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("-----------------------");
		z = ++x;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println("-----------------------");
		z = ++x + y++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);


	}

}
