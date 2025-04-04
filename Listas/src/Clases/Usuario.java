/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Biblioteca
 */
public class Usuario {
    
    private String nombre;
    private String nickname;
    private String clave;
    
    ArrayList<String> usuarios = new ArrayList();
    Map<String,String> usuariosmap = new HashMap();
    
    public boolean guardarUsuarioList(String pnombre, String pnickname, String pclave){
        
        usuarios.add(pnombre);
        usuarios.add(pnickname);
        usuarios.add(pclave);
        
        return true;
    }
    
    public ArrayList<String> listarUsuariosList(){
        
        return usuarios;
    }
    
    public Map<String,String> listarUsuariosMap(){
        
        return usuariosmap;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname the nickname to set
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    
}
