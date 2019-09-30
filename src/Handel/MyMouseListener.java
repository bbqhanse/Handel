package Handel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseListener extends MouseAdapter {

    @Override
    public void mousePressed(MouseEvent e) {
        System.err.println("test");
    }
}
