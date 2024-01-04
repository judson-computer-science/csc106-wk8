import java.util.Arrays;

public class ColorTest {

	public static void main(String[] args) {
		
		Color color = Color.BLUE;

		System.out.println(color.getName() + " variations: " +
			Arrays.toString(color.getVariations()));
	}
}
