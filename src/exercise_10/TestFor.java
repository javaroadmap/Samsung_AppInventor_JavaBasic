package exercise_10;

public class TestFor {

	public static void main( String[] args ) {
		int sum = 0;
	
		for ( int inx = 0 ; inx < 10 ; inx++ ) {
			sum += inx;
		}
		
		System.out.println( sum );
		
		int jnx = 0;
		for ( jnx = 1 ; jnx <= 10 ; jnx++ ) {
			System.out.println( jnx );
		}
	}
}
