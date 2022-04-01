package hotel;

import hotel.LogInOperation;

// factory method, to help manage the login process
public class ManagerLogInOperation implements LogInOperation {
    public LogInOption userLogIn(){
        System.out.println("Managers log in");
        return new ManagerLogIn();
    }
}
