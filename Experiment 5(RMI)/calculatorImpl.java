
package RMI;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class calculatorImpl extends UnicastRemoteObject implements calculator {

    public calculatorImpl() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) throws RemoteException {
        return a - b;
    }
}
