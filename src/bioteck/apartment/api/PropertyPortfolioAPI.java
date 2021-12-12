package bioteck.apartment.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import bioteck.apartment.db.DB;
import bioteck.apartment.db.Utility;
import bioteck.apartment.model.PropertyPortfolio;

@Path("/property-portfolios")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PropertyPortfolioAPI {

	@GET
	public List<PropertyPortfolio> POList() {
		return DB.query(s -> s.createQuery("from PropertyPortfolio").setMaxResults(50).getResultList());
	}

	@GET
	@Path("/query")
	public List<PropertyPortfolio> query(@QueryParam("searchany") String str) {
		if (str == null)
			return new ArrayList<PropertyPortfolio>();
		String tstr = str.trim();
		return DB.query(s -> s.createQuery("select pp from PropertyPortfolio pp "
				+ "where pp.name like :str or pp.owner.name like :str or pp.owner.taxID like :str or pp.owner.address like :str",
				PropertyPortfolio.class).setParameter("str", "%" + tstr + "%").setMaxResults(50).getResultList());
	}

	@GET
	@Path("/{id}")
	public PropertyPortfolio get(@PathParam("id") String id) {
		String tid = id.trim();

		if (Utility.isNum(tid)) {
			return (PropertyPortfolio) DB.query(s -> Arrays.asList(s.get(PropertyPortfolio.class, Long.valueOf(tid))))
					.get(0);
		} else {
			return null;
		}
	}

	@POST
	public void save(PropertyPortfolio pp) {
		System.out.println("*********************" + pp);
		DB.transact(s -> s.save(pp));
	}

	@PUT
	public void update(PropertyPortfolio pp) {
		if (pp != null && pp.getId() != null) {
			DB.transact(s -> s.update(pp));
		}
	}

	@DELETE
	@Path("/{id}")
	public void remove(@PathParam("id") Long id) {
		DB.transact(s -> s.delete(id));
	}
}
