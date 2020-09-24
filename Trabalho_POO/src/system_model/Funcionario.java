/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system_model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maayk
 */
public abstract class Funcionario implements Cloneable {

    protected static final String TEC1 = "T1";
    protected static final String TEC2 = "T2";
    protected static final String EFE1 = "D1";
    protected static final String EFE2 = "D2";
    protected static final String EFE3 = "D3";
    protected static final String SUB1 = "S1";
    protected static final String SUB2 = "S2";
    protected static final String FUNTEC1 = "Acessor";
    protected static final String FUNTEC2 = "Laboratório";
    protected static final String FUNTEC3 = "Secretário";
    protected static final String TITDOC1 = "Graduação";
    protected static final String TITDOC2 = "Mestrado";
    protected static final String TITDOC3 = "Doutorado";
    protected static final String TITDOC4 = "Livre-Docente";
    protected static final String TITDOC5 = "Titular";
    protected static final String DOCEFET1 = "Biológicas";
    protected static final String DOCEFET2 = "Exatas";
    protected static final String DOCEFET3 = "Humanas";
    protected static final String DOCEFET4 = "Saúde";
    protected static final int CARGASUB1 = 12;
    protected static final int CARGASUB2 = 24;
    protected static final double SALARIO_BASE = 1500.00;
    public Efetivo e;
    public Substituto s;
    public Tecnico t;
   
    protected String codigo;
    protected String nome;
    protected double salario;
    protected String nivel;

    public abstract double calcularSalario(String nvl);

    public Funcionario(String codigo, String nome, String nivel) {
        this.codigo = codigo;
        this.nome = nome;
        this.nivel = nivel;

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public Funcionario clone(){
        try {
            return (Funcionario) super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Funcionario.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
