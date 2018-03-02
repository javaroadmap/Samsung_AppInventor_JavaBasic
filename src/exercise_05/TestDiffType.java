package exercise_05;

public class TestDiffType {

	public static void main(String[] args){

		double dValue = 3.14;
		int iValue = 10;
		double rValue = dValue + iValue ;
		System.out.println( "rValue : " + rValue );
		// int rValue = dValue + iValue ; // error
		
		short a, b, c;
		a = 1;
		b = 2;
		// int 보다 작은 data type 끼리의 연산 결과는 int
		// c = a + b;
		c = (short) ( a + b );
		// casting 시 주의할 사항
		// c = (short)a + b;
		System.out.println( "c : " + c );
		
		
		long longVal = 99L;
		// int intVal1 = longVal; // compile error
		int intVal2 = (int)longVal; // Casting 했으므로 OK (정보도 잃지 않음)
		int intVal = 128;
		byte byteVal = (byte)intVal; // byteVal에 저장될 값 보장 못함
		System.out.println( "intVal2 : " + intVal2 );
		System.out.println( "byteVal : " + byteVal );
	}
}
