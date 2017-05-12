package hutchtech.movies.domain;

/**
 * Created by Scott Hutchings on 5/12/2017.
 * movie-collection-api
 */
public class User {
	private int id;
	private String username;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
