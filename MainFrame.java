import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class MainFrame extends JFrame {
    private JButton jbtnAdd=new JButton("Add");
    private JButton jbtnExit=new JButton("Exit");
    private JButton jbtnup=new JButton("U");
    private JButton jbtndown=new JButton("D");
    private JButton jbtnleft=new JButton("L");
    private JButton jbtnright=new JButton("R");
    private JButton jbtnrole=new JButton("role");
    private Container cp;
    private ImageIcon icon=new ImageIcon("下載.jpg");
    private int count=0;
    private JLabel jlb=new JLabel();
    ArrayList<qq>asList=new ArrayList<>();
public MainFrame(){
    init();
    cp=this.getContentPane();
    cp.setLayout(null);

}
private void init(){
    cp=this.getContentPane();
    this.setSize(600,500);
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    jbtnAdd.setBounds(0,0,80,25);
    jbtnExit.setBounds(90,0,80,25);
    jbtnup.setBounds(180,0,80,25);
    jbtndown.setBounds(270,0,80,25);
    jbtnleft.setBounds(360,0,80,25);
    jbtnright.setBounds(450,0,80,25);
    jbtnrole.setBounds(540,0,80,25);
    jlb.setBounds(50,50,225,225);
    jbtnAdd.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            MainFrame.this.setTitle(Integer.toString(count));
        }
    });
    jbtnExit.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });
    jbtnup.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(jlb.getX()-5+icon.getIconWidth()<cp.getWidth()){
                jlb.setLocation(jlb.getX(),jlb.getY()-5);
            }
        }
    });
    jbtndown.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(jlb.getY()+5+icon.getIconWidth()<cp.getWidth()){
                jlb.setLocation(jlb.getX(),jlb.getY()+5);
            }
        }
    });
    jbtnright.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(jlb.getX()+5+icon.getIconWidth()<cp.getWidth()){
                jlb.setLocation(jlb.getX()+5,jlb.getY());
            }
        }
    });
    jbtnleft.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(jlb.getX()-5+icon.getIconWidth()<cp.getWidth()){
                jlb.setLocation(jlb.getX()-5,jlb.getY());
            }
        }
    });
    jbtnrole.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            asList.add(new qq());
            cp.add(asList.get(asList.size()-1));
            cp.repaint();
        }
    });
//cp.addMouseListener(new MouseAdapter() {
                  //      @Override
               //         public void mouseClicked(MouseEvent e) {
                      //    boolean selectFlag=false;

                      //  }
                   // }

        jlb.setIcon(icon);
    cp.add(jbtnAdd);
    cp.add(jbtnExit);
    cp.add(jbtnup);
    cp.add(jbtndown);
    cp.add(jbtnleft);
    cp.add(jbtnright);
    cp.add(jlb);
    cp.add(jbtnrole);
}
}
