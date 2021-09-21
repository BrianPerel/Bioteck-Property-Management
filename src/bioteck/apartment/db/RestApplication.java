package bioteck.apartment.db;

import javax.ws.rs.core.Application;

import bioteck.apartment.api.ApartmentAPI;
import bioteck.apartment.api.ApartmentComplexAPI;
import bioteck.apartment.api.Candidate2ApartmentAPI;
import bioteck.apartment.api.CandidateAPI;
import bioteck.apartment.api.PropertyOwnerAPI;
import bioteck.apartment.api.PropertyPortfolioAPI;

import java.util.HashSet;
import java.util.Set;

public class RestApplication extends Application {
	private Set<Object> singletons = new HashSet<>();
	private Set<Class<?>> classes = new HashSet<>();

	public RestApplication() {
		classes.add(CandidateAPI.class);
		classes.add(PropertyOwnerAPI.class);
		classes.add(PropertyPortfolioAPI.class);
		classes.add(ApartmentComplexAPI.class);
		classes.add(ApartmentAPI.class);
		classes.add(Candidate2ApartmentAPI.class);
	}

	@Override
	public Set<Class<?>> getClasses() {
		return classes;
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}