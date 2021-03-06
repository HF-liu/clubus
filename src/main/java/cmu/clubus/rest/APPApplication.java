package cmu.clubus.rest;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//@ApplicationPath("/")

@Path("")

public class APPApplication extends ResourceConfig {
    public APPApplication() {
        // Define the package which contains the service classes.
        packages("edu.cmu.sv.app17.rest");
    }

    @GET
    @Produces({ MediaType.APPLICATION_JSON})
    public Object getAll() {
        Version ver = new Version("1.0.0", "2017-10-10");
        return ver;
    }

    public class Version {
        String version, date;
        public Version(String version,String date) {
            this.version = version;
            this.date = date;
        }

    }


}