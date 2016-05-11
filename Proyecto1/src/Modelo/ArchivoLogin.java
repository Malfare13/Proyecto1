/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Angelica
 */
public class ArchivoLogin {
    ObjectOutputStream archivoSalida;
    ObjectInputStream archivoEntrada;
    
    public ArchivoLogin(){
    
    }
    
    
    public void crearArchivo(){
        try{
        archivoSalida = new ObjectOutputStream(new FileOutputStream("login.dato"));
        System.out.println("Archivo creado");
        }
        catch(Exception e){
            System.out.println("Error al crear el archivo: "+e);
        }
    }
    
    public void escribirInformacionEnELArhivo(Login login){
        try{
            archivoSalida.writeObject(login);
            System.out.println("Se escribió la información de forma correcta");
        }
        catch(Exception e){
            System.out.println("Error al escribir en el archivo");
        }
    
    }
    
    public String leerInformacion(){
        Login login = null;
        try{
            archivoEntrada  = new ObjectInputStream(new FileInputStream("login.dato"));
            login = (Login)archivoEntrada.readObject();
        }
        catch(Exception e){
            System.out.println("Error al leer información del archivo");
        }
        return login.getInformacion();
    }
    
     public ArrayList<Login> leerInformacionCompleta(){
        
        ArrayList <Login> arrayLogin = new ArrayList <Login>();
       
        try{
            archivoEntrada  = new ObjectInputStream(new FileInputStream("login.dato"));
            while(true){
            arrayLogin.add((Login)archivoEntrada.readObject());
            }
        }
        catch(Exception e){
            System.out.println("Fin del archivo"+e);
        }
        return arrayLogin;
    }
}
