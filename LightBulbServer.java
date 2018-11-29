import java.rmi.*;
import java.rmi.server.*;
public class LightBulbServer {
	public static void main(String args[]) {
		try {
			RMILightBulbImpl bulbService = new RMILightBulbImpl();
			RemoteRef location = bulbService.getRef();
			System.out.println(location.remoteToString());
			String registry = "localhost";
			if(args.length >= 1) {
				registry = args[0];
			}
			String registration = "rmi://" + registry + "/RMILightBulb";
			Naming.rebind(registration, bulbService);
		} catch(Exception e) { System.err.println("Error - " + e); }
	}
}