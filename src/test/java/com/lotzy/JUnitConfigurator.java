package com.lotzy;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <pre>
 * Title: JUnitConfigurator class
 * Description: Spring configuration with annotations for JUnit testing
 * Copyright: Copyright (c) 2017
 * Company: Almaviva S.p.A.
 * </pre>
 *
 * @author Lotzy (lotzy_l@yahoo.com)
 * @version 1.0
 */
@EnableAspectJAutoProxy
@Configuration
@ComponentScan({"com.lotzy"})
public class JUnitConfigurator {

}
