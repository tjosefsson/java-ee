package learning_java_ee.boundry;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
public class Test {


    @GET
    public String test() {
        return "this is a test";
    }
}
