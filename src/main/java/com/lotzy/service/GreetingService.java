package com.lotzy.service;

/**
 * <pre>
 * Title: GreetingService interface
 * Description: Greeting service interface
 * </pre>
 *
 * @author Lotzy
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
