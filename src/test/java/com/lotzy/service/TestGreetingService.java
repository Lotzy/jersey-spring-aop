package com.lotzy.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lotzy.JUnitConfigurator;

/**
 * <pre>
 * Title: TestGreetingService
 * Description:
 * Copyright: Copyright (c) 2017
 * Company: Almaviva S.p.A.
 * </pre>
 *
 * @author Lotzy (lotzy_l@yahoo.com)
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JUnitConfigurator.class)
public class TestGreetingService {

	@Autowired
	private GreetingService service;

	/**
	 * Test method for {@link com.lotzy.serviceimpl.GreetingServiceImpl#greet(java.lang.String)}.
	 */
	@Test
	public void testGreet() {
		String actual =service.greet("World");
		assertEquals("hello, World!", actual);
	}

}
