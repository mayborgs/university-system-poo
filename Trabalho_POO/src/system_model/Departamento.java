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
public class Departamento {

    private String codigo;
    private String nome;
    private static Database database;

    public void addEfetivo(String area, String nome, String codigo, double salario, String nivel, String titulacao) {
        Efetivo e = new Efetivo(area, nome, codigo, salario, nivel, titulacao);
        database.addFunctionaries(e);
    }

    public void addSubstituto(int cargahoraria, String area, String nome, String codigo, double salario, String nivel, String titulacao) {
        Substituto s = new Substituto(cargahoraria, area, nome, codigo, salario, nivel, titulacao);
        database.addFunctionaries(s);
    }

    public void addTecnico(String funcao, String nome, String codigo, double salario, String nivel) {
        Tecnico t = new Tecnico(funcao, nome, codigo, salario, nivel);
        database.addFunctionaries(t);
    }

    public Departamento(String code, String name) {
        this.codigo = code;
        this.nome = name;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
