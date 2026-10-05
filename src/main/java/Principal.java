import javax.swing.JOptionPane;

/**
 *
 * @author 10725213830
 */
public class Principal {

    public static void main(String[] args) {

        int i = 0;
        do {
            JOptionPane.showMessageDialog(null, "Valor de i: " + i);
            i++;
        } while (i < 5);
    }
}
