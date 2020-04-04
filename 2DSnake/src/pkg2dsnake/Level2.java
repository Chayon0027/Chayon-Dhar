
package pkg2dsnake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.LinkedList;

public class Level2 {
    public static LinkedList<Point> List;
    public Level2(){
        init();
    }
    public void init(){
       List = new LinkedList<Point>(); 
    }
    public void DrawWall(Graphics g){
        g.setColor(Color.red);
        for(Point w: List)
        g.fillRect(w.x*Gameplay.BOX_WIDTH, w.y*Gameplay.BOX_HEIGHT, Gameplay.BOX_WIDTH, Gameplay.BOX_HEIGHT);
        
    }
    public void level2(){
        List.add(new Point(11,5));
        List.add(new Point(12,5));
        List.add(new Point(13,5));
        List.add(new Point(14,5));
        List.add(new Point(15,5));
        List.add(new Point(16,5));
        List.add(new Point(17,5));
        List.add(new Point(18,5));
        List.add(new Point(19,5));
        List.add(new Point(20,5));
        
        //wall2
        
        List.add(new Point(11,10));
        List.add(new Point(12,10));
        List.add(new Point(13,10));
        List.add(new Point(14,10));
        List.add(new Point(15,10));
        List.add(new Point(16,10));
        List.add(new Point(17,10));
        List.add(new Point(18,10));
        List.add(new Point(19,10));
        List.add(new Point(20,10));
        
        //wall3
         List.add(new Point(11,15));
        List.add(new Point(12,15));
        List.add(new Point(13,15));
        List.add(new Point(14,15));
        List.add(new Point(15,15));
        List.add(new Point(16,15));
        List.add(new Point(17,15));
        List.add(new Point(18,15));
        List.add(new Point(19,15));
        List.add(new Point(20,15));
        
        //wall4
      
        
        List.add(new Point(5,7));
        List.add(new Point(5,8));
        List.add(new Point(5,9));
        List.add(new Point(5,10));
        List.add(new Point(5,11));
        List.add(new Point(5,12));
        List.add(new Point(5,13));
        List.add(new Point(5,14));
        List.add(new Point(5,15));
        List.add(new Point(5,16));
        
        //wall5
      
       
        List.add(new Point(25,7));
        List.add(new Point(25,8));
        List.add(new Point(25,9));
        List.add(new Point(25,10));
        List.add(new Point(25,11));
        List.add(new Point(25,12));
        List.add(new Point(25,13));
        List.add(new Point(25,14));
        List.add(new Point(25,15));
        List.add(new Point(25,16));
        
    }
}
