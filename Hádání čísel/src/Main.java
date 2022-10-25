import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        int xx = Integer.parseInt(JOptionPane.showInputDialog("tipni si číslo od jedné do tří"));
        int x = rd.nextInt(3) + 1;
        if (xx == x) {
            JOptionPane.showMessageDialog(null, "Máš jeden bod!");
            int xy = Integer.parseInt(JOptionPane.showInputDialog("tipni si číslo od jedné do tří"));
            int y = rd.nextInt(3) + 1;


            if (xy == y) {
                JOptionPane.showMessageDialog(null, "Máš Dva body!");
                int xxx = Integer.parseInt(JOptionPane.showInputDialog("tipni si číslo od jedné do tří"));
                int xxy = rd.nextInt(3) + 1;

                if (xxx == xxy) {
                    JOptionPane.showMessageDialog(null, "Máš  tři body ještě jeden a vyhrál jsi!!");
                    int xxxx = Integer.parseInt(JOptionPane.showInputDialog("tipni si číslo od jedné do tří"));
                    int xxyy = rd.nextInt(3) + 1;
                    if (xxxx == xxyy) {
                        JOptionPane.showMessageDialog(null, "GRATULUJI VYHRÁL JSI!!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Prohrál jsi se třemi body, skoro jsi to měl:)");
                    }


                } else {
                    JOptionPane.showMessageDialog(null, "Prohrál jsi se dvěma body:)");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Prohrál jsi s jedním bodem:)");
            }


        } else {
            JOptionPane.showMessageDialog(null, "Prohrál jsi a nezískal jsi ani jeden bod, škoda, zkus to znovu:)");
            System.exit(0);
        }


    }
}

