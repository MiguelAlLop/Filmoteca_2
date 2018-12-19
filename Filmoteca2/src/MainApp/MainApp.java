/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp;

import DAO.GestionDao;
import Excepciones.ExcepcionPelicula;
import Modelos.Pelicula;

import Ventanas.prueba;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miguel
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        //Instancia de gestiondao
        
        GestionDao filmo = new GestionDao();
        
         //Establcemos la conexion
        conectar(filmo);
        
        List<Pelicula> peliculas = new ArrayList();
        
        peliculas = mostrarPeliculas(filmo);
        
        
        
        prueba vp = new prueba();
        vp.setVisible(true);
        
        
        
        
    }
    
    
    public static void conectar(GestionDao filmo) throws SQLException{
        System.out.println("Conectando...");
        filmo.conectar();
        
    }
    
     public static void desconectar(GestionDao filmo) throws SQLException{
         System.out.println("Desconectando....");
        filmo.desconectar();
         System.out.println("Desconexion realizada.");
    }
     
     
     public static void insertarPelicula(GestionDao filmo,Pelicula p){
         try{
         filmo.insertatPelicula(p);
         System.out.println("Pelicula insertada correctamente");
         }catch(ExcepcionPelicula ex){
             
             System.out.println(ex.getMessage());
         }catch(SQLException exsql){
             System.out.println(exsql.getMessage());
         }
         
         
         
     }
     
      public static List<Pelicula> mostrarPeliculas(GestionDao filmo) throws SQLException{
         
        /* ArrayList allPeli = new ArrayList();
         
        filmo.todasLasPeliculas();
         
         for (Object p : allPeli) {
             System.out.println("Mostar pelis");
             System.out.println(p);
         }
             */   
        List<Pelicula> peliculas = new ArrayList();
        
         peliculas=filmo.todasLasPeliculas();
        
        
         
        return peliculas;
     }
    
}
