package exercise_03;

public class TestVariableNamingRule {

	public static void main(String[] args) {
		int abc;
		int abc; // 동일한 변수 선언 시 컴파일 에러 발생
		int 1st; // 숫자로 시작하는 변수 선언 시 컴파일 에러 발생
		int first;
		int $123;
		int #123; // '_' ,'$' 이외의 특수문자를 변수명에 사용 시 컴파일 에러 발생
		int true; // 예약어를 변수명으로 사용 시 컴파일 에러 발생
		int True;
	}
}
