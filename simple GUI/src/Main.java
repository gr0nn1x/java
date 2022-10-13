import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        String name = JOptionPane.showInputDialog("Zadejte svoje jméno");
        JOptionPane.showMessageDialog(null, "zdravíčko"+" "+ name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Zadej věk"));
        JOptionPane.showMessageDialog(null, "je ti "+age+" let");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Zadej výšku"));
        JOptionPane.showMessageDialog(null,"Jsi "+height+" Cm vysokej kokot");

    }
}