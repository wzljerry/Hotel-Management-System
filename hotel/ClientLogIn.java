package hotel;

import common.Account;

import java.util.Scanner;

// provide login methods for clients
public class ClientLogIn implements LogInOption {
    private Receiverclient receiverclient;
    ClientLogIn(){
        receiverclient = new Receiverclient(); // return an abject
    }
    // login methods
    public void LogIn(){
        receiverclient.act();
        Account client1 = new Account(1,"Jerry",1234,1234);
        Scanner scan = new Scanner(System.in);
        System.out.println("If you have an account already, you can log in directly");
        System.out.println("If you don't have an account, you should contact the employee to add an account");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Please input your account (1234)");
        int i = scan.nextInt();
        System.out.println("Please input your password (1234)");
        int j = scan.nextInt();
        if (i==client1.getAccount()&j==client1.getPassword()){
            System.out.println("Success");
        }else{
            System.out.println("please try again");
        }

    }
}
