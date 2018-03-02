package exercise_13;

public class TestDoWhile {

	public static void main(String[] args) {
		int sum = 0;
		int inx = 0;
		
		do {
			sum += inx;
			inx++;
		} while ( inx < 10 );
		
		System.out.println( sum );
	}

}
