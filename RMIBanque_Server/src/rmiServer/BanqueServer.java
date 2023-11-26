package rmiServer;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import rmiService.BanqueImpl;

public class BanqueServer 
{
	public static void main(String[] args) 
	{
		try 
		{
            LocateRegistry.createRegistry(1097); //anniaire
            BanqueImpl BI = new BanqueImpl(); // Skeleton
            System.out.println(BI.toString());
            Naming.rebind("rmi://localhost:1097/BanqueObject",BI);
        }
		catch (Exception e)
		{
            e.printStackTrace();
        }
	}
}
