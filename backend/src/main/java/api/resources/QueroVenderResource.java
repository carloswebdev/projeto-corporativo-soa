package api.resources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Produto;
import model.service.ProdutoService;

@Path("queroVender")
public class QueroVenderResource {

	@Inject
	private ProdutoService produtoService;
	
	@GET
	@Path("{modelo}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Produto> pesquisa(@PathParam(value = "modelo") String modelo) {
		return produtoService.findByName(modelo);
    }
}
