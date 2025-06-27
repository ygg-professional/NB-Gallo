package Gallo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import javax.swing.JPanel;

public class Panel extends JPanel {
   public void paint(Graphics g) {
      Graphics2D g2 = (Graphics2D)g;
      int[] puntosX1 = new int[]{200, 240, 260, 220, 180};
      int[] puntosY1 = new int[]{170, 170, 215, 250, 215};
      Polygon poly1 = new Polygon(puntosX1, puntosY1, 5);
      g.setColor(new Color(152, 242, 66));
      g.fillPolygon(poly1);
      int[] puntosX2 = new int[]{240, 240, 200};
      int[] puntosY2 = new int[]{105, 168, 168};
      Polygon poly2 = new Polygon(puntosX2, puntosY2, 3);
      g.setColor(new Color(156, 119, 207));
      g.fillPolygon(poly2);
      int[] puntosX3 = new int[]{262, 262, 242, 242};
      int[] puntosY3 = new int[]{105, 125, 125, 105};
      Polygon poly3 = new Polygon(puntosX3, puntosY3, 4);
      g.setColor(new Color(59, 168, 241));
      g.fillPolygon(poly3);
      int[] puntosX4 = new int[]{235, 262, 227};
      int[] puntosY4 = new int[]{75, 103, 103};
      Polygon poly4 = new Polygon(puntosX4, puntosY4, 3);
      g.setColor(new Color(227, 73, 122));
      g.fillPolygon(poly4);
      int[] puntosX5 = new int[]{264, 277, 264};
      int[] puntosY5 = new int[]{110, 125, 125};
      Polygon poly5 = new Polygon(puntosX5, puntosY5, 3);
      g.setColor(new Color(244, 156, 45));
      g.fillPolygon(poly5);
      int[] puntosX6 = new int[]{252, 262, 242};
      int[] puntosY6 = new int[]{127, 148, 148};
      Polygon poly6 = new Polygon(puntosX6, puntosY6, 3);
      g.setColor(new Color(227, 73, 122));
      g.fillPolygon(poly6);
      int[] puntosX7 = new int[]{198, 178, 139};
      int[] puntosY7 = new int[]{170, 215, 170};
      Polygon poly7 = new Polygon(puntosX7, puntosY7, 3);
      g.setColor(new Color(244, 157, 49));
      g.fillPolygon(poly7);
      int[] puntosX8 = new int[]{168, 198, 138, 108};
      int[] puntosY8 = new int[]{125, 168, 168, 125};
      Polygon poly8 = new Polygon(puntosX8, puntosY8, 4);
      g.setColor(new Color(59, 167, 241));
      g.fillPolygon(poly8);
      int[] puntosX9 = new int[]{106, 136, 102};
      int[] puntosY9 = new int[]{125, 168, 230};
      Polygon poly9 = new Polygon(puntosX9, puntosY9, 3);
      g.setColor(new Color(152, 242, 66));
      g.fillPolygon(poly9);
      int[] puntosX10 = new int[]{222, 222, 218, 218};
      int[] puntosY10 = new int[]{252, 300, 300, 252};
      Polygon poly10 = new Polygon(puntosX10, puntosY10, 4);
      g.setColor(new Color(244, 156, 48));
      g.fillPolygon(poly10);
      Ellipse2D pie = new Double(190.0D, 301.0D, 60.0D, 14.0D);
      g2.setColor(new Color(227, 73, 122));
      g2.fill(pie);
   }
}
