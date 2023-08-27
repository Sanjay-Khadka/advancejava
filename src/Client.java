import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args) throws RemoteException {
        Registry reg = LocateRegistry.getRegistry("localhost", 1099);
        try {
            Scanner scan = new Scanner(System.in);
            RemoteInterface stub = (RemoteInterface) reg.lookup("add");
            System.out.println("enter your first number");
            Integer one = scan.nextInt();
            System.out.println("enter second number");
            Integer two = scan.nextInt();
            scan.close();
            Integer value = stub.addNumber(one, two);
            System.out.println(value);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
