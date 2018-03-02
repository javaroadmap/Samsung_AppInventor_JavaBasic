package exercise_09;

public class TestSwitch {

	public static void main( String[] args ) {
		int aaa = 10;
		int bbb = 0;
		
		switch ( aaa ) {
			case 5:
				bbb = bbb + 1;
				break;
			case 10:
				bbb = bbb + 2;
				break;
			case 15:
				bbb = bbb + 4;
				break;
			default:
				bbb = bbb + 3;
				break;
		}
		// fall-through 실습필요!
		
		System.out.println( bbb );
	}
}
