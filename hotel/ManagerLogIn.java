package hotel;

import common.Account;

import java.util.Scanner;


// manager can log in via this method
public class ManagerLogIn implements LogInOption{
    private ReceiverManager receiverManager;
    ManagerLogIn(){
        receiverManager = new ReceiverManager();
    }

    public void LogIn(){
        receiverManager.act();
        Account manager1 = new Account(1,"Tom",1236,1236);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your account (1236)");
        int i = scan.nextInt();
        System.out.println("Please input your password (1236)");
        int j = scan.nextInt();

        if(i==manager1.getAccount()&j==manager1.getPassword()){
        System.out.println("Success");
        }else{
        System.out.println("please try again");
        }


    }
}