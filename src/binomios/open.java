package binomios;

import java.sql.ResultSet;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Scanner;

/**
 *
 * @author adria
 * @version 1.0
 * @see https://github.com/Esquivias23
 */
public class open extends JFrame implements ActionListener {

    int valor1;
    int valor2;
    String valor3;
    int valor4;
    
    JButton calcula, borra;
    JTextField t1, t2, t3, t4, t5, t6, t7;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
    


    public open() {
        setTitle("Binomios Locos");
        setLocationRelativeTo(null);
        fondo1 ja = new fondo1();
        setContentPane(ja);
        setLayout(null);
        setBounds(100, 100, 700, 400);

        t1 = new JTextField();
        t1.setBounds(235, 100, 50, 30);
        add(t1);

        t2 = new JTextField();
        t2.setBounds(320, 100, 50, 30);
        add(t2);

        t3 = new JTextField();
        t3.setBounds(380, 100, 50, 30);
        add(t3);

        t4 = new JTextField();
        t4.setBounds(235, 250, 50, 30);
        t4.enable(false);
        add(t4);

        t5 = new JTextField();
        t5.setBounds(310, 250, 30, 30);
        t5.enable(false);
        add(t5);

        t6 = new JTextField();
        t6.setBounds(345, 250, 50, 30);
        t6.enable(false);
        add(t6);

        t7 = new JTextField();
        t7.setBounds(415, 250, 50, 30);
        t7.enable(false);
        add(t7);

        l1 = new JLabel("(");
        l1.setBounds(220, 90, 10, 50);
        l1.setForeground(Color.white); 
        add(l1);

        l2 = new JLabel(")^2");
        l2.setBounds(435, 90, 30, 50);
        l2.setForeground(Color.white);
        add(l2);

        l3 = new JLabel("x");
        l3.setBounds(300, 90, 10, 50);
        l3.setForeground(Color.white);
        add(l3);

        l4 = new JLabel("numero");
        l4.setBounds(235, 120, 50, 50);
        l4.setForeground(Color.white);
        add(l4);

        l5 = new JLabel("signo");
        l5.setBounds(330, 120, 50, 50);
        l5.setForeground(Color.white);
        add(l5);

        l6 = new JLabel("numero");
        l6.setBounds(385, 120, 50, 50);
        l6.setForeground(Color.white);
        add(l6);

        l7 = new JLabel("x^2");
        l7.setBounds(285, 240, 30, 50);
        l7.setForeground(Color.white);
        add(l7);

        l8 = new JLabel("+");
        l8.setBounds(400, 240, 30, 50);
        l8.setForeground(Color.white);
        add(l8);

        l9 = new JLabel("Binomios Locos");
        l9.setBounds(300, 30, 100, 50);
        l9.setForeground(Color.white);
        add(l9);

        borra = new JButton("Limpiar");
        borra.setBounds(265, 300, 170, 30);
        add(borra);
        borra.addActionListener(this);

        calcula = new JButton("Calcular");
        calcula.setBounds(265, 180, 170, 30);
        add(calcula);
        calcula.addActionListener(this);

        setVisible(true);
    }
    
    /**
     * Método que obtiene el valor1 apartir del num1
     * @param num1 int
     * @return valor1 como entero que sale de num1 * num1
     * @since incluido desde la version 1.0
     */
    public int calcula() {
        int num1 = Integer.parseInt(t1.getText());
        valor1 = num1 * num1;
        return valor1;
    }
    
    /**
     * Método que obtiene el valor2 apartir del num1
     * @param num2 int
     * @return valor2 como entero como entero que sale de num2 * num2
     * @since incluido desde la version 1.0
     */
    public int calcula2() {
        
        int num2 = Integer.parseInt(t3.getText());
        valor2 = num2 * num2;

        return valor2;
    }
    
    /**
     * Método que obtiene el valor3 apartir del signo
     * @param signo String que debe ser + o -
     * @return String valor3, si el signo es "+", retorna "+", si no, retorna "-".
     * @since incluido desde la version 1.0
     */
    public String calcula3() {
        
        String signo = t2.getText();
        if (signo == "+") {
            valor3 = "+";
        } else {
            valor3 = "-";
        }
        
        return valor3;
    }
    
    /**
     * Método que obtiene el valor4 apartir del num1
     * @param valor4 int
     * @return valor4 como entero
     * @since incluido desde la version 1.0
     */
    public int calcula4(){
        
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t3.getText());
        
        valor4 = 2*num1*num2;
        return valor4;
        
    }
    
    /**
     * Método que limpia los espacios JTextField
     * @since incluido desde la version 1.0
     */
    public void limpiar(){
        
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == calcula) {
            calcula();
            calcula2();
            calcula3();
            calcula4();
            t4.setText(String.valueOf(valor1));
            t5.setText(valor3);
            t6.setText(String.valueOf(valor4));
            t7.setText(String.valueOf(valor2));
            
        } else {
            limpiar();
            JOptionPane.showMessageDialog(null, "Viejitodemetalslugdiciendothankyou.jpg");
        }

    }
}
