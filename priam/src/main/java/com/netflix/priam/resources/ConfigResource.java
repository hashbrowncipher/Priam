package com.netflix.priam.resources;

import com.google.inject.Inject;
import com.netflix.priam.configSource.IConfigSource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/v1/config")
@Produces(MediaType.TEXT_PLAIN)
public class ConfigResource {
    private final IConfigSource config;

    @Inject
    public ConfigResource(IConfigSource config) {
        this.config = config;
    }

    @GET
    @Path("{key}")
    public Response getConfig(
        @PathParam("key") String key
    ) {
        String value = config.get(key);

        if(value == null) {
            return Response.status(404).build();
        }

        return Response.ok(value.trim() + "\n").build();
    }
}
