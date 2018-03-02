package exercise_11;

public class TestForEachArray {

	public static void main( String[] args ) {
		int[] arr = { 10, 20, 30, 40, 50 };
		
		for( int inx = 0; inx < arr.length; inx++ ){
			System.out.println( arr[inx] );
		}
		
		for( int inx : arr ){
			System.out.println( inx );
		}
	}
}
