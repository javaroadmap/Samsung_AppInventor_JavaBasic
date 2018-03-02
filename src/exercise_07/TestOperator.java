package exercise_07;

public class TestOperator {

	public static void main( String[] args ) {
		//대입 연산자
		int a = 10, b = 3;
		int c = 0, d = 0;
		
		c = a + b;
		System.out.println( "c = " + c );
		c += b; // c = c + b;
		System.out.println( "c = " + c );
		c -= a; // c = c - a;
		System.out.println( "c = " + c );
		
		//산술 연산자
		a = 10; b = 3;
		c = 0;
		System.out.println( "a + b = " + ( a + b ) );
		System.out.println( "a - b = " + ( a - b ) );
		System.out.println( "a * b = " + ( a * b ) );
		System.out.println( "a / b = " + ( a / b ) );
		// System.out.println( "a / d = " + ( a / d ) );		
		System.out.println( "a % b = " + ( a % b ) );
		
		//증감 연산자
		int num = 10, num2 = 10;
		int result = 0, result2 = 0;
		result = num++;
		//result = num;
		//num = num + 1;
		System.out.println( "result = " + result );
		result2 = ++num2;
		//num2 = num2 + 1;
		//result2 = num2;
		System.out.println( "result2 = " + result2 );
		
		//단항 연산자
		a = 10;
		b = -a;
		System.out.println( "b = " + b );
		
		boolean flag = true;
		System.out.println ( !flag );
		
		int divisor = 0;
		int dividend = 100;
		
		/*
		if ( divisor != 0 & dividend/divisor > 10 ) {
			System.out.println( "몫이 10보다 크다." );
		}
		*/
		
		if ( divisor != 0 && dividend/divisor > 10 ) {
			System.out.println( "몫이 10보다 크다." );
		}
		
	}
}
