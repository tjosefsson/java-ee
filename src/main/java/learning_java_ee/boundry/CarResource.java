package learning_java_ee.boundry;

import learning_java_ee.entity.Car;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("cars")
@Produces(MediaType.APPLICATION_JSON)
public class CarResource {

    @Inject
    CarManufacturer carManufacturer;

    @GET
    public List<Car> retreaveCars() {
        return carManufacturer.retrieveCar();
    }
}
