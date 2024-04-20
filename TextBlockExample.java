package ch02.sec06;

public class TextBlockExample {

	public static void main(String[] args) {
		// 큰따옴표 3개로 감싸면 이스케이프하거나 라인피드 할 필요없이 작성한대로 문자열 저장됨

		String str1 = "" + 
		"{\n" + 
		"\t\"id\":\"winter\",\n" +
		"\t\"name\":\"눈송이\"\n" +
		"}";
		
		String str2 = """
		{
		 "id":"winter"
		 "name":"눈송이"
		 } 
		""";
		
		System.out.println(str1);
		System.out.println("---------------------------------");
		System.out.println(str2);
		System.out.println("---------------------------------");
		String str = """
		나는 자바를 \
		학습합니다.
		나는 자바 고수가 될 겁니다.
		""";
		
		// 큰 따옴표 3개 블록 안에서 \는 줄바꿈x
		System.out.println(str);
	}
}
