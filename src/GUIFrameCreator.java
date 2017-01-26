import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class GUIFrameCreator {

    public static void main (String [] args){
        CreateTheGUI();
    }
    private static void CreateTheGUI() {
        GUIpainter Gp = new GUIpainter();
        JFrame f = new JFrame("MovementDemo");
        f.add(Gp);
        f.setVisible(true);
        f.setSize(800,800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
