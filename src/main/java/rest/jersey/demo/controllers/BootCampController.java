package rest.jersey.demo.controllers;

import org.springframework.stereotype.Component;
import rest.jersey.demo.models.BootCamper;
import rest.jersey.demo.services.BootCamperService;

import javax.annotation.PostConstruct;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootCampController {
    private BootCamperService bootCamperService;

    public BootCampController(BootCamperService bootCamperService){
        this.bootCamperService = bootCamperService;
    }

    @GET
    @Produces("application/json")
    public List<BootCamper> getAll(){
        return bootCamperService.getAll();
    }

    @POST
    @Path("/bootcampers")
    @Consumes("application/json")
    @Produces("application/json")
    public Response addBootCamper(BootCamper bootCamper){
        bootCamperService.add(bootCamper);
        return Response.created(
                URI.create("/bootcampers/" + bootCamper.getNombre()))
                .build();

    }

    @GET
    @Path("bootcampers/{nombre}")
    @Produces("application/json")
    public BootCamper getBootCamper(@PathParam("nombre") String nombre){
        return bootCamperService.get(nombre);
    }
}
