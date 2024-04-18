package ch02.sec01;

public class VariableInitializationExample {
		// 01.변수
		// 자료(데이터) : 선 저장 후 처리 (공간 먼저 확보 후 저장)
		// 자료형 : 데이터 종류에 따라 저장될 공간을 미리 규격화 시켜놓은 예약어
		// 변수 : 하나의 값을 저장할 수 있는 메모리 번지에 붙여진 이름, 필요에 의해 반복적으로 바뀔 수 있음
		// " = " : 은 우리가 알던 수학적 기호의 의미. "같다"라는 의미가 아니라 "대입"의 의미를 지님
	
		// 02.변수 value 선언
		// 변수를 사용하려면 변수의 선언이 필요. 어떤 타입의 데이터를 저장할 건지, 번수 이름이 무엇인지를 결정
		// 변수명 주의사항 : 첫 번째 글자가 문자, 특수문자 불가 (%, _ 제외), 캐멀식 스타일이 관례
		// 변수 선언은 아직 메모리에 값이 할당된 것이 아님
		// -> 변수에 최초로 값을 대입하는 행위인 변수 초기화를 해야 해당 메모리에 값이 저장 됨
	public static void main(String[] args) {
	
		int value; //선언은 되었지만 초기화 되지 않았기에 밑에 코드에서 값을 읽어올 수 없고 에러 발생시킴
		
		// 연산 결과를 변수 result의 초기 값으로 대입
		// int result = value + 10; // 컴파일 에러 발생 : The local variable value may not have been initialized
		
		// 변수 result 값을 읽고 콘솔에 출력
		//System.out.println(result);
	}

}
