package br.com.yuricampolongo.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;	
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.com.redis.client.redisquerysimplifier.RedisQuery;
import br.com.yuricampolongo.entities.Filme;

@Path("/loc")
@Produces("application/json")
@Consumes("application/json")
public class LocadoraServices {

	@POST
	@Path("/save")
	public Response saveItem(Filme filme) {
		RedisQuery.save(filme, 1l);
		return Response.ok().build();
	}
	
	@POST
	@Path("/update")
	public Response updateItem(Filme filme) {
		RedisQuery.save(filme, 1l);
		return Response.ok().build();
	}
	
	@DELETE
	@Path("/delete/{idFilme}")
	public Response deleteItem(@PathParam(value="idFilme") Long idFilme, Filme filme) {
		RedisQuery.remove(filme, idFilme);
		return Response.ok().build();
	}

}
