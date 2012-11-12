/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package srvcampominado;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Administrator
 */
public interface CampoMinado extends Remote{
    public void criarCampo() throws RemoteException;
    public void finalizarGame(int Pontos) throws RemoteException;
    
    
}
