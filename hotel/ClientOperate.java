package hotel;
import java.util.Scanner;

// clients' operations: login and operations such as booking.
// this class extends the UserOperate.java
class ClientOperate extends UserOperate {
    public void UserOperation(){
        ClientSystem c = new ClientSystem();
        SystemInvoker ci = new SystemInvoker(c);
        Scanner scan = new Scanner(System.in);
        System.out.println("Now you can do the following operations");
        ci.call();

    }

    public void UserLogin(){
        LogInOperation log = new ClientLogInOperation();
        LogInInvoker cl = new LogInInvoker(log.userLogIn());
        System.out.println("welcome to client page");
        cl.call();



    }

}
