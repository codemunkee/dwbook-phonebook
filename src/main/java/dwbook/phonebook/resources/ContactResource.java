package dwbook.phonebook.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/contact")
@Produces(MediaType.APPLICATION_JSON)
public class ContactResource {

    @GET
    @Path("/{id}")
    public Response getContact(@PathParam("id") int id) {
        // retrieve information about the contact w/ the provided id
        return Response.ok("{ \"contact_id\": " + id + ", \"name\": \"Dummy Name\"," +
                           " \"phone\": \"+012346789\" }").build();
    }

    @POST
    public Response createContact(
        @FormParam("name") String name, @FormParam("phone") String phone) {
        return Response.created(null).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteContact(@PathParam("id") int id) {
        // delete contact with the provided id
        return Response.noContent().build();
    }

    @PUT
    @Path("/{id}")
    public Response updateContact(
            @PathParam("id") int id,
            @FormParam("name") String name,
            @FormParam("phone") String phone) {
        // update teh contact with the provided ID
        return Response.ok("{contact_id: " + id + ", name: \"" + name +
                           "\", phone: \"" + phone + "\" }").build();
    }
}
