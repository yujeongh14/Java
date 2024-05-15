package ch05.sec05;

public class CharAtExample {

	public static void main(String[] args) {
		// charAt : 문자열의 인덱스 번호를 찾아 반환 (첫번째 자리 0부터 시작)
		
		String ssn ="9506241230123";
		char sex = ssn.charAt(6);
		switch(sex) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
		}
	}

}
