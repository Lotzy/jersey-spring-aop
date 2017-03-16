package com.lotzy;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <pre>
 * Title: AppConfigurator class
 * Description: Spring application configuration using annotations
 * </pre>
 *
 * @author Lotzy
 * @version 1.0
 */
@EnableAspectJAutoProxy //enables AspectJ support within the Spring beans
@Configuration
@ComponentScan({"com.lotzy"})
public class AppConfigurator {
	//nothing needed yet
}
