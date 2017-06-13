package API.SERVICES;



import API.DTO.Stock;

import API.DTO.StoreStock;

import java.util.List;

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Stock")
public interface StockRest {

	// CRUD for stock
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/newStock")
	public Stock addStock(Stock stock);

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/upStock")
	public Stock updateStock(Stock stock);

	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/remStock/{id}")
	public List<Stock> deleteStock(@PathParam("id") long stockId);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getStock/{id}")
	public Stock getStock(@PathParam("id") long stockId);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/stocks")
	public List<Stock> listStocks();

	

	// CRUD for storeStock

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/storeStock")
	public StoreStock updateStoreStock(StoreStock storeStock);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/storeStock")
	public List<StoreStock> getStoreStockList();

}
