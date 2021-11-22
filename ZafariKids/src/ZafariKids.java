
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jramirezm
 */
public class ZafariKids extends javax.swing.JFrame {

    /**
     * Creates new form ZafariKids
     */
    public ZafariKids() {
        initComponents();
         this.setSize(1400, 800);
         this.getContentPane().setBackground(Color.decode("#90EE90"));
         this.setLocationRelativeTo(null);
         this.setResizable(false);
        //this.setContentPane(jLabel2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblPalmeraI = new javax.swing.JLabel();
        jlblPalmeraD = new javax.swing.JLabel();
        jlblArena = new javax.swing.JLabel();
        jlblArbustosA = new javax.swing.JLabel();
        jlblHoja1 = new javax.swing.JLabel();
        jlblHoja2 = new javax.swing.JLabel();
        jlblHoja3 = new javax.swing.JLabel();
        jlblHoja4 = new javax.swing.JLabel();
        jlblHoja5 = new javax.swing.JLabel();
        jlblAguila = new javax.swing.JLabel();
        jlblElefante = new javax.swing.JLabel();
        jlblJirafa = new javax.swing.JLabel();
        jlblTigre = new javax.swing.JLabel();
        jlblMico = new javax.swing.JLabel();
        jlblLeon = new javax.swing.JLabel();
        jlblCebra = new javax.swing.JLabel();
        jlblLogo = new javax.swing.JLabel();
        jlblSiluetaAguila = new javax.swing.JLabel();
        jlblSiluetaElefante = new javax.swing.JLabel();
        jlblSiluetaJirafa = new javax.swing.JLabel();
        jlblSiluetaLeon = new javax.swing.JLabel();
        jlblSiluetaMico = new javax.swing.JLabel();
        jlblSiluetaTigre = new javax.swing.JLabel();
        jlblSiluetaCebra = new javax.swing.JLabel();
        jlblReproduccionMico = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Zafari Kids");
        getContentPane().setLayout(null);

        jlblPalmeraI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Palmera Lado Izquierdo.png"))); // NOI18N
        getContentPane().add(jlblPalmeraI);
        jlblPalmeraI.setBounds(350, 140, 100, 500);

        jlblPalmeraD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Palmera LadoDerecho.png"))); // NOI18N
        getContentPane().add(jlblPalmeraD);
        jlblPalmeraD.setBounds(1270, 160, 100, 500);

        jlblArena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Arena.png"))); // NOI18N
        getContentPane().add(jlblArena);
        jlblArena.setBounds(350, 575, 1050, 150);

        jlblArbustosA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Arbustos Arriba.png"))); // NOI18N
        getContentPane().add(jlblArbustosA);
        jlblArbustosA.setBounds(270, -25, 1100, 300);

        jlblHoja1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Hojas Laterales 1.png"))); // NOI18N
        getContentPane().add(jlblHoja1);
        jlblHoja1.setBounds(420, 65, 154, 162);

        jlblHoja2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Hojas Laterales 2.png"))); // NOI18N
        getContentPane().add(jlblHoja2);
        jlblHoja2.setBounds(1250, 75, 116, 123);

        jlblHoja3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Hojas Laterales 2.png"))); // NOI18N
        getContentPane().add(jlblHoja3);
        jlblHoja3.setBounds(1160, 540, 116, 123);

        jlblHoja4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Hojas Laterales 2.png"))); // NOI18N
        getContentPane().add(jlblHoja4);
        jlblHoja4.setBounds(400, 495, 116, 123);

        jlblHoja5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Hojas Laterales 1.png"))); // NOI18N
        getContentPane().add(jlblHoja5);
        jlblHoja5.setBounds(420, 275, 154, 162);

        jlblAguila.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Arte-aguila-pieza-color.png"))); // NOI18N
        jlblAguila.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblAguila.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jlblAguilaMouseDragged(evt);
            }
        });
        getContentPane().add(jlblAguila);
        jlblAguila.setBounds(-15, 180, 195, 143);

        jlblElefante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/elefante.png"))); // NOI18N
        jlblElefante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblElefante.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jlblElefanteMouseDragged(evt);
            }
        });
        getContentPane().add(jlblElefante);
        jlblElefante.setBounds(165, 180, 195, 143);

        jlblJirafa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Jirafa.png"))); // NOI18N
        jlblJirafa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblJirafa.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jlblJirafaMouseDragged(evt);
            }
        });
        getContentPane().add(jlblJirafa);
        jlblJirafa.setBounds(170, 320, 195, 143);

        jlblTigre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Tigre.png"))); // NOI18N
        jlblTigre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblTigre.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jlblTigreMouseDragged(evt);
            }
        });
        getContentPane().add(jlblTigre);
        jlblTigre.setBounds(-5, 320, 195, 143);

        jlblMico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mico.png"))); // NOI18N
        jlblMico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblMico.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jlblMicoMouseDragged(evt);
            }
        });
        getContentPane().add(jlblMico);
        jlblMico.setBounds(180, 460, 195, 143);

        jlblLeon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Leon.png"))); // NOI18N
        jlblLeon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblLeon.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jlblLeonMouseDragged(evt);
            }
        });
        getContentPane().add(jlblLeon);
        jlblLeon.setBounds(-5, 460, 195, 143);

        jlblCebra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cebra.png"))); // NOI18N
        jlblCebra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblCebra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jlblCebraMouseDragged(evt);
            }
        });
        getContentPane().add(jlblCebra);
        jlblCebra.setBounds(80, 610, 195, 143);

        jlblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        getContentPane().add(jlblLogo);
        jlblLogo.setBounds(20, 0, 200, 180);

        jlblSiluetaAguila.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Silueta aguila.png"))); // NOI18N
        getContentPane().add(jlblSiluetaAguila);
        jlblSiluetaAguila.setBounds(1060, 110, 195, 143);

        jlblSiluetaElefante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Silueta Elefante.png"))); // NOI18N
        getContentPane().add(jlblSiluetaElefante);
        jlblSiluetaElefante.setBounds(720, 550, 195, 143);

        jlblSiluetaJirafa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Silueta Jirafa.png"))); // NOI18N
        getContentPane().add(jlblSiluetaJirafa);
        jlblSiluetaJirafa.setBounds(950, 530, 195, 143);

        jlblSiluetaLeon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Silueta Leon.png"))); // NOI18N
        getContentPane().add(jlblSiluetaLeon);
        jlblSiluetaLeon.setBounds(1100, 400, 195, 143);

        jlblSiluetaMico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Silueta Mico.png"))); // NOI18N
        getContentPane().add(jlblSiluetaMico);
        jlblSiluetaMico.setBounds(500, 170, 195, 143);

        jlblSiluetaTigre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Silueta Tigre.png"))); // NOI18N
        getContentPane().add(jlblSiluetaTigre);
        jlblSiluetaTigre.setBounds(508, 495, 195, 143);

        jlblSiluetaCebra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cebra Silueta.png"))); // NOI18N
        getContentPane().add(jlblSiluetaCebra);
        jlblSiluetaCebra.setBounds(800, 300, 195, 143);

        jlblReproduccionMico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reproduccion.png"))); // NOI18N
        jlblReproduccionMico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblReproduccionMico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblReproduccionMicoMouseClicked(evt);
            }
        });
        getContentPane().add(jlblReproduccionMico);
        jlblReproduccionMico.setBounds(700, 280, 30, 30);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(730, 270, 75, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlblAguilaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblAguilaMouseDragged
           jlblAguila.setLocation(jlblAguila.getLocation().x + evt.getX() - jlblAguila.getWidth() /2,
                jlblAguila.getLocation().y + evt.getY() - jlblAguila.getHeight());
    }//GEN-LAST:event_jlblAguilaMouseDragged

    private void jlblElefanteMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblElefanteMouseDragged
        jlblElefante.setLocation(jlblElefante.getLocation().x + evt.getX() - jlblElefante.getWidth() /2,
                jlblElefante.getLocation().y + evt.getY() - jlblElefante.getHeight());
    }//GEN-LAST:event_jlblElefanteMouseDragged

    private void jlblJirafaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblJirafaMouseDragged
          jlblJirafa.setLocation(jlblJirafa.getLocation().x + evt.getX() - jlblJirafa.getWidth() /2,
                jlblJirafa.getLocation().y + evt.getY() - jlblJirafa.getHeight());
    }//GEN-LAST:event_jlblJirafaMouseDragged

    private void jlblTigreMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblTigreMouseDragged
        jlblTigre.setLocation(jlblTigre.getLocation().x + evt.getX() - jlblTigre.getWidth() /2,
                jlblTigre.getLocation().y + evt.getY() - jlblTigre.getHeight());
    }//GEN-LAST:event_jlblTigreMouseDragged

    private void jlblMicoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblMicoMouseDragged
        jlblMico.setLocation(jlblMico.getLocation().x + evt.getX() - jlblMico.getWidth() /2,
                jlblMico.getLocation().y + evt.getY() - jlblMico.getHeight());
    }//GEN-LAST:event_jlblMicoMouseDragged

    private void jlblLeonMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblLeonMouseDragged
         jlblLeon.setLocation(jlblLeon.getLocation().x + evt.getX() - jlblLeon.getWidth() /2,
                jlblLeon.getLocation().y + evt.getY() - jlblLeon.getHeight());
    }//GEN-LAST:event_jlblLeonMouseDragged

    private void jlblCebraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCebraMouseDragged
         jlblCebra.setLocation(jlblCebra.getLocation().x + evt.getX() - jlblCebra.getWidth() /2,
                jlblCebra.getLocation().y + evt.getY() - jlblCebra.getHeight());
    }//GEN-LAST:event_jlblCebraMouseDragged

    private void jlblReproduccionMicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblReproduccionMicoMouseClicked
       
        
        
            
            
       
        
        
        
        
        
    }//GEN-LAST:event_jlblReproduccionMicoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            
        //new JFXPanel();
        String pon = new File("leon.mp3").toURI().toString();
        new MediaPlayer(new Media(pon)).play();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
            
             
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ZafariKids.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ZafariKids.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ZafariKids.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ZafariKids.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZafariKids().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jlblAguila;
    private javax.swing.JLabel jlblArbustosA;
    private javax.swing.JLabel jlblArena;
    private javax.swing.JLabel jlblCebra;
    private javax.swing.JLabel jlblElefante;
    private javax.swing.JLabel jlblHoja1;
    private javax.swing.JLabel jlblHoja2;
    private javax.swing.JLabel jlblHoja3;
    private javax.swing.JLabel jlblHoja4;
    private javax.swing.JLabel jlblHoja5;
    private javax.swing.JLabel jlblJirafa;
    private javax.swing.JLabel jlblLeon;
    private javax.swing.JLabel jlblLogo;
    private javax.swing.JLabel jlblMico;
    private javax.swing.JLabel jlblPalmeraD;
    private javax.swing.JLabel jlblPalmeraI;
    private javax.swing.JLabel jlblReproduccionMico;
    private javax.swing.JLabel jlblSiluetaAguila;
    private javax.swing.JLabel jlblSiluetaCebra;
    private javax.swing.JLabel jlblSiluetaElefante;
    private javax.swing.JLabel jlblSiluetaJirafa;
    private javax.swing.JLabel jlblSiluetaLeon;
    private javax.swing.JLabel jlblSiluetaMico;
    private javax.swing.JLabel jlblSiluetaTigre;
    private javax.swing.JLabel jlblTigre;
    // End of variables declaration//GEN-END:variables
}
