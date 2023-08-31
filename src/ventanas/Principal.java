/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Clases.Conexiones;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MINEDUCYT
 */
public class Principal extends javax.swing.JFrame {

    String Libro;
    DefaultTableModel model = new DefaultTableModel();
    int clic = 0, buscar = 0;

    /**
     * Creates new form Principal
     */
    public Principal() {
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
        String Usuario = Login.Username;
        this.setLocationRelativeTo(null);
        setResizable(false);
        setSize(630, 450);
        ImageIcon Buscador = new ImageIcon("src/images/Buscar.png");
        Icon Icon = new ImageIcon(Buscador.getImage().getScaledInstance(Buscar.getWidth(),
                Buscar.getHeight(), Image.SCALE_DEFAULT));

        Buscar.setIcon(Icon);
        this.repaint();

        ImageIcon wallpaper = new ImageIcon("src/images/libreria.jpg");
        Icon Icono = new ImageIcon(wallpaper.getImage().getScaledInstance(Wallpaper.getWidth(),
                Wallpaper.getHeight(), Image.SCALE_DEFAULT));

        Wallpaper.setIcon(Icono);
        this.repaint();
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        Table.setShowGrid(false);
        LabelUsuario.setText("Usuario: " + Usuario);
        try {

            Connection cn = Conexiones.conexion();
            PreparedStatement pst = cn.prepareStatement(
                    "select ID, Nombre, Creador from libros");

            ResultSet rs = pst.executeQuery();

            Table = new JTable(model);
            jScrollPane1.setViewportView(Table);

            model.addColumn("ID");
            model.addColumn("Nombre");
            model.addColumn("Autor");

            while (rs.next()) {
                Object[] fila = new Object[3];

                for (int i = 0; i < 3; i++) {
                    fila[i] = rs.getObject(i + 1);

                }
                model.addRow(fila);
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error al Iniciar secion, contacte a un Administrador");
        }
        Table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int Filap = Table.rowAtPoint(e.getPoint());
                int Columna = 1;
                if (Filap >= -1) {
                    try {
                        Libro = (String) model.getValueAt(Filap, Columna);
                        String url = "src/libros/" + Libro + ".pdf";
                        String program = "C:/Program Files/Adobe/Acrobat DC/Acrobat/Acrobat.exe";
                        ProcessBuilder p = new ProcessBuilder();
                        p.command(program, url);
                        p.start();
                        System.out.println("Abriendo el libro: " + Libro);
                    } catch (IOException ex) {
                        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        });
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource(
                "images/icon.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtBuscador = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        Buscar = new javax.swing.JToggleButton();
        LabelUsuario = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LA BIBLIOTECA DE LOS ERRANTES");
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtBuscador.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        TxtBuscador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(TxtBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 460, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("Buscar:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        jTextField2.setBackground(new java.awt.Color(192, 192, 192));
        jTextField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField2.setEnabled(false);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 70, -1));

        Buscar.setBorder(null);
        Buscar.setOpaque(true);
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 60, 50));

        LabelUsuario.setText("Usuario:");
        getContentPane().add(LabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 20));

        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.setEnabled(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 90, -1));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setEnabled(false);

        Table.setBackground(getBackground());
        Table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Libro", "Autor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Table.setEnabled(false);
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setPreferredWidth(50);
            Table.getColumnModel().getColumn(1).setPreferredWidth(310);
            Table.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 580, 290));
        getContentPane().add(Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        String Buscar;

        Buscar = TxtBuscador.getText().trim();
        if (!Buscar.equals("")) {

            for (int i = 0; i < Table.getRowCount(); i++) {
                model.removeRow(i);
                i--;
            }
            try {
                Connection cn2 = Conexiones.conexion();
                PreparedStatement pst2 = cn2.prepareStatement(
                        "select * from libros where Nombre LIKE'" + Buscar + "%'");

                ResultSet rs2 = pst2.executeQuery();

                while (rs2.next()) {
                    Object[] fila = new Object[3];

                    for (int i = 0; i < 3; i++) {
                        fila[i] = rs2.getObject(i + 1);

                    }
                    model.addRow(fila);
                }
                System.out.println("Buscando " + Buscar);
                cn2.close();
            } catch (SQLException e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(null, "Error al buscar, contacte a un Administrador");
            }
        } else {

            for (int i = 0; i < Table.getRowCount(); i++) {
                model.removeRow(i);
                i--;
            }
            try {
                Connection cn1 = Conexiones.conexion();
                PreparedStatement pst1 = cn1.prepareStatement(
                        "select ID, Nombre, Creador from libros");

                ResultSet rs1 = pst1.executeQuery();
                while (rs1.next()) {
                    Object[] fila = new Object[3];

                    for (int i = 0; i < 3; i++) {
                        fila[i] = rs1.getObject(i + 1);

                    }
                    model.addRow(fila);
                }

                System.out.println("Buscando todos los libros");
                cn1.close();
            } catch (SQLException e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(null, "Error al Buscar los libros, contacte a un Administrador");
            }
        }

    }//GEN-LAST:event_BuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Buscar;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JTable Table;
    private javax.swing.JTextField TxtBuscador;
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
