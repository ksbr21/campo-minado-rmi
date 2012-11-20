/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package srvcampominado;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Elton 2
 */
public class Jogador extends UnicastRemoteObject implements IJogador{
    private String nome;
    private Boolean estado;
    private int pontuacao;

    public Jogador() throws RemoteException{
    }

    
    
    @Override
    public void contarPontos() throws RemoteException {
       
        this.pontuacao+=10;
    }

    @Override
    public int totalPontos() throws RemoteException {
        return this.pontuacao;
    }

   
    
    
}
