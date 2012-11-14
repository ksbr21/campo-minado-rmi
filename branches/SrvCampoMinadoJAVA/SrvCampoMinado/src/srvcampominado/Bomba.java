/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package srvcampominado;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;

/**
 *
 * @author antoniony.celes
 */
public class Bomba extends UnicastRemoteObject implements BombaCampo {

   private boolean[][] bomba;

    

   

    public Bomba() throws RemoteException {
    }

    @Override
    public void conteudoCampo() throws RemoteException {

        this.bomba = new boolean[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                this.bomba[j][i] = false;
            }
        }

        
    }

    @Override
    public void gerarBombas(int i) throws RemoteException {
        Random sorte = new Random();
        int coluna, linha;

        coluna = sorte.nextInt(5);
        linha = sorte.nextInt(5);
        
        if (this.bomba[linha][coluna] != true && i<5) {
            this.bomba[linha][coluna] = true;
            i++;
            gerarBombas(i);
        }
        
    }
    public boolean[][] getBomba() throws RemoteException{
        return bomba;
    }
}
