package com.shzsoft.resource;


import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.shzsoft.model.Element;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Path("/resource")
// @Consumes({"application/json"})
// @Produces({"application/json"})
public class RootResource {

    // @GET
    // @Path("/list")
    // public List<Element> resGet(
    //         @QueryParam("conditions") Map conditions) {
    //     return new ArrayList(){
    //     	{
    //     		add(1);
    //     		add(2);
    //     	}
    //     };
    // }

    // @GET
    // @Path("/{elmID}")
    // public Element wizardGet(
    //         @QueryParam("elmID") String elmID) {
    //     return new Element();
    // }

    // @POST
    // @Path("/creation")
    // public Response wizardPost(Element body) {
    //     return Response.ok().entity(body).build();
    // }

    // @PUT
    // @Path("/{wizardID}")
    // public Response wizardPut(Element body) {
    //     return Response.ok().entity(body).build();

    // }

    // @DELETE
    // @Path("/{wizardID}")
    // public Response wizardWizardIDDelete(@PathParam("wizardID") Long wizardID) {
    //     return Response.ok().entity("").build();
    // }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
}