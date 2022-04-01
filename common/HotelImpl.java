package common;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HotelImpl extends UnicastRemoteObject implements Hotel {
    public HotelImpl() throws RemoteException {
    }

    public void prepareSystem(){
        System.out.println("System is ready");
    }
}
