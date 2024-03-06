import java.util.ArrayList;
import java.util.Objects;

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;


    public AuthenticationService(ArrayList<User> users) {
        this.users = users;
    }

    @Override
    public User signUp(String username, String password) {
        // TODO Now: Implement the signUp method to add a new user to the list if the username is not taken and return the user;
        //  returns null otherwise
       for (User user : users) {
           if (Objects.equals(user.getUsername(), username)) return null;
       }
       User user = new User(username, password);
       users.add(user);
       return user;
    }

    @Override
    public User logIn(String username, String password) {
        // TODO Now: Implement the logIn method to return the user if the username and password match, and null otherwise

        for (User login : users) {
            if (Objects.equals(login.getPassword(), password) && Objects.equals(login.getUsername(), username)) {
                return login;
            }
        }
        return null;
    }
}
