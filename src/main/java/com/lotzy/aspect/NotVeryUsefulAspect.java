package com.lotzy.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * Title: NotVeryUsefulAspect class
 * Description: Aspect definition class
 * </pre>
 *
 * @author Lotzy
 * @version 1.0
 */
@Aspect
@Component //without this shit will not work
public class NotVeryUsefulAspect {

	/**
	 * Advice method that will be called when the custom annotation @Auditable is encountered on some methods
	 * @param auditable - this absolutely needs to be declared and must respect java variable naming convention derived from the annotation interface name.
	 * Same rule for @annotation(auditable)
	 * Example: @MumuAnnotation then mumuAnnotation
	 */
	@After("@annotation(auditable)") //same for @Before
	public void myAdvice(Auditable auditable) {
		System.out.println("Executing myAdvice!!");
	}

}
