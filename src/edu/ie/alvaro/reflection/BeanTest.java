package edu.ie.alvaro.reflection;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeanTest {

	private Bean	mBean;

	@Before
	public void setUp() throws Exception {
		mBean = new Bean();
	}

	@After
	public void tearDown() throws Exception {}

	@Test
	public void test() {
		assertNotNull(mBean);
		System.out.println(mBean.toString());
		assertFalse(mBean.toString().isEmpty());
	}

}
