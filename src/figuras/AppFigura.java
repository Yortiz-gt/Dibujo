package figuras;
import java.awt.Graphics;
import java.applet.Applet;
import java.awt.Color;
public class AppFigura extends Applet {
    public void paint(Graphics g) {
        g.drawOval(25, 300, 150, 150);//ojo 1
        g.drawOval(590, 300, 150, 150);///ojo 2
        g.setColor(Color.BLACK);
        g.fillOval(65, 350, 50, 50);// niña ojo 1
        g.setColor(Color.BLACK);
        g.fillOval(645, 350, 50, 50);//niña ojo 2
        g.drawOval(10, 10, 750, 750);//cara
        g.drawOval(185, 290, 230, 230);//nariz
        g.fillOval(230, 350, 70, 70);//orificio nariz 1
        g.fillOval(330, 350, 70, 70);//orificio nariz 2
        
        
    }
}
