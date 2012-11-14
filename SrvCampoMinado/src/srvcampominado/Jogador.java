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
public class Jogador extends UnicastRemoteObject implements Player{
    private String nome;
    private Boolean estado;
    private int pontuacao;

    public Jogador() throws RemoteException{
    }

    
    
    
}
