import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;

public class CalculatorClient {

	public static void main(String[] args) {
		try {
			Calculator c = (Calculator) Naming.lookup("rmi://localhost/CalculatorService");
			System.out.println( c.sub(8, 2) );
			System.out.println( c.add(4, 5) );
			System.out.println( c.mul(6, 7) );
			System.out.println( c.div(8, 2) );
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}