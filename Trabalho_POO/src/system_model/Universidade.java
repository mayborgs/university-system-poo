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
    private Departamento d;

    public Universidade(String name) {
        this.nome = name;
        this.database = Database.getInstance();
    }

    public void addDepartments(String code, String name) {
        this.d = new Departamento(code, name);
        database.addDepartments(d);

    }

    public void addEfetivo(String area, String nome, String codigo, String nivel, String titulacao, String codD, String nomeD) {
        Departamento d = database.searchDepartments(codD);
        d.addEfetivo(area, nome, codigo, nivel, titulacao);

    }

    public void addSubstituto(int cargahoraria, String nome, String codigo, String nivel, String titulacao, String codD, String nomeD) {
        Departamento d = database.searchDepartments(codD);
        d.addSubstituto(cargahoraria, nome, codigo, nivel, titulacao);
    }

    public void addTecnico(String funcao, String nome, String codigo, double salario, String nivel, String codD, String nomeD) {
        Departamento d = database.searchDepartments(codD);
        d.addTecnico(funcao, nome, codigo, salario, nivel);

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
