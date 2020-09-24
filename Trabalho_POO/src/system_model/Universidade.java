/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system_model;

import system_persistence.Database;
import java.util.logging.Level;
import java.util.logging.Logger;
import static system_persistence.Database.MAX;
import system_model.Tecnico;

/**
 *
 * @author maayk
 */
public class Universidade {

    private String nome;
    private static Database database;
    public Departamento d;

    public Universidade(String name) {
        this.nome = name;
        this.database = Database.getInstance();
    }
    
    public void addDepartments(String code, String name) {
        this.d = new Departamento(code, name);
        database.addDepartments(d);

    }
    
    /*public void addUniversities(String name){
        Universidade d = new Universidade(name);
        database.addUniversities(d);
        }*/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
