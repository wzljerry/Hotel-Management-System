package hotel;
// invoker , command patten
public class LogInInvoker {
    private LogInOption logInOption;


    public LogInInvoker(LogInOption logInOption){
        this.logInOption = logInOption;
    }

    public void call(){
        logInOption.LogIn();
    }
}
