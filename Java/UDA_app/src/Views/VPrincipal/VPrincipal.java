/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.VPrincipal;

import control.controlador;
import java.awt.Color;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class VPrincipal extends javax.swing.JFrame {
    static boolean modoayuda = controlador.modoayuda;
    /**
     * Creates new form VPrincipal
     */
    public VPrincipal(){
        initComponents();
        //Vamos a llamar a una función que oculte las opciones para el administrador y para un usuario loggeado
        inicializarVentana();
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfMensaje1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfMensaje2 = new javax.swing.JLabel();
        tfMensaje3 = new javax.swing.JLabel();
        tfMensaje4 = new javax.swing.JLabel();
        Ayuda = new javax.swing.JLabel();
        TextoAyuda2 = new javax.swing.JLabel();
        TextoAyuda1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuOpciones = new javax.swing.JMenu();
        jmLogin = new javax.swing.JMenuItem();
        jmCs = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jmHerramientas = new javax.swing.JMenu();
        jmRegistrar = new javax.swing.JMenu();
        jmCUsuario = new javax.swing.JMenuItem();
        jmCJugador = new javax.swing.JMenuItem();
        jmCDueno = new javax.swing.JMenuItem();
        jmCEquipo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmCLiga = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmCAdmin = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmModUsu = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jmModDue = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jmEliminar = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jmListar = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem21 = new javax.swing.JMenuItem();
        jmPuntuacion = new javax.swing.JMenu();
        jmResultados = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor e-sports");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tfMensaje1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        tfMensaje1.setForeground(new java.awt.Color(255, 0, 0));
        tfMensaje1.setText("Por favor, inicie sesión. Opciones>>Login.");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/VPrincipal/Logo_grande.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Bienvenido/a al gestor de e-sports");

        tfMensaje2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        tfMensaje2.setForeground(new java.awt.Color(255, 0, 0));
        tfMensaje2.setText("o");

        tfMensaje3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        tfMensaje3.setForeground(new java.awt.Color(255, 0, 0));
        tfMensaje3.setText("haz click");

        tfMensaje4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        tfMensaje4.setForeground(new java.awt.Color(0, 0, 255));
        tfMensaje4.setText("aquí");
        tfMensaje4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfMensaje4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfMensaje4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tfMensaje4MouseExited(evt);
            }
        });

        Ayuda.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        Ayuda.setForeground(new java.awt.Color(0, 0, 0));
        Ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/VPrincipal/b_help.png"))); // NOI18N
        Ayuda.setText("Ayuda");
        Ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AyudaMouseClicked(evt);
            }
        });

        TextoAyuda2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        TextoAyuda2.setText("Texto ayuda");

        TextoAyuda1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        TextoAyuda1.setText("Texto ayuda");

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 2, 2, new java.awt.Color(153, 153, 153)));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/VPrincipal/Gif.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ayuda)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfMensaje1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(156, 156, 156)
                                    .addComponent(tfMensaje2)
                                    .addGap(31, 31, 31))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(105, 105, 105)
                                    .addComponent(tfMensaje3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfMensaje4)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextoAyuda2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoAyuda1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfMensaje1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfMensaje2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMensaje4)
                    .addComponent(tfMensaje3))
                .addGap(70, 70, 70)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(TextoAyuda1)
                .addGap(18, 18, 18)
                .addComponent(TextoAyuda2)
                .addGap(68, 68, 68)
                .addComponent(Ayuda)
                .addGap(8, 8, 8))
        );

        MenuOpciones.setText("Opciones");
        MenuOpciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuOpcionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuOpcionesMouseExited(evt);
            }
        });

        jmLogin.setText("Login");
        jmLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmLoginActionPerformed(evt);
            }
        });
        MenuOpciones.add(jmLogin);

        jmCs.setText("Cerrar sesión");
        jmCs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCsActionPerformed(evt);
            }
        });
        MenuOpciones.add(jmCs);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        MenuOpciones.add(jMenuItem2);

        jMenuBar1.add(MenuOpciones);

        jmHerramientas.setText("Herramientas");

        jmRegistrar.setText("Registrar");

        jmCUsuario.setText("Usuario");
        jmCUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCUsuarioActionPerformed(evt);
            }
        });
        jmRegistrar.add(jmCUsuario);

        jmCJugador.setText("Jugador");
        jmCJugador.setToolTipText("");
        jmCJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCJugadorActionPerformed(evt);
            }
        });
        jmRegistrar.add(jmCJugador);

        jmCDueno.setText("Dueño");
        jmRegistrar.add(jmCDueno);

        jmCEquipo.setText("Equipo");
        jmRegistrar.add(jmCEquipo);
        jmRegistrar.add(jSeparator1);

        jmCLiga.setText("Liga");
        jmCLiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCLigaActionPerformed(evt);
            }
        });
        jmRegistrar.add(jmCLiga);
        jmRegistrar.add(jSeparator2);

        jmCAdmin.setText("Aministrador");
        jmRegistrar.add(jmCAdmin);

        jmHerramientas.add(jmRegistrar);

        jMenu3.setText("Modificar");

        jmModUsu.setText("Usuario");
        jMenu3.add(jmModUsu);

        jMenuItem12.setText("Jugador");
        jMenu3.add(jMenuItem12);

        jmModDue.setText("Dueño");
        jMenu3.add(jmModDue);

        jMenuItem7.setText("Equipo");
        jMenu3.add(jMenuItem7);

        jmHerramientas.add(jMenu3);

        jmEliminar.setText("Eliminar");

        jMenuItem8.setText("Usuario");
        jmEliminar.add(jMenuItem8);

        jMenuItem14.setText("Jugador");
        jmEliminar.add(jMenuItem14);

        jMenuItem15.setText("Dueño");
        jmEliminar.add(jMenuItem15);

        jMenuItem16.setText("Equipo");
        jmEliminar.add(jMenuItem16);

        jmHerramientas.add(jmEliminar);

        jmListar.setText("Listar");

        jMenuItem17.setText("Usuarios");
        jmListar.add(jMenuItem17);

        jMenuItem18.setText("Jugadores");
        jmListar.add(jMenuItem18);

        jMenuItem19.setText("Dueños");
        jMenuItem19.setToolTipText("");
        jmListar.add(jMenuItem19);

        jMenuItem20.setText("Equipos");
        jmListar.add(jMenuItem20);
        jmListar.add(jSeparator4);

        jMenuItem22.setText("Ligas");
        jmListar.add(jMenuItem22);

        jMenuItem23.setText("Partidos");
        jmListar.add(jMenuItem23);

        jMenuItem24.setText("Jornadas");
        jmListar.add(jMenuItem24);
        jmListar.add(jSeparator3);

        jMenuItem21.setText("Administradores");
        jmListar.add(jMenuItem21);

        jmHerramientas.add(jmListar);

        jMenuBar1.add(jmHerramientas);

        jmPuntuacion.setText("Gestión de puntuación");
        jMenuBar1.add(jmPuntuacion);

        jmResultados.setText("Resultados y datos");
        jmResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jmResultadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jmResultadosMouseExited(evt);
            }
        });
        jMenuBar1.add(jmResultados);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmLoginActionPerformed
        //Funcion que abre la ventana login
        control.controlador.toVLogin(this);
    }//GEN-LAST:event_jmLoginActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Cuando se abre la ventana 
        
    }//GEN-LAST:event_formWindowOpened

    private void tfMensaje4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfMensaje4MouseClicked
        controlador.toVLogin(this);
    }//GEN-LAST:event_tfMensaje4MouseClicked

    private void AyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AyudaMouseClicked
        //Muestra la caja de ayuda o la oculta si se desactiva la ayuda
        if (modoayuda == false) { 
            modoayuda = true;
            Ayuda.setText("Cerrar ayuda");
            controlador.JDInfo(this, true, "Modo ayuda activado, sitúa el ratón sobre", "las opciones que quieras saber qué hacen");
        }else{
            modoayuda = false;
            controlador.JDInfo(this, true, "Modo ayuda desactivado");
            Ayuda.setText("Ayuda");
        }
        System.out.println("Modo ayuda: " + modoayuda);
    }//GEN-LAST:event_AyudaMouseClicked

    private void MenuOpcionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuOpcionesMouseEntered
        //Ayuda opciones
        if(modoayuda)
        {
            TextoAyuda1.setText("Aquí podrás hacer login, cerrar sesión o");
            TextoAyuda2.setText("salir de la app");
        }    
    }//GEN-LAST:event_MenuOpcionesMouseEntered

    private void MenuOpcionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuOpcionesMouseExited
        //Borra ayuda de opciones
        TextoAyuda1.setText(" ");
        TextoAyuda2.setText(" ");
    }//GEN-LAST:event_MenuOpcionesMouseExited

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //Cerrar todo
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jmResultadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmResultadosMouseEntered
        //Ayuda resultados
        if(modoayuda)
        {
            TextoAyuda1.setText("Aquí podrás consultar resultados de partidos y ver");
            TextoAyuda2.setText("futuros partidos en detalle");    
        }    
    }//GEN-LAST:event_jmResultadosMouseEntered

    private void jmResultadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmResultadosMouseExited
        //Borra ayuda de resultados
        TextoAyuda1.setText(" ");
        TextoAyuda2.setText(" ");
    }//GEN-LAST:event_jmResultadosMouseExited

    private void tfMensaje4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfMensaje4MouseEntered
        if(modoayuda)   
            TextoAyuda1.setText("Haciendo click aquí podras hacer login");
    }//GEN-LAST:event_tfMensaje4MouseEntered

    private void tfMensaje4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfMensaje4MouseExited
        TextoAyuda1.setText(" ");
        
    }//GEN-LAST:event_tfMensaje4MouseExited

    private void jmCsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCsActionPerformed
        controlador.JDInfo(this, true, "Se va a cerrar la sesión...");
        controlador.cerrarSesion();
        controlador.toVPrincipal(this);
    }//GEN-LAST:event_jmCsActionPerformed

    private void jmCLigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCLigaActionPerformed
        controlador.toJFLiga(this);
    }//GEN-LAST:event_jmCLigaActionPerformed

    private void jmCUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCUsuarioActionPerformed
       controlador.toVRegistro(this, 1, "Nuevo Usuario", 1);
    }//GEN-LAST:event_jmCUsuarioActionPerformed

    private void jmCJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCJugadorActionPerformed
        controlador.toVRegistro(this, 2, "Nuevo Jugador", 1);
    }//GEN-LAST:event_jmCJugadorActionPerformed
    
    public void inicializarVentana(){
        try
        {
            TextoAyuda1.setText(" ");
            TextoAyuda2.setText(" ");
            setLocationRelativeTo(null);
            TextoAyuda2.setText(" ");
            //Esta opción nos va a asignar un favicon a nusetro proyecto
            Image i = ImageIO.read(getClass().getResource("/Views/VPrincipal/logo_u_favicon.png"));
            setIconImage(i);
            
            if(controlador.usu == null)
            {
                jmCs.setVisible(false);
                jmHerramientas.setVisible(false);
                jmPuntuacion.setVisible(false);
                jmResultados.setVisible(false);
                tfMensaje1.setText("Por favor, inicie sesión. Opciones>>Login.");
                tfMensaje2.setText("o");
                tfMensaje1.setForeground(Color.red);
                tfMensaje2.setForeground(Color.red);
                tfMensaje3.setText("haz click");
                tfMensaje4.setText("aquí");
            }
            else
            {
                switch(controlador.usu.getPersonaDni().getTipoPersona())
                {
                    case "admin": 
                        setInicioSesion();
                    break;
                    
                    case "usuario":
                        setInicioSesion();
                        jmHerramientas.setVisible(false);
                        jmPuntuacion.setVisible(false);
                    break;
                
                    case "dueno":
                        setInicioSesion();
                        jmRegistrar.setVisible(false);
                        jmListar.setVisible(false);
                        jmEliminar.setVisible(false);
                        jmModUsu.setVisible(false);
                        jmModDue.setVisible(false);
                        jmPuntuacion.setVisible(false);
                    break;
                                
            }
            }    
            
        }
        catch(Exception e){
            controlador.JDError(this, true, "Error en ventana principal");
        }
        
    }
    
    public void setInicioSesion(){
        tfMensaje1.setText("             Bienvenido/a de nuevo");
        tfMensaje2.setText(controlador.usu.getPersonaDni().getNombre());
        tfMensaje1.setForeground(new Color(153,153,153));
        tfMensaje2.setForeground(new Color(153,153,153));
        tfMensaje3.setText(" ");
        tfMensaje4.setText(" ");
        jmLogin.setVisible(false);
    }
    
    
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
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ayuda;
    private javax.swing.JMenu MenuOpciones;
    private javax.swing.JLabel TextoAyuda1;
    private javax.swing.JLabel TextoAyuda2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenuItem jmCAdmin;
    private javax.swing.JMenuItem jmCDueno;
    private javax.swing.JMenuItem jmCEquipo;
    private javax.swing.JMenuItem jmCJugador;
    private javax.swing.JMenuItem jmCLiga;
    private javax.swing.JMenuItem jmCUsuario;
    private javax.swing.JMenuItem jmCs;
    private javax.swing.JMenu jmEliminar;
    private javax.swing.JMenu jmHerramientas;
    private javax.swing.JMenu jmListar;
    private javax.swing.JMenuItem jmLogin;
    private javax.swing.JMenuItem jmModDue;
    private javax.swing.JMenuItem jmModUsu;
    private javax.swing.JMenu jmPuntuacion;
    private javax.swing.JMenu jmRegistrar;
    private javax.swing.JMenu jmResultados;
    private javax.swing.JLabel tfMensaje1;
    private javax.swing.JLabel tfMensaje2;
    private javax.swing.JLabel tfMensaje3;
    private javax.swing.JLabel tfMensaje4;
    // End of variables declaration//GEN-END:variables
}
