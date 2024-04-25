package Vista;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Ventana1 extends JFrame
{
     JPanel panel;
     JButton boton;
    public Ventana1(){
    panel=new JPanel();
    boton=new JButton();
        setSize(1000,700);
        add(panel);
        panel.setLayout(null);
        panel.add(boton);
        boton.setBounds(500, 500, 150, 40);
        boton.setText("Hola Aaron");
        this.setLocationRelativeTo(null);
        //Maylo esta tirando codigo
    }

}
