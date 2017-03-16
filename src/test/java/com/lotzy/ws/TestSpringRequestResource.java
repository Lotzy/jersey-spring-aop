package com.lotzy.ws;

import static org.junit.Assert.*;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lotzy.JUnitConfigurator;

/**
 * <pre>
 * Title: TestSpringRequestResource
 * Description:
 * </pre>
 *
 * @author Lotzy
 * @version 1.0
 */
public class TestSpringRequestResource extends JerseyTest {

	protected Application configure() {
		ResourceConfig config = new ResourceConfig(SpringRequestResource.class);
		config.property("contextConfig", new AnnotationConfigApplicationContext(JUnitConfigurator.class));
		config.register(LoggingFilter.class);
		return config;
	}

	/**
	 * Test method for {@link com.lotzy.ws.SpringRequestResource#getHello()}.
	 */
	@Test
	public void testGetHello() throws Exception {
		String actual = target().path("spring-hello").request().get(String.class);
		assertEquals("hello, world!", actual);
		System.out.println(actual);
	}

	/**
	 * Test method for {@link com.lotzy.ws.SpringRequestResource#getHelloMumu()}.
	 */
	@Test
	public void testGetHelloMumu() {
		String actual = target().path("spring-hello").path("mumu").request().get(String.class);
		assertEquals("hello, mumu!", actual);
		System.out.println(actual);
	}

}
