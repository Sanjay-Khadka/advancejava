import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) throws RemoteException {
        RemoteMethod rm = new RemoteMethod();
        Registry reg = LocateRegistry.createRegistry(1099);
        try {

            reg.bind("add", rm);
        } catch (AlreadyBoundException ae) {
            System.out.println(ae);
        }
    }
}