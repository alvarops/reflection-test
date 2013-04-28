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
	public void tearDown() throws Exception {
		mBean = null;
	}

	@Test
	public void test() {
		String strBean;
		assertNotNull(mBean);
		strBean = mBean.toString();
		System.out.println(strBean);
		assertFalse(strBean.isEmpty());
		assertFalse(strBean.indexOf("field1") == -1);
	}

}
