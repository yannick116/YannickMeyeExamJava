/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import model.Classe;
import model.Detail;
import model.Professeur;

/**
 *
 * @author hp
 */
public class GestionProf implements IGestionProf {
    ArrayList<Professeur> bd = new ArrayList<>();

    @Override
    public Professeur rechercherProf(String numero) {
        for(Professeur p: bd){
            if(p.getNumero().compareTo(numero) == 0){
                return p;
            }
        }
        return null;
    }

    @Override
    public void addClasse(Professeur p,Classe c,String annee) {
        Detail detail = new Detail(annee,p,c);
        p.getDetails().add(detail);
    }

   
    
    public ArrayList<Professeur> listerProfs(){
        return bd;
    }
    public void addProf(Professeur p){
         bd.add(p);
    }

    public void addProfesseur(Professeur p1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
