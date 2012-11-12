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
public class Campo extends UnicastRemoteObject implements CampoMinado{
    private String[][] campo;
    private int ponto;

    public Campo() throws RemoteException{
    }

    
    @Override
    public void criarCampo() throws RemoteException {
         this.campo = new String[5][5];
     
        for(int i=0;i<5;i++){
           
            for(int j=0; j<5;j++){
               this.campo[i][j] = " * ";
               System.out.print(this.campo[i][j]);
            }
            System.out.println();
        }
        
    }

    @Override
    public void finalizarGame(int Pontos) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    
}
