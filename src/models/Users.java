/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.MySQL;

/**
 *
 * @author Frankie
 */
public class Users extends MySQL {
    private int id_usuario;
    private int id_empleado;
    private String apodo;
    private String clave;
    private int vigente;
    
    public Users(){
        super();
    }
    
    //Método para crear un usuario
    
    //Método para consultar por un usuario
    /**
     * Obtiene la existencia de un usuario y su clave
     * @param user Correo del usuario
     * @param pass Clave del usuario
     * @return 
     */
    public boolean login(String user, String pass){
        String query = "select * from usuario ";
        query +="where apodo = '"+user+"' ";
        query +="and clave = '"+pass+"'";
        System.out.println(query);
        try {
           this.rs = this.s.executeQuery(query);
           return rs.next();
        }catch(SQLException ex){
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //Método para consultar todos los usuarios
     public String getUsers(){
        String msje = "";
        try {
            //Creamos un juego de registros para resultados de consultas
        this.rs = this.s.executeQuery("select * from usuario");
        //Recorremos los resultados
        
        while(this.rs.next()){
             //msje += rs.getInt("id_usuario")+" "+rs.getString("correo");
        }
        
        } catch(SQLException ex){
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return msje;
    }
    //Método para editar un usuario;
    
}
