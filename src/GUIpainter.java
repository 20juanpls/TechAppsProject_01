import com.sun.tools.example.debug.gui.GUI;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import javax.swing.*;


public class GUIpainter extends JPanel implements ActionListener, KeyListener{

        Timer t = new Timer(5,this);
        double x = 0, y =0, velX =0, velY = 0;

        public GUIpainter(){
            t.start();
            addKeyListener(this);
            setFocusable(true);
            setFocusTraversalKeysEnabled(false);

        }

        public void paintComponent (Graphics g){
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.fill(new Ellipse2D.Double(x,y,40,40));
            t.start();

            //System.out.println("VelX: " + velX);
            //System.out.println("VelY: " + velY);
        }

        public void actionPerformed (ActionEvent e){
            x += velX;
            y += velY;

            repaint();
        }
        /*
        public void up(){
            velY = -1.5;
            velX = 0;
        }
        public void down(){
            velY = 1.5;
            velX =0;
        }
        public void left(){
            velY = 0.0f;
            velX = -1.5;
        }
        public void right(){
            velY = 0.0f;
            velX = 1.5;
        }
        */
        public void stopNow(){
            velY = 0.0f;
            velX = 0.0f;
        }


    public void keyPressed(KeyEvent e){
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_UP || code == KeyEvent.VK_W){
            //up();
            velY = -1.5;
        }
        if (code == KeyEvent.VK_DOWN || code == KeyEvent.VK_S){
            //down();
            velY = 1.5;
        }
        if (code == KeyEvent.VK_RIGHT || code == KeyEvent.VK_D){
            //right();
            velX = 1.5;
        }
        if (code == KeyEvent.VK_LEFT || code == KeyEvent.VK_A){
            //left();
            velX = -1.5;
        }
    }
    public void keyTyped(KeyEvent e){}
    public void keyReleased(KeyEvent e){
        stopNow();
    }
}

