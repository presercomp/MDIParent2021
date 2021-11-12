package models;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import utils.MySQL;

public class Enterprice  extends MySQL {
    private int rut;
    private String razon_social;
    private String giro;
    
    public Enterprice(){
        
    }
    
    public Enterprice(int rut, String razonSocial, String giro){
        this.rut = rut;
        this.razon_social = razonSocial;
        this.giro = giro;
    }
    
    public int save() {
        try {
            String query = "insert into empresa values (";
            query += this.rut+", ";
            query += "'"+this.razon_social+"', ";
            query += "'"+this.giro+"');";
            this.s.executeUpdate(query);
            return 1;
        }catch(SQLException ex){
            return -1;
        }
    }
    
    public int edit(){
        try {
            String query = "UPDATE empresa SET ";
            query += "razon_social= '"+this.razon_social+"', ";
            query += "giro = '"+this.giro+"' WHERE rut_empresa = "+this.rut+";";
            this.s.executeUpdate(query);
            return 1;
        }catch(SQLException ex){
            return -1;
        }
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }
    
    public void getEnterprice(){     
        String query = "SELECT * FROM empresa;";
        try {
            //Creamos un juego de registros para resultados de consultas
            this.rs = this.s.executeQuery(query);
            //Recorremos los resultados

            while(this.rs.next()){
                this.rut = rs.getInt("rut_empresa");
                this.razon_social = rs.getString("razon_social");
                this.giro = rs.getString("giro");;
            }
        
        } catch(SQLException ex){
            
        }
    }
}
