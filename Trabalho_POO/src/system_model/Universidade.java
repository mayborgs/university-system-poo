/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system_model;
import system_persistence.Database;
/**
 *
 * @author maayk
 */
public class Universidade {

    private String nome;
    private static Database database;

    public Universidade(String name) {
        this.nome = name;
    }

    public void addDepartments(String code, String name){
        Departamento d = new Departamento(code,name);
        database.addDepartments(d);
           
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
