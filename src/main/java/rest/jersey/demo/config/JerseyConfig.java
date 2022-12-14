package rest.jersey.demo.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/")
public class JerseyConfig extends ResourceConfig {
    
    public JerseyConfig(){
        this.packages("rest.jersey.demo.controllers");
    }
}
