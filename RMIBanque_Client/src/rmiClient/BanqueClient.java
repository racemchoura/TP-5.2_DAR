package rmiClient;

import java.rmi.Naming;

import metier.Compte;
import rmiService.IBanque;

public class BanqueClient {
	public static void main(String[] args)
	{
		try{
            IBanque stub = (IBanque) Naming.lookup("rmi://localhost:1097/BanqueObject");
            stub.creerCompte(new Compte(1,250.0));
            stub.creerCompte(new Compte(2,800.0));
            stub.creerCompte(new Compte(3,158.0));

            System.out.println(stub.getInfoCompte(2));
            System.out.println(stub.getInfoCompte(7));


        }catch(Exception e){
            e.printStackTrace();
        }
	}
}