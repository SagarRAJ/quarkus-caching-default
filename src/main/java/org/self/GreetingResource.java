package org.self;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import jakarta.ws.rs.QueryParam;

@Path("/hello")
public class GreetingResource {

    @Inject
    GreetingService greetingService;

    @GET
    public String greet(@QueryParam("name") String name) {
        return greetingService.getGreeting(name);
    }
}
