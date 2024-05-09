package ch04.sec08;

public class ContinueExample {

	public static void main(String[] args) {
		// 제어문 - continue;
		// continue : 아래 코드 무시 및 반복문의 조건식으로 회기하여 다음 반복 실행
		// break는 소속된 코드 블럭을 즉시 탈출
		// continue는 소속된 코드 블럭(현재 실행중인 반복문)을 무시하고 조건식으로 돌아가 다음 반복을 시작
		
		for(int i =1; i<=10; i++){
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i + " ");
		}
	}

}
