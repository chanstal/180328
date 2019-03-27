import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.Random;

public class qq extends JLabel {
    private Random rand=new Random(System.currentTimeMillis());
    ImageIcon icon=new ImageIcon("下載.jpg");
    private int x,y;
    private Timer t1;

    qq(){
        this.setIcon(icon);
        x=rand.nextInt(600);
        y=rand.nextInt(500);
        this.setBounds(x,y,icon.getIconWidth(),icon.getIconHeight());
        t1=new Timer(1000, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x=x+5;
               qq.this.setLocation(x,y);
            }
        });
        t1.start();

    }
}
