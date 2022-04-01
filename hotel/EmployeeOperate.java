package hotel;

import java.util.Scanner;

// template patten, employee's operation, first log in and then do some operations
class EmployeeOperate extends UserOperate {
    public void UserLogin(){
        LogInOperation log = new EmployeeLogInOperation();

        LogInInvoker el = new LogInInvoker(log.userLogIn());
        System.out.println("welcome to the employee page");
        el.call();
    }

    public void UserOperation(){
        employeeSystem ep = new employeeSystem();
        Scanner scan = new Scanner(System.in);
        SystemInvoker ei = new SystemInvoker(ep);

        System.out.println("Now you can do the following operations");
        ei.call();
    }
}
