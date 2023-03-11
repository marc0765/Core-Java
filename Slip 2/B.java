// Design a screen in Java to handle the Mouse Events such as MOUSE_MOVED and MOUSE_CLICK and display the position of the Mouse_Click in a TextField.

import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame
{
    TextField t,t1;
    Label l,l1;
    int x,y;
    Panel p;
    MyFrame(String title)
    {
        super(title);
        setLayout(new FlowLayout());
        p=new Panel();
        p.setLayout(new GridLayout(2,2,5,5));
        t=new TextField(20);
        l= new Label("Co-ordinates of clicking");
        t1=new TextField(20);
        l1= new Label("Co-ordinates of movement");
        p.add(l);
        p.add(t);
        p.add(l1);
        p.add(t1);
        add(p);
        addMouseListener(new MyClick());
        addMouseMotionListener(new MyMove());
        setSize(500,500);
        setVisible(true);
    }
    class MyClick extends MouseAdapter
    {
        public void mouseClicked(MouseEvent me)
        {
            x=me.getX();
            y=me.getY();
            t.setText("X="+x+" Y="+y);
        }
    }
    class MyMove extends MouseMotionAdapter
    {
        public void mouseMoved(MouseEvent me)
        {
            x=me.getX();
            y=me.getY();
            t1.setText("X="+ x +" Y="+y);
        }
    }
}
public class Slip2B 
{ 
    public static void main(String args[])
    {
        MyFrame f = new MyFrame("Slip Number 2(B)");
    }
}

/*
<applet code="Slip2B.class" height=300 width=200>
</applet>
*/
