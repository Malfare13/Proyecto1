/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FRM_Cursos;
import Vista.FRM_Estudiantes;
import Vista.FRM_Matricula;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Angelica
 */
public class Controlador_FRM_MenuPrincipal implements ActionListener{
    
    FRM_Estudiantes ventanaEstudiantes;
    FRM_Cursos ventanaCursos;
    FRM_Matricula ventanaMatricula;
    
    public Controlador_FRM_MenuPrincipal()
    {
        ventanaEstudiantes=new FRM_Estudiantes();
        ventanaCursos=new FRM_Cursos();
        ventanaMatricula= new FRM_Matricula(ventanaEstudiantes,ventanaCursos);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Salir"))
        {
            System.exit(0);        
        }
        if(e.getActionCommand().equals("Estudiantes"))
        {
            this.ventanaEstudiantes.setVisible(true);
            this.ventanaEstudiantes.setLocationRelativeTo(null);
          
            
        }
        if(e.getActionCommand().equals("Cursos"))
        {
            this.ventanaCursos.setVisible(true);
            this.ventanaCursos.setLocationRelativeTo(null);
        }
        if(e.getActionCommand().equals("Matricula"))
        {
            this.ventanaMatricula.setVisible(true);
            this.ventanaMatricula.setLocationRelativeTo(null);
            this.ventanaMatricula.colocarCodigo();
        }
    
    }
    
}
