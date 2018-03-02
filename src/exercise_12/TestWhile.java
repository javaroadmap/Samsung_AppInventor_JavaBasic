package exercise_12;

public class TestWhile {

	public static void main( String[] args ) {
		int sum = 0;
		int inx = 0;
		
		while ( inx < 10 ) {
			sum += inx;
			inx++;
		}
		
		System.out.println( sum );
	}
}
