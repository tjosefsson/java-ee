package learning_java_ee.boundry;

import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import learning_java_ee.control.CarCreationException;
import learning_java_ee.entity.Car;
import learning_java_ee.entity.EngineType;
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
    public List<Car> getCars(@QueryParam("filters") EngineType engineType) {
//        if (engineType != null) {
//            return carManufacturer.retrieveCars(engineType);
//        }
        return carManufacturer.retrieveCars();
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createCar(@Valid @NotNull Specification specification) {
        var car = carManufacturer.manufactureCar(specification);
        return Response.status(Response.Status.CREATED).entity(car).build();

//        var uri = uriInfo.getBaseUriBuilder()
//                .path(CarResource.class)
//                .path(CarResource.class, "getCar")
//                .build(newCar.getIdentifier());
//
//        return Response.status(Response.Status.CREATED)
//                .header(HttpHeaders.LOCATION, uri)
//
//                .entity(newCar).build();
    }

//    @GET
//    @Path("{id}")
//    public Car getCar(@PathParam("id") String id) {
//        return carManufacturer.retrieveCar(id);
//    }

}
