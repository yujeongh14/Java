package ch04.sec03;

public class SwitchValueExample {

	public static void main(String[] args) {
		// 타입 변수 = switch(grade){
		//	 case "값1" -> 변수 값;
		//	 case "값2" -> {
		//	  ...;
		//	  yield 변수 값;
		//  }
		//	default -> 변수 값; // 반드시 존재
		// };
		
		String grade = "B";
		
		// Java 11 이전 문법
		int score1 = 0;
		switch(grade) {
			case "A":
				score1 = 100;
				break;
			case "B":
				int result = 100 - 20;
				score1 = result;
				break;
			default:
				score1 = 60;
		}
		System.out.println("score1: " + score1);
		
		// Java 12부터 가능
		int score2 = switch(grade) {
			case "A" -> 100;
			case "B" -> {
				int result = 100 - 20;
				// Java 13부터 가능
				yield result;
			}
			default -> 60;
		};
		System.out.println("score2: " + score2);
	}
						
}
