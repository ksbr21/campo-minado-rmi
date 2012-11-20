/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package srvcampominado;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Elton 2
 */
public interface IJogador extends Remote{
    public void contarPontos() throws RemoteException;
    public int totalPontos() throws RemoteException;
    
}
