package com.helloworld;

import static org.junit.Assert.*;

import org.junit.Test;

public class myTest {

	@Test
	public void test() {
		int result = Main.add(5, 3);
		assertEquals(8, result);
	}

}
