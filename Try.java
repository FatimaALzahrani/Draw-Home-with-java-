import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Fatimah Alzahrani
 */

public class Try extends JFrame{
    public Try(){
    super("Draw Home");
    setSize(500,500);
    setVisible(true);
    }
    public void paint(Graphics g)   {
        super.paint(g);
        g.translate(100, 50);
         g.setColor(Color.black);
         g.drawRect(20, 30, 300, 90);
         g.drawLine((20-10), 30, (300+30), 30);
         g.drawLine((20-10), 30, ((300/2)+20), 0);
         g.drawLine(((300/2)+20), 0, (300+30), 30);
         g.setColor(Color.black);
         g.drawRect(((300/4)+20)-(50/2), 40, 50, 30);
         g.drawRect((((300/4)*3)+20)-(50/2), 40, 50, 30);
         g.drawLine((((300/4)*3)+20)-(50/2), (40+(30/2)), ((((300/4)*3)+20)-(50/2)+50), (40+(30/2)));
         g.drawLine(((((300/4)*3)+20)-(50/2)+(30/2)), (40+30), ((((300/4)*3)+20)-(50/2)+(50/2)), 40);
         g.setColor(Color.blue);
         g.drawRect((((300/2)+20)-(40/2)), 40, 40, 70);
         g.fillOval((((((300/2)+20)-(40/2))+40)-10), (40+(70/2)), 
                    10, 10);
    }   
    public static void main(String[] args) {
        Try aTry = new Try();
    }
 
    }