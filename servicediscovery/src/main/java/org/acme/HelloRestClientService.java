package org.acme;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@RegisterRestClient(configKey = "hello-api")
@Path("/hello")
public interface HelloRestClientService {
    //methods
    @GET
    String sayHello();
}
