/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.BadLocationException;

/**
 *
 * @author Diego Pronesti
 */
public class Gui extends javax.swing.JFrame {

    /**
     * Creates new form Gui
     */
    
    private PrintStream standardOut;
    
    public Gui() {
            initComponents();
            agregarBotonConectar();
            agregarBotonQuery();
            agregarBotonClear();
            frameLogin.setLocationRelativeTo(null);
            frameLogin.setVisible(true);
       
            
       //CONSOLA GUI     
        PrintStream printStream = new PrintStream(new CustomOutputStream(consolaBD));
     // keeps reference of standard output stream
        standardOut = System.out;
         
        // re-assigns standard output stream and error output stream
        System.setOut(printStream);
        System.setErr(printStream);
 
    }
    
    public Conexion conexion = new Conexion();
    public Conexion conexionBD = new Conexion();
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameLogin = new javax.swing.JFrame();
        inputContrasenia = new javax.swing.JTextField();
        inputServidor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        inputUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        botonConectar = new javax.swing.JButton();
        serverPane = new javax.swing.JTabbedPane();
        panel_Tablas = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaBD = new javax.swing.JTable();
        combo_tablas = new javax.swing.JComboBox<>();
        combo_bases = new javax.swing.JComboBox<>();
        panel_Querys = new javax.swing.JPanel();
        inputQuery = new javax.swing.JTextField();
        botonQuery = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        botonClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        consolaBD = new javax.swing.JTextArea();

        frameLogin.setAlwaysOnTop(true);
        frameLogin.setMaximumSize(new java.awt.Dimension(321, 270));
        frameLogin.setMinimumSize(new java.awt.Dimension(321, 270));
        frameLogin.setPreferredSize(new java.awt.Dimension(321, 270));
        frameLogin.setResizable(false);

        inputServidor.setText("localhost");
        inputServidor.setName("inputServer"); // NOI18N

        jLabel3.setText("Direccion del Servidor");
        jLabel3.setToolTipText("Ingrese la direccion del servidor");

        jLabel1.setText("Nombre de usuario");

        inputUser.setText("root");
        inputUser.setName(""); // NOI18N

        jLabel2.setText("Contraseña");

        botonConectar.setText("Conectar");

        javax.swing.GroupLayout frameLoginLayout = new javax.swing.GroupLayout(frameLogin.getContentPane());
        frameLogin.getContentPane().setLayout(frameLoginLayout);
        frameLoginLayout.setHorizontalGroup(
            frameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameLoginLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(frameLoginLayout.createSequentialGroup()
                .addGroup(frameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameLoginLayout.createSequentialGroup()
                        .addGroup(frameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frameLoginLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botonConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(frameLoginLayout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel1)))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameLoginLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(inputUser, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(frameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameLoginLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(inputContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(inputServidor, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(87, 87, 87))
        );
        frameLoginLayout.setVerticalGroup(
            frameLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(botonConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JavaDatabase");
        setMaximumSize(new java.awt.Dimension(1075, 530));
        setMinimumSize(new java.awt.Dimension(1075, 530));
        setPreferredSize(new java.awt.Dimension(1075, 530));

        serverPane.setMinimumSize(new java.awt.Dimension(1053, 420));

        jScrollPane4.setBorder(null);

        tablaBD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tablaBD);

        combo_tablas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_tablasItemStateChanged(evt);
            }
        });
        combo_tablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tablasActionPerformed(evt);
            }
        });

        combo_bases.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_basesItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panel_TablasLayout = new javax.swing.GroupLayout(panel_Tablas);
        panel_Tablas.setLayout(panel_TablasLayout);
        panel_TablasLayout.setHorizontalGroup(
            panel_TablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TablasLayout.createSequentialGroup()
                .addGroup(panel_TablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE)
                    .addComponent(combo_tablas, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_bases, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_TablasLayout.setVerticalGroup(
            panel_TablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TablasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(combo_bases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_tablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addContainerGap())
        );

        serverPane.addTab("Tables", panel_Tablas);

        botonQuery.setText("Enviar");

        jLabel5.setText("Query");

        botonClear.setText("Limpiar");

        consolaBD.setColumns(20);
        consolaBD.setRows(5);
        jScrollPane1.setViewportView(consolaBD);

        javax.swing.GroupLayout panel_QuerysLayout = new javax.swing.GroupLayout(panel_Querys);
        panel_Querys.setLayout(panel_QuerysLayout);
        panel_QuerysLayout.setHorizontalGroup(
            panel_QuerysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_QuerysLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_QuerysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1028, Short.MAX_VALUE)
                    .addGroup(panel_QuerysLayout.createSequentialGroup()
                        .addGroup(panel_QuerysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_QuerysLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(inputQuery))
                        .addGap(18, 18, 18)
                        .addGroup(panel_QuerysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel_QuerysLayout.setVerticalGroup(
            panel_QuerysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_QuerysLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_QuerysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_QuerysLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputQuery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_QuerysLayout.createSequentialGroup()
                        .addComponent(botonQuery)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonClear)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        serverPane.addTab("Querys", panel_Querys);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(serverPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1053, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(serverPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void combo_tablasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_tablasItemStateChanged
        String nombre_tabla = combo_tablas.getSelectedItem().toString();
        try{
        java.sql.Statement stmt = conexion.conectar().createStatement();
        llenarTabla(stmt, nombre_tabla);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_combo_tablasItemStateChanged

    private void combo_tablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tablasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_tablasActionPerformed

    private void combo_basesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_basesItemStateChanged
        try{
            conectarDos(combo_bases.getSelectedItem().toString());
            java.sql.Statement stmt = conexion.conectar().createStatement();
            cargarTablas(stmt, combo_bases.getSelectedItem().toString()); //CARGA TODAS LAS TABLAS EN LA BASE DE DATOS
        }catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_combo_basesItemStateChanged

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
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });    
        
    }
    public void agregarBotonClear(){
               botonClear.addActionListener(new ActionListener() {
            @Override
    public void actionPerformed(ActionEvent e) {                
         try {
                    consolaBD.getDocument().remove(0,
                            consolaBD.getDocument().getLength());
                } catch (BadLocationException ex) {
                    ex.printStackTrace();
                }
        
            
    }
       });
    }
    
    
    public void agregarBotonConectar(){
               botonConectar.addActionListener(new ActionListener() {
            @Override
    public void actionPerformed(ActionEvent e) {
        conectarUno("estudiantes");
         frameLogin.setVisible(false);
        //serverPane.setSelectedIndex(1);
        
       
            
    }
       });
    }
    
    public void agregarBotonQuery(){
               botonQuery.addActionListener(new ActionListener() {
            @Override
    public void actionPerformed(ActionEvent e) {
        query();
    }
       });
    }
    
    public void query(){
        String query;
        
        query = inputQuery.getText();
        
        try{
             java.sql.Statement stmt = conexion.conectar().createStatement();
            java.sql.ResultSet consulta = stmt.executeQuery(query);
            
            java.sql.ResultSetMetaData metadata = consulta.getMetaData();
            
            int cantcolumnas = metadata.getColumnCount();
            while (consulta.next()){
                    for (int i = 0; i < cantcolumnas; i++) {
                        
                System.out.print(metadata.getColumnName(i+1) + ": ");
                 System.out.println(consulta.getString(i+1));
                    }    
                 System.out.println(" ");
                }
        }catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        
        
       
        
    }
    
    public void conectarUno(String nombreBase)
    {
    String username, password,url;
      
      username = inputUser.getText();
      password = inputContrasenia.getText();
      url = "jdbc:mysql://" + inputServidor.getText() + "/" + nombreBase;    
        
        conexion.setUrl(url);
        conexion.setNombre(username);
        conexion.setClave(password);  

        try {
            java.sql.Statement stmt = conexion.conectar().createStatement();
            
           cargarBases(stmt);
           cargarTablas(stmt, combo_bases.getItemAt(0)); //CARGA TODAS LAS TABLAS EN LA BASE DE DATOS
            
           String nombre_tabla = combo_tablas.getItemAt(0);  // TOMA POR DEFECTO LA PRIMERA TABLA        
            
          llenarTabla(stmt, nombre_tabla);  // LLENA EL COMPONENTE JTABLE CON LA INFORMACION DE LA TABLA SELECCIONADA EN LA BASE DE DATOS

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
     public void conectarDos(String nombreBase)
    {
    String username, password,url;
      
      username = inputUser.getText();
      password = inputContrasenia.getText();
      url = "jdbc:mysql://" + inputServidor.getText() + "/" + nombreBase;    
        
        conexion.setUrl(url);
        conexion.setNombre(username);
        conexion.setClave(password);  

        try {
            java.sql.Statement stmt = conexion.conectar().createStatement();
            
           cargarTablas(stmt, combo_bases.getItemAt(0)); //CARGA TODAS LAS TABLAS EN LA BASE DE DATOS
            
           String nombre_tabla = combo_tablas.getItemAt(0);  // TOMA POR DEFECTO LA PRIMERA TABLA        
            
          llenarTabla(stmt, nombre_tabla);  // LLENA EL COMPONENTE JTABLE CON LA INFORMACION DE LA TABLA SELECCIONADA EN LA BASE DE DATOS

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    
    
     public void cargarBases(java.sql.Statement stmt){
         try{
             java.sql.ResultSet tablas = stmt.executeQuery("SHOW DATABASES");
         
        int cantidad_bases = 0;
            while (tablas.next()){
                cantidad_bases++;
            }
            tablas = stmt.executeQuery("SHOW DATABASES");
            String[] bases_bd = new String[cantidad_bases];
            int t=0;
            while (tablas.next()){
                switch(tablas.getString(1)){
                    case "mysql":
                        break;
                    case "information_schema":
                        break;
                    case "phpmyadmin":
                        break;
                    case "performance_schema":
                        break;
                    default:
                      bases_bd[t] = tablas.getString(1);
                      t++;
                      break;
                }                    
                
            }
            
            DefaultComboBoxModel cmb_model_base;
            cmb_model_base = (DefaultComboBoxModel) combo_bases.getModel(); 
            // System.out.println(cantidad_bases);
            for (int i = 0; i < t; i++) {
             combo_bases.addItem(bases_bd[i]); 
               // System.out.println("base "+ i + ": " + bases_bd[i]);
            }
            combo_bases.repaint();
         }catch(Exception ex){
             System.out.println(ex);
         }
    }

    
    public void cargarTablas(java.sql.Statement stmt,String nombreBase){
        combo_tablas.removeAllItems();
         try{
             //CARGA TODAS LAS TABLAS DE LA BASE DE DATOS
             java.sql.ResultSet tablas = stmt.executeQuery("SHOW TABLES IN "+ nombreBase);
         
             int cantidad_tablas = 0;
            while (tablas.next()){
                cantidad_tablas++;
            }
            tablas = stmt.executeQuery("SHOW TABLES IN " + nombreBase);
            String[] tablas_bd = new String[cantidad_tablas];
            int t=0;
            while (tablas.next()){
                tablas_bd[t] = tablas.getString(1);
                
                t++;
            }
           
            
            DefaultComboBoxModel cmb_model;
            cmb_model = (DefaultComboBoxModel) combo_tablas.getModel(); 
            for (int i = 0; i < cantidad_tablas; i++) {
             combo_tablas.addItem(tablas_bd[i]);   
            }
            combo_tablas.repaint();
            // FIN
         }catch(Exception ex){
             System.out.println(ex);
         }
    }
    
    public void llenarTabla(java.sql.Statement stmt, String nombre_tabla){
        try{
              //LEE LA BASE DE DATOS
            java.sql.ResultSet consulta = stmt.executeQuery("SELECT * FROM " + nombre_tabla);
            java.sql.ResultSetMetaData metadata = consulta.getMetaData();
            
            
            //CUENTA COLUMNAS
            int cantidadcolumnas = metadata.getColumnCount();
            
            //LLENA COLUMNAS
            String[] nombrecolumnas = new String[cantidadcolumnas]; // carga nombre columnas
           for (int i = 0; i < cantidadcolumnas; i++) {
                nombrecolumnas[i] = metadata.getColumnLabel(i+1); // llena el array de strings                       
            }
           
           //CUENTA FILAS
           int cantidadfilas = 0;
           while(consulta.next()){
                        cantidadfilas++;                        
               }
           // System.out.println(cantidadcolumnas + " x " +cantidadfilas);
            
           
           
           //CREA OBJETO                           [cantidadcolumnas][cantidadfilas]              
                //Object[][] informacion = new Object[cantidadcolumnas+1][cantidadfilas]; //(necesita 6 para ser lineal)
                Object[][] informacion = new Object[cantidadfilas][cantidadcolumnas]; //(necesita 6 para ser lineal)
            
           //LLENA OBJETO  FIXXX THIS
           consulta = stmt.executeQuery("SELECT * FROM " + nombre_tabla);
               int w=0;
                while(consulta.next()){
                    for (int j = 0; j < cantidadcolumnas; j++) {
                        informacion[w][j] = consulta.getString(j+1);
                    }
                    w++;        
            }

            
           
           //ACTUALIZA LA TABLA     
           tablaBD.setModel(new javax.swing.table.DefaultTableModel(informacion, nombrecolumnas));
           tablaBD.updateUI();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonClear;
    private javax.swing.JButton botonConectar;
    private javax.swing.JButton botonQuery;
    private javax.swing.JComboBox<String> combo_bases;
    private javax.swing.JComboBox<String> combo_tablas;
    private javax.swing.JTextArea consolaBD;
    private javax.swing.JFrame frameLogin;
    private javax.swing.JTextField inputContrasenia;
    private javax.swing.JTextField inputQuery;
    private javax.swing.JTextField inputServidor;
    private javax.swing.JTextField inputUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel panel_Querys;
    private javax.swing.JPanel panel_Tablas;
    private javax.swing.JTabbedPane serverPane;
    private javax.swing.JTable tablaBD;
    // End of variables declaration//GEN-END:variables
}
