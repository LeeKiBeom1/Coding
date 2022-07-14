import java.util.Scanner;

public class JungOl {

	public static void main(String[] args) {
		
		
		

		
		Scanner sc = new Scanner(System.in);

		double input = sc.nextDouble();

		String type = " ";
		
		if (input <= 4.5 && input >= 0) {
			
			int score = (int)input;
			
			switch(score) {
			
			case 4:
				type = "scholarship";
				break;
			case 3:
				type = "next semester";
				break;
			case 2:
				type = "seasonal semester";
				break;
			case 1:
				type = "retake";
				break;
			case 0:
				type = "retake";
				break;
			}
		}
		System.out.println(type);
		


	}

}
