package ie.altech.jersey.resource;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hellp")
public class HelloResourse {

    private final String message;

    @Inject
    public class HelloResourse(@Named("message") String message){
        this.message = message;
    }

    @GET
    public String hello(){
        return this.message;
    }
}
