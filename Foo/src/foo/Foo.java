package foo;
/**
 * 
 */

/**
 * @author Bad Taste
 * 
 *         greets in different languages
 */
public class Foo {

	/**
	 * Greets
	 * 
	 * @param language chosen language
	 * @param repeat   how many times repeat greet
	 * @return a String called greetingRepeated with the greeting repeated repeat
	 *         times
	 */
	public String greet_method(int language, int repeat) {
		String greetingRepeated = "";
		String greeting = "";

		switch (language) {
		case 0:
			greeting = "hola";
			break;
		case 1:
			greeting = "hello";
			break;
		case 2:
			greeting = "kaixo";
			break;
		default:
			break;
		}

		/**
		 * Repeat greeting repeat times
		 */
		for (int i = 0; i < repeat; i++) {
			greetingRepeated += greeting;
		}
		return greetingRepeated;
	}
}
