package ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {
		// subString() : 문자열 자르기
		// subString(int beginIndex) : beginIndex에서 끝까지 잘라내기
		// subString(int beginIndex, int endIndex) : beginIndex에서 endIndex 앞까지 잘라내기
		
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}

}
