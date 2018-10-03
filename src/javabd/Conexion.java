
package javabd;

public class Conexion {

    private String url, nombre, clave;
    
    public Conexion(){
        
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public java.sql.Connection conectar(){
        java.sql.Connection conec = null;
        
        try{
           conec = java.sql.DriverManager.getConnection(url, nombre, clave);
        }catch( java.sql.SQLException ex){
            System.out.println(ex);
        }
        return conec;
    }
    
}
