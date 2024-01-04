import java.util.Arrays;

public class ColorTest {

	public static void main(String[] args) {
		
		String var = args[0];

		Color color = Color.fromVariation(var);

		if(color != null) {
			System.out.println(var + " is a type of " + color.getName());
		} else {
			System.out.println(var + " is not a recognized color!");
		}
	}
}

