package com.bw.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Java2_WhiteBox {

	String func(int x, int y) {
		if (x > 10 && y > 100) {
			return Integer.toString(x) + "x" + "y";
		} else if (x < 0 && y < 10) {
			return Integer.toString(y) + "xy" + "y";
		} else {
			return "x" + "y";
		}
	}

	@Test
	public void test_Func01() {
		System.out.println("test_Func01");
		Java2_WhiteBox j = new Java2_WhiteBox();
		String r = j.func(11, 101);
		System.out.println(r);
		assertEquals("11xy", r);

	}

	@Test
	public void test_Func02() {
		System.out.println("test_Func02");
		Java2_WhiteBox j = new Java2_WhiteBox();
		String r = j.func(50, 150);
		System.out.println(r);
		assertEquals("50xy", r);

	}

	@Test
	public void test_Func03() {
		System.out.println("test_Func03");
		Java2_WhiteBox j = new Java2_WhiteBox();
		String r = j.func(10, 100);
		System.out.println(r);
		assertEquals("xy", r);

	}

	@Test
	public void test_Func04() {
		System.out.println("test_Func04");
		Java2_WhiteBox j = new Java2_WhiteBox();
		String r = j.func(-1, 9);
		System.out.println(r);
		assertEquals("9xyy", r);

	}

	@Test
	public void test_Func05() {
		System.out.println("test_Func05");
		Java2_WhiteBox j = new Java2_WhiteBox();
		String r = j.func(-50, 5);
		System.out.println(r);
		assertEquals("5xyy", r);

	}

	@Test
	public void test_Func06() {
		System.out.println("test_Func06");
		Java2_WhiteBox j = new Java2_WhiteBox();
		String r = j.func(-99, 1);
		System.out.println(r);
		assertEquals("1xyy", r);

	}

}
