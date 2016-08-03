package dwbook.phonebook.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import dwbook.phonebook.representations.Contact;

@Path("/contact")
@Produces(MediaType.APPLICATION_JSON)
public class ContactResource {

    @GET
    @Path("/{id}")
    public Response getContact(@PathParam("id") int id) {
        // retrieve information about the contact w/ the provided id
        return Response.ok(new  Contact(id, "John", "Doe", "+123456789")).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createContact(Contact contact) {
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
            @PathParam("id") int id, Contact contact) {
        // update teh contact with the provided ID
        return Response.ok(new Contact(id, contact.getFirstName(), contact.getLastName(), contact.getPhone())).build();
    }
}
