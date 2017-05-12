package hutchtech.movies.api;

import spark.Request;
import spark.Response;
import spark.Route;

/**
 * Created by Scott Hutchings on 5/12/2017.
 * movie-collection-api
 */
public class UserApi {

	public static Route getUser = (Request request, Response response) -> {
		return "get user";
	};

	public static Route addUser = (Request request, Response response) -> {
		return "added user";
	};

	public static Route updateUser = (Request request, Response response) -> {
		return "update user";
	};

	public static Route deleteUser = (Request request, Response response) -> {
		return "delete user";
	};

	public static Route getAllUsers = (Request request, Response response) -> {
		return "get all users";
	};
}
