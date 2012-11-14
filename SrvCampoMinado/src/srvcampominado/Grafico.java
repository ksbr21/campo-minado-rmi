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
public interface Grafico extends Remote{
    public void montarJanela() throws RemoteException;
    public void finalJogo(Player jogador)throws RemoteException;
    
}
