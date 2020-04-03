package pkg2dsnake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.LinkedList;
import static javax.swing.Spring.height;
import static javax.swing.Spring.width;
public class level2 {
    public static LinkedList<Point>list;
    
    public level2(){
        init();
    }
    public void init(){
        list = new LinkedList<Point>();
        }
    public void DrawWall(Graphics g){
        g.setColor(Color.RED);
        for(Point w:list)
        g.fillRect(w.x*Gameplay.BOX_WIDTH, w.y*Gameplay.BOX_HEIGHT, Gameplay.BOX_WIDTH, Gameplay.BOX_HEIGHT);
    }
    public void level2(){
        list.add(new Point(11,4));
        list.add(new Point(12,4));
        list.add(new Point(13,4));
        list.add(new Point(14,4));
        list.add(new Point(15,4));
        list.add(new Point(16,4));
        list.add(new Point(17,4));
        list.add(new Point(18,4));
        list.add(new Point(19,4));
       
        //wall2
        list.add(new Point(11,10));
        list.add(new Point(12,10));
        list.add(new Point(13,10));
        list.add(new Point(14,10));
        list.add(new Point(15,10));
        list.add(new Point(16,10));
        list.add(new Point(17,10));
        list.add(new Point(18,10));
        list.add(new Point(19,10));
        
        list.add(new Point(11,16));
        list.add(new Point(12,16));
        list.add(new Point(13,16));
        list.add(new Point(14,16));
        list.add(new Point(15,16));
        list.add(new Point(16,16));
        list.add(new Point(17,16));
        list.add(new Point(18,16));
        list.add(new Point(19,16));
    }
}
