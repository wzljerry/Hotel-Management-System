package hotel;

import common.Account;
import java.util.Scanner;

// login method for employee
public class EmployeeLogIn implements LogInOption {
    // command patten
    private ReceiverEmployee receiverEmployee;
    EmployeeLogIn(){
        receiverEmployee = new ReceiverEmployee();
    }
    public void LogIn(){
        receiverEmployee.act();
        Account employee1=new Account(1,"Bob",1235,1235);
        Scanner scan = new Scanner(System.in);
        System.out.println("If you have an account already, you can log in directly");
        System.out.println("If you don't have an account, you should contact the employee to add an account");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Please input your account (1235)");
        int i = scan.nextInt();
        System.out.println("Please input your password (1235)");
        int j = scan.nextInt();
        if(i==employee1.getAccount()&j==employee1.getPassword()){
            System.out.println("Success");

        }else {
            System.out.println("please try again");
        }
    }
}
