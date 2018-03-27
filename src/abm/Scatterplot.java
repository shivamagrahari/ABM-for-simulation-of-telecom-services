/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abm;

/**
 *
 * @author shivam
 */
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Scatterplot extends javax.swing.JFrame {

    private List points = new ArrayList();
    static int i=100;
    int xpre=-1,ypre=-1,xcur=100,ycur = 200;
    public void S(int flag) {
        //super("Scatterplot");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // int i;
       // i = 100;
       // int j = 100;
        //i=i+100;
 //while(i<3000){
    xpre = i-15;
    xcur = i;
     if(flag==1)
     {
         ycur = 600;
         points.add(new Point2D.Float(i, 600));
         
     }
     else if(flag==2)
     {
         ycur = 400;
         points.add(new Point2D.Float(i, 400));
                 

     }
     else if(flag==3)
     {
         ycur = 200;
         points.add(new Point2D.Float(i, 200));
         
     }
    AnalysisGraph aa = new AnalysisGraph();
    
     if(flag==1)
     {
         ypre = 600; 
     }
     else if(flag ==2)
     {
      ypre = 400;    
     }
     else
     {
         ypre = 200; 
     }
     
     

        //points.add(new Point2D.Float(i, j));
        //points.add(new Point2D.Float(i, j));
        //points.add(new Point2D.Float(3, 10));
        // points.add(new Point2D.Float(4, 12));
    //i=i+10;
    i=i+15;
   // }
        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                //g.translate(0, 0);
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g.create();
//                g.setColor(Color.RED);
//                g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
                g.setColor(Color.BLACK);
                for (Iterator i = points.iterator(); i.hasNext();) {
                    Point2D.Float pt = (Point2D.Float) i.next();
                    Ellipse2D dot = new Ellipse2D.Float(pt.x - 1, pt.y - 1, 5, 5);
                    g2d.fill(dot);
                }
                g2d.dispose();
            }
        };

        setContentPane(panel);
        setBounds(10, 10, 200, 200);

        setVisible(true);
    }

    public static void main(String[] args) {
        
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                new Scatterplot();
            }
        });
    }
}


