/*
 * UCF COP3330 Summer 2021
 * Copyright 2021 Harry Hocker
 */

package exercises.assignment2.ex24;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

	Main ex24 = new Main();

	@Test
	void testOrganizeArray() {

		String test = "zga";

		char[] expected = {'a', 'g', 'z'};
		char[] actual = ex24.organizeArray(test);

		assertArrayEquals(expected, actual);

	}


	@Test
	void isAnagramTest() {

		String s1 = "cda";
		String s2 = "acd";

		assertTrue(ex24.isAnagram(s1, s2));

	}
}