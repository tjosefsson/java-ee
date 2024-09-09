package learning_java_ee.boundry;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import learning_java_ee.entity.Car;
import learning_java_ee.entity.Specification;

import java.util.List;

@Path("/cars")
@Produces(MediaType.APPLICATION_JSON)
public class CarResource {

    @Inject
    CarManufacturer carManufacturer;

    @Context
    UriInfo uriInfo;

    @GET
    public List<Car> getCars() {
        return carManufacturer.retrieveCars();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createCar(Specification specification) {
        var newCar = carManufacturer.manufactureCar(specification);

        var uri = uriInfo.getBaseUriBuilder()
                .path(CarResource.class)
                .path(CarResource.class, "getCar")
                .build(newCar.getIdentifier());

        return Response.status(Response.Status.CREATED)
                .header(HttpHeaders.LOCATION, uri)
                .entity(newCar).build();
    }

    @GET
    @Path("{id}")
    public Car getCar(@PathParam("id") String id) {
        return carManufacturer.retrieveCar(id);
    }

}
