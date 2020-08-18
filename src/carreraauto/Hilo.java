package carreraauto;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.util.Random;
        

public class Hilo extends Thread {
    javax.swing.JLabel jLabel1;
    
    Random imagen = new Random();
    Random tiem = new Random();
    int i = 0;
    int tiempo = 0;
    int valor = 0;
    public void run() {
        while (true) {
              i = imagen.nextInt(5);
            tiempo = tiem.nextInt(100);
            i = imagen.nextInt(5);
            if (i == 1) {
                ImageIcon img1 = new ImageIcon(getClass().getResource("/imagenes/piolin4.png"));
                ImageIcon imageIcon1 = new ImageIcon(img1.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
                jLabel1.setIcon(img1);
                valor = 1;
            }
            if (i == 2) {
                ImageIcon img1 = new ImageIcon(getClass().getResource("/imagenes/piolin2.png"));
                ImageIcon imageIcon1 = new ImageIcon(img1.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
                jLabel1.setIcon(img1);
                valor = 2;
            }
             if (i == 3) {
                ImageIcon img1 = new ImageIcon(getClass().getResource("/imagenes/piolin3.png"));
                ImageIcon imageIcon1 = new ImageIcon(img1.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
                jLabel1.setIcon(img1);
                valor = 3;
             }
             if (i == 4) {
                ImageIcon img1 = new ImageIcon(getClass().getResource("/imagenes/piolin1.png"));
                ImageIcon imageIcon1 = new ImageIcon(img1.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
                jLabel1.setIcon(img1);
                valor = 4;
             
               
            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
        }

    }

        }

    public void recibejLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }
    
}
