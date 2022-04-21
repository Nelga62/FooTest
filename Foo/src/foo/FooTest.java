package foo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Bad Taste
 * 
 *         test class for a rubbish class
 */
class FooTest {

	@Test
	void testGreetMethod() {
		Foo foo = new Foo();
		// Testing spanish greet once
		String expected = "hola";
		String target = foo.greet_method(0, 1);
		assertEquals(expected, target);
		// Testing english greet twice
		expected = "hellohello";
		target = foo.greet_method(1, 2);
		assertEquals(expected, target);
		// Testing basque greet four times
		expected = "kaixokaixokaixokaixo";
		target = foo.greet_method(2, 4);
		assertEquals(expected, target);
	}

}
