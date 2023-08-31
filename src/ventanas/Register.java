/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import Clases.Conexiones;
import java.awt.Toolkit;
import java.sql.SQLException;

/**
 *
 * @author MINEDUCYT
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Register() {
        initComponents();
        try {
            String titulo;
            int ID;
            ID = (int) (Math.random() * 9);
            Connection cn = Conexiones.conexion();
            PreparedStatement pst = cn.prepareStatement(
                    "select frases from frase where ID = '" + ID + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                titulo = rs.getString("frases");
                setTitle(titulo);
            } else {
                setTitle("Bliblioteca de los Herrantes");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        setResizable(false);
        this.setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon Lgo = new ImageIcon("src/images/libroslibres.png");
        Icon icono = new ImageIcon(Lgo.getImage().getScaledInstance(Logo.getWidth(),
                Logo.getHeight(), Image.SCALE_DEFAULT));

        Logo.setIcon(icono);
        this.repaint();
        ImageIcon foto = new ImageIcon("src/images/Register.png");
        Icon icon = new ImageIcon(foto.getImage().getScaledInstance(Text.getWidth(),
                Text.getHeight(), Image.SCALE_DEFAULT));

        Text.setIcon(icon);
        this.repaint();
        ImageIcon wallpape = new ImageIcon("src/images/entrada.jpg");
        Icon fondo = new ImageIcon(wallpape.getImage().getScaledInstance(wallpaper.getWidth(),
                wallpaper.getHeight(), Image.SCALE_DEFAULT));

        wallpaper.setIcon(fondo);
        this.repaint();
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource(
                "images/icon.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        TxtPassword = new javax.swing.JPasswordField();
        Nombre = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        fondo = new javax.swing.JTextField();
        Fondo = new javax.swing.JTextField();
        TxtUsername = new javax.swing.JTextField();
        TxtConfirmar = new javax.swing.JPasswordField();
        Nombre1 = new javax.swing.JLabel();
        fondo1 = new javax.swing.JTextField();
        password1 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JTextField();
        TxtCorreo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        Nombre2 = new javax.swing.JLabel();
        fondo2 = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        Text = new javax.swing.JLabel();
        wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 70, 70));

        jButton1.setText("volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        TxtPassword.setBackground(new java.awt.Color(0, 166, 189));
        TxtPassword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TxtPassword.setForeground(new java.awt.Color(255, 255, 255));
        TxtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(TxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 210, 40));

        Nombre.setBackground(new java.awt.Color(51, 51, 51));
        Nombre.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Nombre.setText("Username:");
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        password.setBackground(new java.awt.Color(51, 51, 51));
        password.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        password.setText("Contraseña:");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        fondo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fondo.setEnabled(false);
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 100, -1));

        Fondo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Fondo.setEnabled(false);
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 110, 20));

        TxtUsername.setBackground(new java.awt.Color(0, 166, 189));
        TxtUsername.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TxtUsername.setForeground(new java.awt.Color(255, 255, 255));
        TxtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtUsername.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(TxtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 180, 40));

        TxtConfirmar.setBackground(new java.awt.Color(0, 166, 189));
        TxtConfirmar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TxtConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        TxtConfirmar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtConfirmar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(TxtConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 210, 40));

        Nombre1.setBackground(new java.awt.Color(51, 51, 51));
        Nombre1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Nombre1.setText("Correo Electronico:");
        getContentPane().add(Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        fondo1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fondo1.setEnabled(false);
        getContentPane().add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 170, -1));

        password1.setBackground(new java.awt.Color(51, 51, 51));
        password1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        password1.setText("Confirme su Contraseña:");
        getContentPane().add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        Fondo1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Fondo1.setEnabled(false);
        getContentPane().add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 200, 20));

        TxtCorreo.setBackground(new java.awt.Color(0, 166, 189));
        TxtCorreo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TxtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        TxtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtCorreo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(TxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 180, 40));

        jButton2.setBackground(new java.awt.Color(0, 166, 189));
        jButton2.setText("Registrarse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 140, 30));

        Nombre2.setBackground(new java.awt.Color(51, 51, 51));
        Nombre2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Nombre2.setText("Nombre de Usuario:");
        getContentPane().add(Nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        fondo2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fondo2.setEnabled(false);
        getContentPane().add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 170, -1));

        TxtNombre.setBackground(new java.awt.Color(0, 166, 189));
        TxtNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TxtNombre.setForeground(new java.awt.Color(255, 255, 255));
        TxtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 180, 40));
        getContentPane().add(Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 560, 180));
        getContentPane().add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Inicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int Solo = 0;
        String Username, Correo, Pass, Confirm, nombre;

        Username = TxtUsername.getText().trim();
        Correo = TxtCorreo.getText().trim();
        Pass = TxtPassword.getText().trim();
        Confirm = TxtConfirmar.getText().trim();
        nombre = TxtNombre.getText().trim();

        if (Username.equals("")) {
            TxtUsername.setBackground(Color.red);
            Solo++;
        } else {
            TxtUsername.setBackground(Color.YELLOW);
        }
        if (nombre.equals("")) {
            TxtNombre.setBackground(Color.red);
            Solo++;
        } else {
            TxtNombre.setBackground(Color.YELLOW);
        }
        if (Correo.equals("")) {
            TxtCorreo.setBackground(Color.red);
            Solo++;
        } else {
            TxtCorreo.setBackground(Color.YELLOW);
        }
        if (Pass.equals("")) {
            TxtPassword.setBackground(Color.red);
            Solo++;
        } else {
            TxtPassword.setBackground(Color.YELLOW);
        }
        if (Confirm.equals("")) {
            TxtConfirmar.setBackground(Color.red);
            Solo++;
        } else {
            TxtConfirmar.setBackground(Color.YELLOW);
        }
        if (Solo == 0) {

            if (Pass.equals(Confirm)) {
                TxtPassword.setBackground(Color.green);
                TxtConfirmar.setBackground(Color.green);
                TxtUsername.setBackground(Color.green);
                TxtNombre.setBackground(Color.GREEN);
                TxtCorreo.setBackground(Color.green);

                try {
                    Connection cn2 = Conexiones.conexion();
                    PreparedStatement pst2 = cn2.prepareStatement(
                            "select Username from usuarios where Username = '" + Username + "'");

                    ResultSet rs = pst2.executeQuery();

                    if (rs.next()) {
                        TxtUsername.setBackground(Color.red);
                        JOptionPane.showMessageDialog(null, "Nombre de Usuario no esta disponible");
                        cn2.close();
                    } else {

                        try {
                            Connection cn3 = Conexiones.conexion();
                            PreparedStatement pst3 = cn3.prepareStatement(
                                    "insert into usuarios values(?,?,?,?,?)");

                            pst3.setString(1, "0");
                            pst3.setString(2, Username);
                            pst3.setString(3, Pass);
                            pst3.setString(4, nombre);
                            pst3.setString(5, Correo);

                            pst3.executeUpdate();
                            cn3.close();
                            JOptionPane.showMessageDialog(null,
                                    "Registro exitoso, ahora ingese a Iniciar secion");

                            new Inicio().setVisible(true);
                            this.dispose();

                            System.out.println("Registrado el usuario: " + Username);

                        } catch (Exception e) {
                        }

                    }

                } catch (Exception e) {
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Porfavor llene todos los campos");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fondo;
    private javax.swing.JTextField Fondo1;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Nombre1;
    private javax.swing.JLabel Nombre2;
    private javax.swing.JLabel Text;
    private javax.swing.JPasswordField TxtConfirmar;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JPasswordField TxtPassword;
    private javax.swing.JTextField TxtUsername;
    private javax.swing.JTextField fondo;
    private javax.swing.JTextField fondo1;
    private javax.swing.JTextField fondo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel password;
    private javax.swing.JLabel password1;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}