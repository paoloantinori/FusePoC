package com.tmg.fuse.poc;



import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("/accountservice/")
public class AccountResource {

    // NOTE: The instance member variables will not be available to the
    // Camel Exchange. They must be used as method parameters for them to
    // be made available
    @Context
    private UriInfo uriInfo;

    public AccountResource() {
    }

    @GET
    @Path("/retrieveaccount/{id}/")
    @Produces("text/xml")
    public Account retrieveAccount(@PathParam("id") String id) {
        return null;
    }

    @PUT
    @Path("/account")
    @Produces("text/xml")
    public Response createAccount(Account account) {
        return null;
    }
}
