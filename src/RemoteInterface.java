import java.rmi.Remote;

public interface RemoteInterface extends Remote {
    public Integer addNumber(int x, int y) throws java.rmi.RemoteException;
}
