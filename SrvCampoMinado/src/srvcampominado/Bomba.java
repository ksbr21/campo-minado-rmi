/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package srvcampominado;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author antoniony.celes
 */
public class Bomba extends UnicastRemoteObject implements BombaCampo{

    private int[][] bomba;
    
    public Bomba() throws RemoteException{
        
    }
    @Override
    public void conteudoCampo() throws RemoteException {
        this.bomba = new int[5][5];
        
        
        
    }
    
}
