package exercise_08;

public class TestIf {

	public static void main( String[] args ) {
		int distance = 11;
		int fee = 0;
		
		if( distance <= 10 ) {
			fee = 800;
		} else if( distance <= 20 ) {
			fee = 900;
		} else {
			fee = 1000;
		}
		
		System.out.println( "distance : " + distance + " fee : " + fee );
		
		distance = 9;
		fee = 0;
		boolean expressBus = false;
		
		if( distance <= 10 ) {
			if( expressBus ) {
				fee = 850;
			} else {
				fee = 800;
			}
		} else if( distance <= 20 ) {
			fee = 900;
		} else {
			fee = 1000;
		}
		
		System.out.println( "distance : " + distance + " fee : " + fee );
		
		int i = 200;
		if ( i < 100 ) {
			if ( i > 10 ) {
				System.out.println( "10보다 크고 100보다 작다");
			} else {
				System.out.println( "i는 100이상이다.");
			}
		}
	}
}
