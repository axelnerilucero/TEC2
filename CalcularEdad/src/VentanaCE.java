import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaCE extends JFrame implements ActionListener{
    JTextField txtDia, txtMes, txtAnio;
    JButton btnCalcularEdad;

    public VentanaCE(){
        setTitle("Ordenar");
        setSize(300,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel01 = new JPanel(new GridLayout(7,1));
        txtDia = new JTextField();
        txtMes = new JTextField();
        txtAnio = new JTextField();
        JLabel etiquetaDia = new JLabel("Día:");
        JLabel etiquetaMes = new JLabel("Mes:");
        JLabel etiquetaAnio = new JLabel("Año:");
        btnCalcularEdad = new JButton("Calcular Edad");
        btnCalcularEdad.addActionListener(this);
        txtAnio.addActionListener(this);

        panel01.add(etiquetaDia);
        panel01.add(txtDia);
        panel01.add(etiquetaMes);
        panel01.add(txtMes);
        panel01.add(etiquetaAnio);
        panel01.add(txtAnio);
        panel01.add(btnCalcularEdad);


        add(panel01);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int anioN = Integer.parseInt(txtAnio.getText());
        int diaN = Integer.parseInt(txtDia.getText());
        int mesN = Integer.parseInt(txtMes.getText());
        Calendar cal = new GregorianCalendar();
        int diaAc = cal.get(Calendar.DAY_OF_MONTH);
        int mesAc = cal.get(Calendar.MONTH);
        int anioAc = cal.get(Calendar.YEAR);
        if (mesN <= mesAc){
            JOptionPane.showMessageDialog(null,"Tu edad es: " + (anioAc - anioN) + " años");
        }else if (diaN <= diaAc){
            JOptionPane.showMessageDialog(null,"Tu edad es: " + (anioAc - anioN) + " años");
        }
        else if (diaN > diaAc) {
            anioAc = anioAc -1;
            JOptionPane.showMessageDialog(null,"Tu edad es: " + (anioAc - anioN) + " años");
        }else if (mesN > mesAc){
            anioAc = anioAc -1;
            JOptionPane.showMessageDialog(null,"Tu edad es: " + (anioAc - anioN) + " años");
        }
    }

    public static void main(String[] args) {
        VentanaCE vce = new VentanaCE();
        vce.setVisible(true);
        vce.setLocationRelativeTo(null);
    }
}