/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package srvcampominado;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author antoniony.celes
 */
public interface BombaCampo extends Remote{
    
    public void conteudoCampo() throws RemoteException;
    public void gerarBombas() throws RemoteException;
}
