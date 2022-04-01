package hotel;


// factory patten, create object
public class EmployeeLogInOperation implements LogInOperation {
    public LogInOption userLogIn(){
        System.out.println("Employees log in");
        return new EmployeeLogIn();
    }
}
