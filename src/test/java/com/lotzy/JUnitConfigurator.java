package com.lotzy;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <pre>
 * Title: JUnitConfigurator class
 * Description: Spring configuration with annotations for JUnit testing
 * </pre>
 *
 * @author Lotzy
 * @version 1.0
 */
@EnableAspectJAutoProxy
@Configuration
@ComponentScan({"com.lotzy"})
public class JUnitConfigurator {
	//nothing needed yet
}
