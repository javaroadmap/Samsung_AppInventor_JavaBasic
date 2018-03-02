package exercise_14;

public class TestBreak {

	public static void main(String[] args) { 
		for (int cnt = 0; cnt < 10; cnt++) { 
			System.out.println(cnt); 
			if (cnt == 5) { 
				break; 
			} 
		} 
	}
}
