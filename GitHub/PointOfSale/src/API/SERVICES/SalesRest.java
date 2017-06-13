package API.SERVICES;

import java.util.List;
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


import API.DTO.Sales;
import API.DTO.SalesDetails;

@Path("/sales")
public interface SalesRest {
	// CRUD for Sales
		@POST
		@Produces(MediaType.APPLICATION_JSON)
		@Path("/newSales")
		public Sales addSales(Sales sales);

		@PUT
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		@Path("/upSales")
		public Sales updateSales(Sales sales);

		@DELETE
		@Produces(MediaType.APPLICATION_JSON)
		@Path("/remSales/{id}")
		public List<Sales> removeSales(@PathParam("id") long salesId);

		@GET
		@Produces(MediaType.APPLICATION_JSON)
		@Path("/getSales/{id}")
		public Sales getSales(@PathParam("id") long salesId);

		@GET
		@Produces(MediaType.APPLICATION_JSON)
		@Path("/sales")
		public List<Sales> listSales();
		
		//CRUD for SalesDetails
		@POST
		@Produces(MediaType.APPLICATION_JSON)
		@Path("/newSalesDetails")
		public SalesDetails addSalesDetails(Sales sales);
		

		@PUT
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		@Path("/upSalesDetails")
		public SalesDetails updateSalesDetails(Sales sales);
		

}
