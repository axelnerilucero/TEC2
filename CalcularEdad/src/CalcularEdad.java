import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcularEdad extends JFrame implements ActionListener{
    JTextField txtDia, txtanio, txtMes;
    JButton btnCalcularEdad;
    public CalcularEdad(){

        setTitle("calcularEdad");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel Panel1 =new JPanel();
        Panel1.setLayout(new GridLayout (7,1));
        txtDia = new JTextField();
        txtanio = new JTextField();
        txtMes = new JTextField();
        btnCalcularEdad = new JButton("Calcular edad");
        btnCalcularEdad.addActionListener(this);
        JLabel etiquetaDia = new JLabel("Dia:");
        JLabel etiquetaMes = new JLabel("Mes:");
        JLabel etiquetaAño = new JLabel("Año:");
        Panel1.add(etiquetaDia);
        Panel1.add(txtDia);
        Panel1.add(etiquetaMes);
        Panel1.add(txtMes);
        Panel1.add(etiquetaAño);
        Panel1.add(txtanio);

        Panel1.add(btnCalcularEdad);
        add (Panel1);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Tu edad es: ");

    }



}