package work.vietdefi.clean.http.user;


// Import necessary classes for handling HTTP requests and responses
import com.google.gson.JsonObject;
import io.vertx.ext.web.RoutingContext;
import work.vietdefi.clean.services.SharedServices;
import work.vietdefi.clean.services.user.SimpleResponse;
import work.vietdefi.util.json.GsonUtil;
import work.vietdefi.util.log.DebugLogger;


/**
 * The UserHandler class is responsible for handling HTTP requests related
 * to user operations, such as authorization, registration, login, and
 * fetching user data. It provides methods to process requests and send
 * appropriate responses back to the client.
 *
 * <p>This class interacts with shared services to perform user-related
 * actions and communicates the results back to the client through HTTP
 * responses.</p>
 *
 * <p>The class provides the following functionalities:</p>
 * <ul>
 *   <li>Authorization of users based on provided tokens.</li>
 *   <li>Registration of new users (method currently not implemented).</li>
 *   <li>Login of existing users (method currently not implemented).</li>
 *   <li>Fetching user data (method currently not implemented).</li>
 * </ul>
 */
public class UserHandler {


    /**
     * Handles user authorization requests.
     *
     * <p>This method retrieves a token from the request header and calls
     * the authorization service to validate the user. If successful, it
     * adds user-related information to the response headers and passes
     * control to the next handler in the chain. If the authorization fails,
     * it responds with an unauthorized error.</p>
     *
     * @param routingContext the context of the current HTTP request,
     *        which contains request and response objects.
     */
    public static void authorize(RoutingContext routingContext) {
        try {
            // Retrieve the token from the request header
            String token = routingContext.request().getHeader("token");


            // Call the authorization service to validate the token
            JsonObject response = SharedServices.userService.authorization(token);


            // Check if the authorization was successful
            if (SimpleResponse.isSuccess(response)) {
                // Retrieve user information from the response
                JsonObject user = response.getAsJsonObject("d");
                String user_id = user.get("user_id").getAsString();
                String username = user.get("username").getAsString();


                // Add user information to the request headers for later use
                routingContext.request().headers().add("user_id", user_id);
                routingContext.request().headers().add("username", username);




                // Pass control to the next handler
                routingContext.next();
            } else {
                // Unauthorized request - respond with error code
                routingContext.response().end(SimpleResponse.createResponse(2).toString());
            }
        } catch (Exception e) {
            // Log the error and respond with a failure message
            DebugLogger.logger.error("", e);
            routingContext.response().end(SimpleResponse.createResponse(1).toString());
        }
    }


    /**
     * Handles user registration requests.
     *
     * <p>This method is currently not implemented but is intended to process
     * user registration data and communicate the result back to the client.</p>
     *
     * @param routingContext the context of the current HTTP request.
     */
    public static void register(RoutingContext routingContext) {
        try {
            // Registration logic will be implemented here


        } catch (Exception e) {
            // Log the error and respond with a failure message
            DebugLogger.logger.error("", e);
            routingContext.response().end(SimpleResponse.createResponse(1).toString());
        }
    }


    /**
     * Handles user login requests.
     *
     * <p>This method is currently not implemented but is intended to process
     * user login data and respond to the client accordingly.</p>
     *
     * @param routingContext the context of the current HTTP request.
     */
    public static void login(RoutingContext routingContext) {
        try {
            // Extract the request body as a string.
            String body = routingContext.body().asString();

            // Convert the request body to a JsonObject.
            JsonObject data = GsonUtil.gsonConverter.toJsonElement(body).getAsJsonObject();

            // Extract the username and password from the JSON object.
            String username = data.get("username").getAsString();
            String password = data.get("password").getAsString();

            // Attempt to log in the user using the shared UserService.
            JsonObject response = SharedServices.userService.login(username, password);

            // Send the login response back to the client.
            routingContext.response().end(response.toString());
        } catch (Exception e) {
            // Log the error and respond with a generic failure message (e = 1).
            DebugLogger.logger.error("", e);
            routingContext.response().end(SimpleResponse.createResponse(1).toString());
        }
    }


    /**
     * Handles requests to fetch user data.
     *
     * <p>This method is currently not implemented but is intended to retrieve
     * user information and respond to the client with the data.</p>
     *
     * @param routingContext the context of the current HTTP request.
     */
    public static void get(RoutingContext routingContext) {
        try {
            // Extract the user_id from the request header.
            // After successful authorization, the token is valid,
            // and user_id/username are added to headers for further use.
            long user_id = Long.parseLong(routingContext.request().getHeader("user_id"));

            // Fetch the user's data using the shared UserService.
            JsonObject response = SharedServices.userService.get(user_id);

            // Send the fetched user data back to the client.
            routingContext.response().end(response.toString());
        } catch (Exception e) {
            // Log the exception for debugging purposes.
            DebugLogger.logger.error("", e);

            // Respond with a generic failure message (e = 1) in case of an error.
            routingContext.response().end(SimpleResponse.createResponse(1).toString());
        }
    }
}
