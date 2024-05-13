package ch05.sec01;

public class GarbageObjectExample {

	public static void main(String[] args) {
		// 자바는 코드를 이용해서 객체를 직접 제거x -> 객체를 제거하는 유일한 방법 : 객체의 모든 참조를 제거
		
		String hobby = "여행";
		hobby = null; // "여행"에 해당하는 String 객체를 쓰레기로 만듦
		
		String kind1 = "자동차";
		String kind2 = kind1; // kind1 변수에 저장되어 있는 번지를 kind2 변수에 대입
		kind1 = null; // "자동차"에 해당하는 String 객체는 쓰레기가 아님
		System.out.println("kind2 : " + kind2);
	}

}
