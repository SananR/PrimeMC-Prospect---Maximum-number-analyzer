package com.sanan.highestnumber;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sanan.highestnumber.util.MathUtil;

public class JUnitTests {

	@Test
	public void firstTest() {
		String input = "35        ,5  ,25";
		String output = MathUtil.getLargestPossible(input);
		String expectedOutput = "53525";
		assertEquals(output, expectedOutput);
	}

	@Test
	public void secondTest() {
		String input = "25,8483  ,45,  333";
		String output = MathUtil.getLargestPossible(input);
		String expectedOutput = "84834533325";
		assertEquals(output, expectedOutput);
	}

	@Test
	public void thirdTest() {
		String input = "646,     88  ,88889";
		String output = MathUtil.getLargestPossible(input);
		String expectedOutput = "8888988646";
		assertEquals(output, expectedOutput);
	}

	@Test
	public void fourthTest() {
		String input = "894        ,671  ,386,    2555, 5252";
		String output = MathUtil.getLargestPossible(input);
		String expectedOutput = "89467152523862555";
		assertEquals(output, expectedOutput);
	}
	
	@Test
	public void fifthTest() {
		String input = "7612        ,8362  ,         92621,      828";
		String output = MathUtil.getLargestPossible(input);
		String expectedOutput = "9262183628287612";
		assertEquals(output, expectedOutput);
	}
}
