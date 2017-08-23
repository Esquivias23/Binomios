package binomios;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author adria
 * @version 1.0
 * @see https://github.com/Esquivias23
 */

public class fondo1 extends javax.swing.JPanel{
    
    public fondo1 ()     
    {
     this.setSize(1000, 700);
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        Dimension tamanio= getSize();
        ImageIcon imagenFondo=new ImageIcon(getClass().getResource("hola.jpg"));
        g.drawImage(imagenFondo.getImage(),0,0,tamanio.width,tamanio.height,null);
        setOpaque(false);
        super.paintComponent(g);
        
      
    }
}
