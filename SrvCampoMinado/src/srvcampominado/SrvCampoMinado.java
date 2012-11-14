/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package srvcampominado;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;


  
  
public class SrvCampoMinado 
{  
  public static void main(String args[])  
    throws RemoteException,MalformedURLException{  
       LocateRegistry.createRegistry(1099);
        Campo campo = new Campo();
        Naming.rebind("Jogo", campo);
        Bomba nova = new Bomba();
        int numero = 0;
        nova.conteudoCampo();
       nova.gerarBombas(numero);
       System.out.println("Service ONLINE");
        
       InterfaceGrafica janela = new InterfaceGrafica();
       janela.montarJanela();
  
  }  
}   
/**
 *
 * @author Administrator
 */

