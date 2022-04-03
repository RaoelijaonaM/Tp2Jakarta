/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.mitia.jakartaproject.jsf;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Raoel
 */
@Named(value = "mbean")
@RequestScoped
public class ExoMBean {
    private int nombre;
    public int getNombre(){
        return nombre;
    }
    public void setNombre(int nombre){
        this.nombre = nombre;
    }
    /**
     * Creates a new instance of Bean
     */
    public ExoMBean() {
    }
    public List<Integer> getNombresSuivants(){
        int nb = 5;
        List<Integer> l = new ArrayList<>(nb);
        for(int i = nombre; i< nombre+5; i++){
            l.add(i);
        }
        return l;
    }
    public String afficher(){
        return "affichage_4?nb="+ nombre+"&amp;faces-redirect=true";
    }
}
