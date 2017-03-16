package com.lotzy.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <pre>
 * Title: Loggable interface
 * Description: Annotation definition
 * </pre>
 *
 * @author Lotzy
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface Loggable {
	//do nothing
}
