/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maps;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author angel
 */
public class Pr extends javax.swing.JFrame {

    private final String path = "srs/logo.jpg";
    JButton mapa;
    JButton camino;
    BorderLayout lay;
    public final ImageIcon image() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
        ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource(path));
        Image image = img.getImage();
        Image newimg = image.getScaledInstance(xSize, ySize, Image.SCALE_SMOOTH);
        img = new ImageIcon(newimg);
        return (img);
    }

    public Pr() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        mapa = new JButton("Mapa");
        camino = new JButton("Calle");
        mapa.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Mapa M = new Mapa();
                M.setVisible(true);
            }
        });
        camino.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //unsuported
            }
        });
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(camino)
                        .addGap(100, 100, 100)
                        .addComponent(mapa)
                        .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(camino)
                                .addComponent(mapa))
                        .addContainerGap(76, Short.MAX_VALUE))
        );
    }

    public static void main(String args[]) {
        Pr p = new Pr();
        p.setVisible(true);
    }
}
