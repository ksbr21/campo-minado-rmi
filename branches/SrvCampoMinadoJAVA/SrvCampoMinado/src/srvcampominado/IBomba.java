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
public interface IBomba extends Remote{
    
    public void conteudoCampo() throws RemoteException;
    public void gerarBombas(int i) throws RemoteException;
    public boolean verificarCampo(int linha, int coluna) throws RemoteException;
}
