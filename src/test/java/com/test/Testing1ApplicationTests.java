package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Testing1ApplicationTests {

	@Test
	public void additiontest()
	{
		assertEquals(20,Calculator.add(10,10));
	}
	public void subtractiontest()
	{
		assertEquals(15,Calculator.sub(20, 5));
	}
	public void multiplicationtest()
	{
		assertEquals(200,Calculator.mul(20, 10));
	}
	public void divisiontest()
	{
		assertEquals(5,Calculator.div(10, 2));
	}
	
}
