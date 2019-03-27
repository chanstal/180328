import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MainFrame fr= new MainFrame();
        fr.setVisible(true);

        Scanner scn=new Scanner(System.in);
        Ashe ashe=new Ashe();
        Azir azir=new Azir();
        Ahri ahri=new Ahri();

        ashe.showInfo();
        System.out.println();
        azir.showInfo();

        System.out.println("\n azir attacked from ashe ");

        azir.hurt(ashe.qAttack());

        ashe.showInfo();
        System.out.println();
        azir.showInfo();

        System.out.println("\n azir attacked from ashe ");

        azir.hurt(ashe.qAttack());

        ashe.showInfo();
        System.out.println();
        azir.showInfo();




    }
}
