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
public class Substituto extends Docente {

    private int cargahoraria;

    @Override
    public double calcularSalario(String nvl) {
        if (SUB1.equals(nvl)) {
            return ((SALARIO_BASE * 0.05) + SALARIO_BASE);
        }
        if (SUB2.equals(nvl)) {
        } else {
            return ((SALARIO_BASE * 0.1) + SALARIO_BASE);
        }
        return 0;
        /*adicionar mensagem depois talvez*/
    }

    public Substituto() {

    }

    public Substituto(int cargahoraria, String area, String nome, String codigo, double salario, String nivel, String titulacao) {
        super(titulacao, nome, codigo, salario, nivel);
        this.cargahoraria = cargahoraria;
    }

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
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
