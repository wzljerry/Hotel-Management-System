package common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hotel extends Remote {
    public void prepareSystem() throws RemoteException;

}
