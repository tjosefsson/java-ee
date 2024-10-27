package learning_java_ee;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import learning_java_ee.control.CarCreationException;

@Provider
public class CarCreateionExceptionMapper implements ExceptionMapper<CarCreationException> {

    @Override
    public Response toResponse(CarCreationException e) {
        return Response.serverError()
                .header("X-Car-Error", e.getMessage())
                .entity(e.getMessage())
                .build();
    }
}
