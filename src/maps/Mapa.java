/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maps;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author hpclab
 */
public class Mapa extends javax.swing.JFrame {

    private final String path = "srs/sede_centro.jpg";
    JButton b1;

    public Mapa() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(xSize, ySize);
        setLayout(new BorderLayout());
        ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource(path));
        Image image = img.getImage();
        Image newimg = image.getScaledInstance(1366, 690, Image.SCALE_SMOOTH);
        img = new ImageIcon(newimg);
        final JLabel background = new JLabel(img);
        add(background);
        background.setLayout(new FlowLayout());
        b1 = new JButton("atras");
        background.add(b1);
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                P p = new P();
                p.setVisible(true);
                dispose();
            }
        });
    }

    public static void main(String args[]) {
        Mapa M = new Mapa();
        M.setVisible(true);
    }
}
