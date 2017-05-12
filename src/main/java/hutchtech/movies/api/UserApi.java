package hutchtech.movies.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import spark.Request;
import spark.Response;
import spark.Route;

/**
 * Created by Scott Hutchings on 5/12/2017.
 * movie-collection-api
 */
public class UserApi {
	private static final Logger LOG = LogManager.getLogger(UserApi.class);

	public static Route getUser = (Request request, Response response) -> {
		LOG.trace("getUser");
		return "get user";
	};

	public static Route addUser = (Request request, Response response) -> {
		LOG.trace("addUser");
		return "added user";
	};

	public static Route updateUser = (Request request, Response response) -> {
		LOG.trace("updateUser");
		return "update user";
	};

	public static Route deleteUser = (Request request, Response response) -> {
		LOG.trace("deleteUser");
		return "delete user";
	};

	public static Route getAllUsers = (Request request, Response response) -> {
		LOG.trace("getAllUsers");
		return "get all users";
	};
}
