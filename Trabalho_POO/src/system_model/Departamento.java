/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system_model;

import java.util.logging.Level;
import java.util.logging.Logger;
import system_persistence.Database;
import static system_persistence.Database.MAX;

/**
 *
 * @author maayk
 */
public class Departamento implements Cloneable {

    private String codigo;
    private String nome;
    private Funcionario f[];
    private int countFunc;
    private double totalspend;
    private static Database database;

    public Departamento() {
        this.database = Database.getInstance();
        this.f = new Funcionario[MAX];
        this.totalspend = 0;
        this.countFunc = 0;
    }

    public Departamento(String code, String name) {
        this.codigo = code;
        this.nome = name;
        this.countFunc = 0;
        this.f = new Funcionario[MAX];
        this.totalspend = 0;
        this.database = Database.getInstance();
    }

    public void addEfetivo(String area, String nome, String codigo, String nivel, String titulacao) {
        Efetivo e = new Efetivo(area, nome, codigo, nivel, titulacao);
        database.addFunctionaries(e);
        f[countFunc] = e;
        countFunc++;
        this.totalspend = totalspend + e.calcularSalario(nivel);

    }

    public void addSubstituto(int cargahoraria, String nome, String codigo, String nivel, String titulacao) {
        Substituto s = new Substituto(cargahoraria, nome, codigo, nivel, titulacao);
        database.addFunctionaries(s);
        f[countFunc] = s;
        countFunc++;
        this.totalspend = totalspend + s.calcularSalario(nivel);
    }

    public void addTecnico(String funcao, String nome, String codigo, double salario, String nivel) {
        Tecnico t = new Tecnico(funcao, nome, codigo, nivel);
        database.addFunctionaries(t);
        f[countFunc] = t;
        countFunc++;
        this.totalspend = totalspend + t.calcularSalario(nivel);
    }

    public String showAllFunc() throws CloneNotSupportedException {
        Funcionario vet[] = database.funcionarios();
        String data = "";
        for (int i = 0; i < vet.length; i++) {
            data = data
                    + "Nome: " + vet[i].getNome() + "\n"
                    + "Codigo: " + vet[i].getCodigo() + "\n"
                    + "Salario: " + vet[i].getSalario() + "\n"
                    + "Nivel: " + vet[i].getNivel() + "\n";
        }
        return data;
    }

    public String showAllTec() throws CloneNotSupportedException {
        Funcionario vet[] = database.funcionarios();
        String data = "";
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] instanceof Tecnico) {
                data = data
                        + "Nome: " + vet[i].getNome() + "\n"
                        + "Codigo: " + vet[i].getCodigo() + "\n"
                        + "Salario: " + vet[i].getSalario() + "\n"
                        + "Nivel: " + vet[i].getNivel() + "\n";
            }
        }
        return data;
    }

    public String showAllDocentes() {
        Funcionario vet[] = database.funcionarios();
        String data = "";
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] instanceof Substituto) {
                data = data
                        + "Nome: " + vet[i].getNome() + "\n"
                        + "Codigo: " + vet[i].getCodigo() + "\n"
                        + "Salario: " + vet[i].getSalario() + "\n"
                        + "Nivel: " + vet[i].getNivel() + "\n"
                        + "Titulação: " + ((Substituto) vet[i]).getTitulacao() + "\n"
                        + "Carga horária: " + ((Substituto) vet[i]).getCargahoraria() + "\n";

            } else if (vet[i] instanceof Efetivo) {
                data = data
                        + "Nome: " + vet[i].getNome() + "\n"
                        + "Codigo: " + vet[i].getCodigo() + "\n"
                        + "Salario: " + vet[i].getSalario() + "\n"
                        + "Nivel: " + vet[i].getNivel() + "\n"
                        + "Titulação: " + ((Efetivo) vet[i]).getTitulacao() + "\n"
                        + "Área: " + ((Efetivo) vet[i]).getArea() + "\n";

            }
        }
        return data;
    }

    public String showAllSubs() {
        Funcionario vet[] = database.funcionarios();
        String data = "";
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] instanceof Substituto) {
                data = data
                        + "Nome: " + vet[i].getNome() + "\n"
                        + "Codigo: " + vet[i].getCodigo() + "\n"
                        + "Salario: " + vet[i].getSalario() + "\n"
                        + "Nivel: " + vet[i].getNivel() + "\n"
                        + "Titulação: " + ((Substituto) vet[i]).getTitulacao() + "\n"
                        + "Carga Horária: " + ((Substituto) vet[i]).getCargahoraria() + "\n";
            }
        }
        return data;
    }

    public String showAllEfetivo() throws CloneNotSupportedException {
        Funcionario vet[] = database.funcionarios();
        String data = "";
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] instanceof Efetivo) {
                data = data
                        + "Nome: " + vet[i].getNome() + "\n"
                        + "Codigo: " + vet[i].getCodigo() + "\n"
                        + "Salario: " + vet[i].getSalario() + "\n"
                        + "Nivel: " + vet[i].getNivel() + "\n"
                        + "Área: " + ((Efetivo) vet[i]).getArea() + "\n";
            }
        }
        return data;
    }

    public String showFuncSalarioEspec(double de, double ate) throws CloneNotSupportedException {
        Funcionario vet[] = database.funcionarios();
        String data = "";
        for (int i = 0; i < vet.length; i++) {
            if (vet[i].salario >= de && vet[i].salario <= ate) {
                data = data
                        + "Nome: " + vet[i].getNome() + "\n"
                        + "Codigo: " + vet[i].getCodigo() + "\n"
                        + "Salario: " + vet[i].getSalario() + "\n"
                        + "Nivel: " + vet[i].getNivel() + "\n";
            }
        }
        return data;
    }

    public String showFuncNome(String nome) throws CloneNotSupportedException {
        Funcionario fu = database.searchName(nome);
        String data = "";
        data = data
                + "Nome: " + fu.getNome() + "\n"
                + "Codigo: " + fu.getCodigo() + "\n"
                + "Salario: " + fu.getSalario() + "\n"
                + "Nivel: " + fu.getNivel() + "\n";

        return data;
    }

    public String showFuncCode(String code) throws CloneNotSupportedException {
        Funcionario fuc = database.searchCode(code);
        String data = "";
        data = data
                + "Nome: " + fuc.getNome() + "\n"
                + "Codigo: " + fuc.getCodigo() + "\n"
                + "Salario: " + fuc.getSalario() + "\n"
                + "Nivel: " + fuc.getNivel() + "\n";

        return data;
    }

    public String showInfoDepartamento(String code) throws CloneNotSupportedException {
        Departamento vet[] = database.departamentos();
        String data = "";
        for (int i = 0; i < vet.length; i++) {
            if (vet[i].getCodigo().equals(code)) {
                for (int j = 0; j < vet[i].countFunc; j++) {
                    if (j == (vet[i].countFunc) - 1) {
                        data = data
                                + "Nome: " + vet[i].f[j].nome + "\n"
                                + "Codigo: " + vet[i].f[j].codigo + "\n"
                                + "Salario: " + vet[i].f[j].salario + "\n"
                                + "Nivel: " + vet[i].f[j].nivel + "\n"
                                + "Gastos totais: " + vet[i].totalspend + "\n";
                        return data;
                    }
                    data = data
                            + "Nome: " + vet[i].f[j].nome + "\n"
                            + "Codigo: " + vet[i].f[j].codigo + "\n"
                            + "Salario: " + vet[i].f[j].salario + "\n"
                            + "Nivel: " + vet[i].f[j].nivel + "\n";

                }
            }
        }
        return data;
    }

    public String showGeneralDep() {
        Departamento vet[] = database.departamentos();
        String data = "";
        for (int i = 0; i < vet.length; i++) {
            data = data
                    + "\n\nDepartamento: " + vet[i].nome + "\n"
                    + "Codigo: " + vet[i].codigo + "\n"
                    + "Quantidade de Funcionários: " + vet[i].countFunc + "\n"
                    + "Gastos totais: " + vet[i].totalspend + "\n";
            for (int j = 0; j < vet[i].countFunc; j++) {
                if (j == (vet[i].countFunc) - 1) {
                    data = data
                            + "\n\nNome: " + vet[i].f[j].nome + "\n"
                            + "Codigo: " + vet[i].f[j].codigo + "\n"
                            + "Salario: " + vet[i].f[j].salario + "\n"
                            + "Nivel: " + vet[i].f[j].nivel + "\n"
                            + "Gastos totais: " + vet[i].totalspend + "\n\n";
                    return data;
                }
                data = data
                        + "\n\nNome: " + vet[i].f[j].nome + "\n"
                        + "Codigo: " + vet[i].f[j].codigo + "\n"
                        + "Salario: " + vet[i].f[j].salario + "\n"
                        + "Nivel: " + vet[i].f[j].nivel + "\n";
            }
        }

        return data;
    }

    public String showInfoDepartamentoFaixaEspecifica(double de, double ate) throws CloneNotSupportedException {
        Departamento vet[] = database.departamentos();
        String data = "";
        for (int i = 0; i < vet.length; i++) {
            if (vet[i].totalspend >= de && vet[i].totalspend <= ate) {
                data = data
                        + "Departamento: " + vet[i].nome + "\n"
                        + "Codigo: " + vet[i].codigo + "\n"
                        + "Quantidade de Funcionários: " + vet[i].countFunc + "\n"
                        + "Gastos totais: " + vet[i].totalspend + "\n";
            }
        }
        return data;
    }

    public String showInfoDepartamentos(double de, double ate) throws CloneNotSupportedException {
        Departamento vet[] = database.departamentos();
        String data = "";
        for (int i = 0; i < vet.length; i++) {
            data = data
                    + "Departamento: " + vet[i].nome + "\n"
                    + "Codigo: " + vet[i].codigo + "\n"
                    + "Quantidade de Funcionários: " + vet[i].countFunc + "\n"
                    + "Gastos totais: " + vet[i].totalspend + "\n";

        }
        return data;
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

    @Override
    public Departamento clone() {
        try {
            return (Departamento) super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Departamento.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
