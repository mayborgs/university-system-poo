/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system_model;

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
    protected static final double SALARIO_BASE = 1500.00;
    protected String codigo;
    protected String nome;
    protected double salario;
    protected String nivel;

    public abstract double calcularSalario(String nvl);

    public Funcionario() {

    }

    public Funcionario(String codigo, String nome, double salario, String nivel) {
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
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

}
