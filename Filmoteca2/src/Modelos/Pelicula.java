
package Modelos;

/**
 *
 * @author Miguel
 */
public class Pelicula {
    
    private String titulo;
    private String director;
    private String pais;
    private String duracion;
    private String genero;
    
    
    public Pelicula(){}

    public Pelicula(String titulo, String director, String pais, String duracion, String genero) {
        this.titulo = titulo;
        this.director = director;
        this.pais = pais;
        this.duracion = duracion;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public String getPais() {
        return pais;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", pais=" + pais + ", duracion=" + duracion + ", genero=" + genero + '}';
    }
    
    
    
}
