/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.MetodosUsuario;
import vista.FRM_Login;
import vista.FRM_MantenimientoUsuarios;
import vista.FRM_VentanaPrincipal;

/**
 *
 * @author Angelica
 */
public class Controlador_FRM_Login implements ActionListener{
    
    FRM_Login frm_Login;
    MetodosUsuario metodosUsuario;
    FRM_VentanaPrincipal frmVentanaPrincipal;
    FRM_MantenimientoUsuarios frm_MantenimientoUsuarios;
    
    public Controlador_FRM_Login(FRM_Login frm_Login, FRM_MantenimientoUsuarios frm_MantenimientoUsuarios, FRM_VentanaPrincipal frmVentanaPrincipal) {
        this.frm_Login = frm_Login;
        this.metodosUsuario = metodosUsuario;
        this.frm_MantenimientoUsuarios = frm_MantenimientoUsuarios;
        this.frmVentanaPrincipal = frmVentanaPrincipal;
    }

    public Controlador_FRM_Login(FRM_Login aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Ingresar")){
            System.out.print("Ingresar");
            if(frm_MantenimientoUsuarios.controlador.metodos.verificarLoginUsuario(frm_Login.devolverNombreUsuario(), frm_Login.devolverContrasenia())){
                frmVentanaPrincipal.setVisible(true);
            }
            else{
                frm_MantenimientoUsuarios.mensaje("El usuario no se encuentra  registrado.");
                frm_MantenimientoUsuarios.setVisible(true);
            }
        }
    }
    
}
