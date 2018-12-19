/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Excepciones.ExcepcionPelicula;
import Modelos.Pelicula;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miguel
 */
public class GestionDao {
    
     public boolean existePelicula(Pelicula p) throws SQLException{
        
        //Creamos la consulta sql para recibir todos los titulos de las peliculas
        String select="select * from pelicula where titulo = '"+p.getTitulo()+"'";
        
        Statement st = conexion.createStatement();
        ResultSet rs = st.executeQuery(select);
        
        boolean existe = false;
        
       if(rs.next()){
           existe=true;
           
       }
        rs.close();
        st.close();
        return existe;
    }
    
    
     public void insertatPelicula(Pelicula p) throws SQLException, ExcepcionPelicula{
        
        if(!existePelicula(p)){
            
            throw new ExcepcionPelicula("Error: la pelicula no existe");
            
        }else{
            
            String insert = "Insert into pelicula(titulo,director,pais,duracion,genero) values (?,?,?,?,?)";
            
            PreparedStatement ps = conexion.prepareStatement(insert);
            ps.setString(1,p.getTitulo());
            ps.setString(2,p.getDirector());
            ps.setString(3,p.getPais());
            ps.setString(4,p.getDuracion());
            ps.setString(5, p.getGenero());
            
            ps.executeUpdate();
            
            ps.close();
        }
        
        
    }
    
    
    
    
    public List<Pelicula> todasLasPeliculas() throws SQLException{
        
      
      List<Pelicula> peliculas = new ArrayList();
      String select = "Select * from pelicula";
      Statement st = conexion.createStatement();
      ResultSet rs = st.executeQuery(select);    
          
          
          while (rs.next()){
              
              Pelicula p=new Pelicula();
              p.setTitulo(rs.getString("titulo"));
              p.setDirector(rs.getString("director"));
              p.setPais(rs.getString("pais"));
              p.setDuracion(rs.getString("duracion"));
              p.setGenero(rs.getString("genero"));
              peliculas.add(p);
          }
          rs.close();
          st.close();
          
          
      return peliculas;
    }   
    
    
    
    
    
    
    
    
    
    
    /**
     * Primero crear la conexion
     */
    
    //Creamos la conexion
    Connection conexion;
    


/**
 * Funcion para conectar a la bbdd
     * @throws java.sql.SQLException
 */
public void conectar() throws SQLException{

    //Definimos la url donde se va a conecrar nuestro driver
    
String url = "jdbc:mysql://localhost:3306/filmoteca";

//ponemos el user y el pass

String user= "root";
String pass="";

//Realizamos la conexion
conexion=DriverManager.getConnection(url, user, pass);

}



/**
 * Funcion para desconectar la bbdd
     * @throws java.sql.SQLException
 */
public void desconectar() throws SQLException{
if(conexion != null){
    conexion.close();
}

}






}
