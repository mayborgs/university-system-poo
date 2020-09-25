/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system_model;

/**
 * cuidado
 *
 * @author maayk
 */
public class Tecnico extends Funcionario {

    private String funcao;

    @Override
    public double calcularSalario(String nvl) {
        if (TEC1.equals(nvl)) {
            return ((SALARIO_BASE * 0.1) + SALARIO_BASE);
        }
        if (TEC2.equals(nvl)) {
            return ((SALARIO_BASE * 0.2) + SALARIO_BASE);
        }
        return 0;
        /*adicionar mensagem depois talvez*/
    }

    public Tecnico(String funcao, String nome, String codigo, String nivel) {
        super(codigo, nome, nivel);
        this.funcao = funcao;
        this.salario = calcularSalario(nivel);

    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
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
