package com.lotzy.serviceimpl;

import org.springframework.stereotype.Service;

import com.lotzy.service.GreetingService;

/**
 * <pre>
 * Title: GreetingServiceImpl class
 * Description: Greeting service implementation
 * Copyright: Copyright (c) 2016
 * Company: Almaviva S.p.A.
 * </pre>
 *
 * @author Lotzy (lotzy_l@yahoo.com)
 * @version 1.0
 */
@Service
public class GreetingServiceImpl implements GreetingService {

	@Override
  public String greet(String who) {
		System.out.println("Greet " + who);
    return String.format("hello, %s!", who);
  }
}
