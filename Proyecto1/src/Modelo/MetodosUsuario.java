/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Angelica
 */
public class MetodosUsuario {
    
    ArchivoEstudiante archivos;
    private ArrayList<Usuario> arrayUsuarios;
    private String arregloInformacionConsultada[] = new String[5];
    ArchivoUsuario archivo;

    public MetodosUsuario() {
        arrayUsuarios = new ArrayList<Usuario>();
        archivo = new ArchivoUsuario();
        arrayUsuarios = archivo.leerInformacionCompleta();
    }
    
    public void escribirEnArchivo(){
        archivo.crearArchivo();
        for (int contador = 0; contador < arrayUsuarios.size(); contador++){
            archivo.escribirInformacionEnELArhivo(arrayUsuarios.get(contador));
        }
    }
    

    public void agregarUsuario(String informacion[]) {
        
        Usuario temporal = new Usuario(informacion[0], informacion[1], informacion[2], informacion[3], informacion[4], Integer.parseInt(informacion[5]));
        arrayUsuarios.add(temporal);
        
    }

    public void mostrarInformacion() {
        for (int contador = 0; contador < arrayUsuarios.size(); contador++) {
            System.out.println(arrayUsuarios.get(contador).getInformacion());

        }

    }

    public boolean consultarUsuario(String cedula) {
        boolean existe = false;
            
        for (int contador = 0; contador < arrayUsuarios.size(); contador++) {
            if (arrayUsuarios.get(contador).getCedula().equals(cedula)) {
                
                arregloInformacionConsultada[0] = arrayUsuarios.get(contador).getNombreCompleto();
                arregloInformacionConsultada[1] = arrayUsuarios.get(contador).getNombreUsuario();
                arregloInformacionConsultada[2] = arrayUsuarios.get(contador).getContrasena();
                arregloInformacionConsultada[3] = ""+arrayUsuarios.get(contador).getTipo();
                
                existe = true;
            }

        }
        return existe;
    }

    public void modificarUsuario(String arreglo[]) {
        for (int contador = 0; contador < arrayUsuarios.size(); contador++) {
            if (arrayUsuarios.get(contador).getCedula().equals(arreglo[0])) {
                
                arrayUsuarios.get(contador).setNombreCompleto(arreglo[1]);
                arrayUsuarios.get(contador).setNombreUsuario(arreglo[2]);
                arrayUsuarios.get(contador).setContrasena(arreglo[3]);
                arrayUsuarios.get(contador).setTipo(Integer.parseInt(arreglo[4]));    
                
            }
        }
    }

    public void eliminarUsuario(String cedula) {
        for (int contador = 0; contador < arrayUsuarios.size(); contador++) {
            if (arrayUsuarios.get(contador).getCedula().equals(cedula)) {
                arrayUsuarios.remove(contador);
            }
        }
    }

    public String[] getArregloInformacion() {
        return this.arregloInformacionConsultada;
    }
    
    public ArrayList<Usuario> getArray(){
        return arrayUsuarios;
    }
    
    
    public boolean verificarLoginUsuario(String login,String clave){
        for(int contador=0;contador<arrayUsuarios.size();contador++){
            if(arrayUsuarios.get(contador).getNombreUsuario().equals(login) && arrayUsuarios.get(contador).getContrasenia().equals(clave) ){
                return true;
            }
        }
        return false;
    }
}
