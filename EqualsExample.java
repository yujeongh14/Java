package ch05.sec05;

public class EqualsExample {

	public static void main(String[] args) {
		// java에서 문자열은 String Constant Pool이라는 메모리 영역에 저장.
		// 같은 문자열은 동일한 메모리 위치를 가리킨다.
		
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		// .equals : 문자열 비교
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		// 새로운 문자열 객체를 Heap 영역에 만들게 된다.
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		
		System.out.println(System.identityHashCode(strVar1));
		System.out.println(System.identityHashCode(strVar2));
		System.out.println(System.identityHashCode(strVar3));
		System.out.println(System.identityHashCode(strVar4));

		// System.identityHashCode
		// 객체의 실제 메모리 주소를 기반으로 하는 해시 코드를 반환

		// "=="는 서로 동일한 인스턴스냐, 같은 메모리 주소값을 지니냐, 객체가 참조하고 있는 메모리 '값'을 비교
		

	}

}
