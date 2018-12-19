/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Miguel
 */
public class Director {
    
    private String director;

    @Override
    public String toString() {
        return "Director{" + "director=" + director + '}';
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Director(String director) {
        this.director = director;
    }
    
    
}
