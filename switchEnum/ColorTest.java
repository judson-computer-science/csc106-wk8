import java.util.Arrays;

public class ColorTest {

	public static void main(String[] args) {
		
		for(Color color : Color.values()) {

			switch(color) {
				case BLUE:
				case YELLOW:
				case RED:
					System.out.println(color.getName() +
						" is a primary color");
					break;
				case BLACK:
					System.out.println(color.getName() +
						" is a shade");
					break;
				default:
					System.out.println(color.getName() +
						" is neither.");
					break;
			}

		}
	}
}

