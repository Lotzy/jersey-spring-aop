package com.lotzy.service;

/**
 * <pre>
 * Title: GreetingService interface
 * Description: Greeting service interface
 * Copyright: Copyright (c) 2016
 * Company: Almaviva S.p.A.
 * </pre>
 *
 * @author Lotzy (lotzy_l@yahoo.com)
 * @version 1.0
 */
public interface GreetingService {

	/**
	 * Will "greet" the who
	 * @param who - who to greet
	 * @return String representing the greeting
	 */
	public String greet(String who);
}
