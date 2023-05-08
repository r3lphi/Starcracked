import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class Display implements Tickable{
    private String name;
    private int width, height;
    private JFrame frame;

    public Display(String name, int width, int height){
        this.name = name;
        this.width = width;
        this.height = height;

        Start();
    }

    @Override
    public void Start() {
        frame = new JFrame(name);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(width, height));
        frame.getContentPane().setBackground(Color.black);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void Update() {
    }

    public JFrame GetFrame(){
        return frame;
    }
    public Graphics GetGraphics(){
        return frame.getGraphics();
    }
}
