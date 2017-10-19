package com.lotzy.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lotzy.aspect.Auditable;
import com.lotzy.aspect.Loggable;
import com.lotzy.service.GreetingService;

/**
 * <pre>
 * Title: SpringRequestResource class
 * Description: Component serving the REST services
 * </pre>
 *
 * @author Lotzy
 * @version 1.0
 */
@Path("/spring-hello")
@Component //this is a must, otherwise the point cuts defined with the aspect annotations will not work
public class SpringRequestResource {

	@Autowired
  private GreetingService greetingService;

  @GET
	@Auditable
  @Produces(MediaType.TEXT_PLAIN)
  public String getHello() {
      return greetingService.greet("world");
  }

  @GET
	@Loggable
  @Path("mumu")
  @Produces(MediaType.TEXT_PLAIN)
  public String getHelloMumu() {
  	System.out.println("Hello mumu");
    return greetingService.greet("mumu");
  }

}
