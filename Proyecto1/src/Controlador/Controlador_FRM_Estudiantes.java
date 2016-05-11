/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosEstudiantes;
import Vista.FRM_Estudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author tecnologiamultimedia
 */
public class Controlador_FRM_Estudiantes implements ActionListener{
    
    
    public MetodosEstudiantes metodos;
    FRM_Estudiantes mantenimientoEstudiantes;
    
    public Controlador_FRM_Estudiantes(FRM_Estudiantes mantenimientoEstudiantes)
    {
        this.mantenimientoEstudiantes=mantenimientoEstudiantes;
        metodos = new MetodosEstudiantes();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Consultar"))
        {
            if(metodos.consultarEstudiante(mantenimientoEstudiantes.devolverCedula()))
            {
                mantenimientoEstudiantes.mostrarInformacion(metodos.getArregloInformacion());
            }
            else
            {
                System.out.println("No se encontró el curso");
            }
        }
        if(e.getActionCommand().equals("Agregar"))
        {
            metodos.agregarEstudiante(mantenimientoEstudiantes.devolverInformacion());
            metodos.mostrarInformacion();
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            System.out.println("Modificar");
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
            System.out.println("Eliminar");
        }
    
    }
    
}
