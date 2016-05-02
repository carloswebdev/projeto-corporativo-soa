package api.resources;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Produto;

@Path("queroVender")
public class QueroVenderResource {

	@GET
	@Path("{modelo}")
    @Produces({MediaType.APPLICATION_JSON})
    public String pesquisa(@PathParam(value = "modelo") String modelo) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("queroVenderPU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println(entityManager.find(Produto.class, 1L));
        return "{\"resposta\": \"Você está querendo vender um: " + modelo + "\"}";
    }
}
