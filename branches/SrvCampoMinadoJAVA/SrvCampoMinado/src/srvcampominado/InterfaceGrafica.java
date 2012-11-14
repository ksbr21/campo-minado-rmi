/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package srvcampominado;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class InterfaceGrafica extends UnicastRemoteObject implements Grafico {

    private JPanel panel;
    private JLabel msg;
    private JFrame janela;
    private JButton[][] quadrado;

    public InterfaceGrafica() throws RemoteException {
    }

    @Override
    public void montarJanela() {
        this.panel = new JPanel();
        this.msg = new JLabel("Jogo Campo Minado");
        this.janela = new JFrame();
        this.panel.add(msg);
        this.quadrado = new JButton[5][5];


        int posicaoX = 50;
        this.panel = new JPanel();
        for (int i = 0; i < 5; i++) {
            for ( int j = 0; j < 5; j++) {
                final int linha, coluna;
                linha = i;
                coluna = j;
                this.quadrado[i][j] = new JButton(" ");
                this.quadrado[i][j].setSize(50, 50);

                this.quadrado[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent evt) {
                    System.out.println("você clicou no vetor com linha"+linha+" coluna" +coluna);
                    }
                });

                this.panel.add(this.quadrado[i][j]);

                //janela.add();
            }
        }
        
        this.panel.setSize(400, 400);
        this.janela.setBounds(0, 0, 250, 300);
        this.janela.getContentPane().add(this.panel, BorderLayout.CENTER);
        this.janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        janela.pack();  
        this.janela.setVisible(true);

    }

    @Override
    public void finalJogo(Player jogador) throws RemoteException {
    }
}
