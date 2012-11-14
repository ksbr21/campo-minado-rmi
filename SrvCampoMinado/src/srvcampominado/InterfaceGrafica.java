/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package srvcampominado;

import java.awt.BorderLayout;
import java.awt.Component;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Elton 2
 */
public class InterfaceGrafica extends UnicastRemoteObject implements Grafico{

    private JPanel panel;
    private JLabel msg;
    private JFrame janela;

    public InterfaceGrafica() throws RemoteException{
    }

    @Override
    public void montarJanela() {
        panel = new JPanel();
        msg = new JLabel("Jogo Campo Minado");
        janela = new JFrame();
        panel.add(msg);
        JButton[][] quadrado = new JButton[5][5];
       
        int posicaoX = 50;
        panel = new JPanel();
         for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
           quadrado[i][j] = new JButton(" ");     
           quadrado[i][j].setSize(50, 50);
          quadrado[i][j].setBounds(j, posicaoX+posicaoX, 50, 50);
          panel.add(quadrado[i][j]); 
          //janela.add();
            }
        }
         
        panel.setSize(500, 500);
        janela.setBounds(0, 0, 500, 500);
        janela.getContentPane().add(panel, BorderLayout.CENTER);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
//        janela.pack();  
        janela.setVisible(true);

    }

    @Override
    public void finalJogo(Player jogador) throws RemoteException{
    }
}
