package learning_java_ee.boundry;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import learning_java_ee.entity.Car;

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
