package hutchtech.movies;

import hutchtech.movies.api.UserApi;

import static spark.Spark.*;

/**
 * Created by Scott Hutchings on 5/12/2017.
 * movie-collection-api
 */
public class App {

	public static void main(String[] args) {
		setupRoutes();
	}

	private static void setupRoutes(){

		path("/rest/v1", () -> {
			get("/status", (request, response) -> "OK");

			get("/users", 			UserApi.getAllUsers);
			path ("/user", () -> {
				post("", 			UserApi.addUser);
				get("/:userId", 	UserApi.getUser);
				put("/:userId", 	UserApi.updateUser);
				delete("/:userId", 	UserApi.deleteUser);
			});
		});

	}
}
