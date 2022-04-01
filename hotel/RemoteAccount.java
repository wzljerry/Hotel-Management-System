package hotel;

import java.rmi.Naming;
import java.rmi.RemoteException;

import common.HotelImpl;


// remote account for RMI
public class RemoteAccount {
    public static void main(String args[]) {
        try{
            //server test
            //Naming.bind("//in-csci-rrpc01.cs.iupui.edu:2343/RemoteAccount", new HotelImpl());
            //local test
            Naming.bind("//localhost:1099/RemoteAccount", new HotelImpl());
            System.out.println("server is ready");
        }catch (Exception e) {
            System.out.println("Exception:"+e);
        }
    }
}
