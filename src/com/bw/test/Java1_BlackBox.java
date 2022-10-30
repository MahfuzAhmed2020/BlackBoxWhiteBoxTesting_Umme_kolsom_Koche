package com.bw.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Java1_BlackBox {

	public double func01(int a, int b, double c) {
		if (a > 10 && b < 10) {
			a = a + b;
			return a;
		} else if (c > 0 || a > 100) {
			c = c + 10;
			return c;
		} else {
			return b = 10 + a;
		}
	}

	@Test
	public void test_Func01() {
		System.out.println("test_Func01");
		Java1_BlackBox j = new Java1_BlackBox();
		double r = j.func01(11, 9, 0.0);
		System.out.println(r);
		assertEquals(20.0, r, 0);
	}

	@Test
	public void test_Func02() {
		System.out.println("test_Func02");
		Java1_BlackBox j = new Java1_BlackBox();
		double r = j.func01(50, 5, 0.0);
		System.out.println(r);
		assertEquals(55.0, r, 0);
	}

	@Test
	public void test_Func03() {
		System.out.println("test_Func03");
		Java1_BlackBox j = new Java1_BlackBox();
		double r = j.func01(100, 1, 0.0);
		System.out.println(r);
		assertEquals(101.0, r, 0);
	}

	@Test
	public void test_Func04() {
		System.out.println("test_Func04");
		Java1_BlackBox j = new Java1_BlackBox();
		double r = j.func01(1, 10, 1.0);
		System.out.println(r);
		assertEquals(11.0, r, 0);
	}

	@Test
	public void test_Func05() {
		System.out.println("test_Func05");
		Java1_BlackBox j = new Java1_BlackBox();
		double r = j.func01(50, 10, 50.0);
		System.out.println(r);
		assertEquals(60.0, r, 0);
	}

	@Test
	public void test_Func06() {
		System.out.println("test_Func06");
		Java1_BlackBox j = new Java1_BlackBox();
		double r = j.func01(99, 10, 100.0);
		System.out.println(r);
		assertEquals(110.0, r, 0);
	}

}
