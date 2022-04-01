package client;//package hw2.client;
import java.rmi.Naming;
import java.util.Scanner;

import common.Hotel;

import hotel.FrontController;
// the enter of the system
public class Operation {

    public static void main(String[] args) {
        try {
            // server test
            //Hotel hotel = (Hotel) Naming.lookup("//in-csci-rrpc01.cs.iupui.edu:2343/RemoteAccount");

            //local test
            Hotel hotel = (Hotel) Naming.lookup("//localhost:1099/RemoteAccount");

            hotel.prepareSystem();

        }catch (Exception e){
            System.out.println(e);
        }

        //users log in

        Scanner scan = new Scanner(System.in);
        FrontController frontController = new FrontController();
        System.out.println("Welcome to our hotel!");
        System.out.println("Who are you? 1 client; 2 manager; 3 employee; 4 exit");
        int i = scan.nextInt();
        frontController.dispatchRequest(i);
    }

}
