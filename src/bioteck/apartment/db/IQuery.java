package bioteck.apartment.db;

import java.util.List;

import org.hibernate.Session;

public interface IQuery<T> {
	public List<T> process(Session s);
}