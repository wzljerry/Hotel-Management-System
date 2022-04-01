package hotel;

import hotel.ClientLogIn;
import hotel.LogInOperation;
import hotel.LogInOption;

// return a abject for login
public class ClientLogInOperation implements LogInOperation {
    public LogInOption userLogIn(){
        System.out.println("Clients log in");
        return new ClientLogIn();
    }
}