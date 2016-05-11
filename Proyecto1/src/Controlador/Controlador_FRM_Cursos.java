/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosCursos;
import Vista.FRM_MantenimientoCursos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author tecnologiamultimedia
 */
public class Controlador_FRM_Cursos implements ActionListener{
    
    FRM_MantenimientoCursos frm_MantenimientoCursos;
    public MetodosCursos metodos;
    public Controlador_FRM_Cursos(FRM_MantenimientoCursos frm_MantenimientoCursos)
    {
        this.frm_MantenimientoCursos= frm_MantenimientoCursos;
        metodos = new MetodosCursos();
    } 
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Agregar"))
        {
            metodos.agregarCurso(frm_MantenimientoCursos.devolverInformacion());   
        }
        if(e.getActionCommand().equals("Consultar"))
        {
            if(metodos.consultarCurso(frm_MantenimientoCursos.devolverSigla()))
            {
                frm_MantenimientoCursos.mostrarInformacion(metodos.getArregloInformacion());
            }
            else
            {
                System.out.println("No se encontró el curso");
            }
        }
    }
}
