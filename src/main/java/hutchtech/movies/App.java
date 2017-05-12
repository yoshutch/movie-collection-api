package hutchtech.movies;

import hutchtech.movies.api.UserApi;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import static spark.Spark.*;

/**
 * Created by Scott Hutchings on 5/12/2017.
 * movie-collection-api
 */
public class App {
	private static final Logger LOG = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		final int assignedPort = getAssignedPort();
		LOG.debug("using port: " + assignedPort);
		port(assignedPort);
		setupRoutes();
		LOG.debug("routes set");
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

	private static int getAssignedPort() {
		ProcessBuilder processBuilder = new ProcessBuilder();
		if (processBuilder.environment().get("PORT") != null) {
			return Integer.parseInt(processBuilder.environment().get("PORT"));
		}
		return 4567;
	}
}
