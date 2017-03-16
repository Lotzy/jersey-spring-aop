package com.lotzy;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <pre>
 * Title: AppConfigurator class
 * Description: Spring application configuration using annotations
 * Copyright: Copyright (c) 2017
 * Company: Almaviva S.p.A.
 * </pre>
 *
 * @author Lotzy (lotzy_l@yahoo.com)
 * @version 1.0
 */
@EnableAspectJAutoProxy //enables AspectJ support within the Spring beans
@Configuration
@ComponentScan({"com.lotzy"})
public class AppConfigurator {
	//nothing needed yet
}
