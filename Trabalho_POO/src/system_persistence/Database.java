/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system_persistence;

import system_model.Departamento;
import system_model.Funcionario;
import system_model.Universidade;

/**
 *
 * @author maayk
 */
public class Database {
    
    public static final int MAX = 10000;
    /*private Universidade[] vetUniversities;
    private int countUniversity;*/
    private Funcionario[] vetFunctionaries;
    private int countFunctionaries;
    private Departamento[] vetDepartments;
    private int countDepartments;
    
    private Database() {
        /*this.vetUniversities = new Universidade[MAX];
        this.countUniversity = 0;*/
        this.vetFunctionaries = new Funcionario[MAX];
        this.countFunctionaries = 0;
        this.vetDepartments = new Departamento[MAX];
        this.countDepartments = 0;
        
    }
    
    public void addFunctionaries(Funcionario f) {
        if (countFunctionaries < MAX) {
            vetFunctionaries[countFunctionaries] = f;
            countFunctionaries++;
        }
        
    }
    
    /*public void addUniversities(Universidade u) {
        if (countUniversity < MAX) {
            vetUniversities[countUniversity] = u;
            countUniversity++;
        }
        
    }*/
    
    public void addDepartments(Departamento d) {
        if (countDepartments < MAX) {
            vetDepartments[countDepartments] = d;
            countDepartments++;
        }
        
    }
    
    public Funcionario searchCode(String code) {
        for (int i = 0; i < countFunctionaries; i++) {
            if (vetFunctionaries[i].getCodigo().equals(code)) {
                return vetFunctionaries[i];
            }
        }
        return null;
    }
    
    public Funcionario searchName(String name) {
        for (int i = 0; i < countFunctionaries; i++) {
            if (vetFunctionaries[i].getNome().equals(name)) {
                return vetFunctionaries[i];
            }
        }
        return null;
    }
    
    public Funcionario[] funcionarios() throws CloneNotSupportedException{
        Funcionario funcionarios[] = new Funcionario[countFunctionaries];
        for(int i=0; i<countFunctionaries;i++){
            funcionarios[i] = vetFunctionaries[i].clone();
        }
        return funcionarios;
    }
    
    public Departamento[] departamentos() throws CloneNotSupportedException{
        Departamento departamentos[] = new Departamento[countDepartments];
        for(int i=0; i<countDepartments;i++){
            departamentos[i] = vetDepartments[i].clone();
        }
        return departamentos;
    }
    
    
}


