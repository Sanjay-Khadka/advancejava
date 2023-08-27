import java.rmi.server.UnicastRemoteObject;

public class RemoteMethod extends UnicastRemoteObject implements RemoteInterface {

    public RemoteMethod() throws java.rmi.RemoteException {
        super();
    }

    @Override
    public Integer addNumber(int x, int y) throws java.rmi.RemoteException {
        return x + y;
    }

}