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
public class Efetivo extends Docente {

    private String area;

    @Override
    public double calcularSalario(String nvl) {
        if (EFE1.equals(nvl)) {
            double i = ((SALARIO_BASE * 0.05) + SALARIO_BASE);
            return i + (i * 0.05);
        }
        if (EFE2.equals(nvl)) {
            double i = ((SALARIO_BASE * 0.1) + SALARIO_BASE);
            return i + (i * 0.05);
        }
        if (EFE3.equals(nvl)) {
            double i = ((SALARIO_BASE * 0.2) + SALARIO_BASE);
            return i + (i * 0.05);
        }
        return 0;
    }

    /*adicionar mensagem depois talvez*/
    public Efetivo(String area, String nome, String codigo, String nivel, String titulacao) {
        super(titulacao, nome, codigo, nivel);
        this.area = area;
        this.salario = calcularSalario(nivel);

    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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
