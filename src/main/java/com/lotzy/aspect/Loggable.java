package com.lotzy.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <pre>
 * Title: Loggable interface
 * Description: Annotation definition
 * Copyright: Copyright (c) 2017
 * Company: Almaviva S.p.A.
 * </pre>
 *
 * @author Lotzy (lotzy_l@yahoo.com)
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface Loggable {
	//do nothing
}
