
package models;

import java.sql.SQLException;
import java.util.HashMap;
import utils.MySQL;


public class MeasurementUnity extends MySQL {
    private int id_unidad_medida;
    private String nombre;
    
    public MeasurementUnity(){
        
    }
    
    public MeasurementUnity(int id_unidad_medida, String nombre){
        this.id_unidad_medida = id_unidad_medida;
        this.nombre = nombre;
    }
    
    public HashMap<String, Integer> getUList(){
        HashMap<String, Integer> mapa = new HashMap<String, Integer>();
        
        String query = "SELECT * FROM unidad_medida;";
        try {
            //Creamos un juego de registros para resultados de consultas
            this.rs = this.s.executeQuery(query);
            //Recorremos los resultados

            while(this.rs.next()){
                Category s = new Category(rs.getInt("id_unidad_medida"), rs.getString("nombre"));
                
                 mapa.put(rs.getString("nombre"), rs.getInt("id_unidad_medida"));
            }
        
        } catch(SQLException ex){
            
        }
        return mapa;
    }
    
}
