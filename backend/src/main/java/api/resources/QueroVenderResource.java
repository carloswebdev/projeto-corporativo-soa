package api.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("queroVender")
public class QueroVenderResource {

	@GET
	@Path("{modelo}")
    @Produces({MediaType.APPLICATION_JSON})
    public String pesquisa(@PathParam(value = "modelo") String modelo) {
        return "{\"resposta\": \"Você está querendo vender um: " + modelo + "\"}";
    }
}
