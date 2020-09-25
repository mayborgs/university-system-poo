/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system_control;

import system_model.Departamento;
import system_model.Universidade;

/**
 *
 * @author maayk
 */
public class Controller {

    private Universidade u = new Universidade("ESCOLINHA");
    private Departamento d = new Departamento();

    public void addEfetivo(String area, String nome, String codigo, String nivel, String titulacao, String codD, String nomeD) {
        u.addEfetivo(area, nome, codigo, nivel, titulacao, codD, nomeD);
    }

    public void addSubstituto(int cargahoraria, String nome, String codigo, String nivel, String titulacao, String codD, String nomeD) {
        u.addSubstituto(cargahoraria, nome, codigo, nivel, titulacao, codD, nomeD);
    }

    public void addTecnico(String funcao, String nome, String codigo, double salario, String nivel, String codD, String nomeD) {
        u.addTecnico(funcao, nome, codigo, salario, nivel, codD, nomeD);
    }

    public void addDepartments(String code, String name) {
        u.addDepartments(code, name);
    }

    public String showAllFunc() throws CloneNotSupportedException {
        return d.showAllFunc();
    }

    public String showAllTec() throws CloneNotSupportedException {
        return d.showAllTec();
    }

    public String showAllDocentes() throws CloneNotSupportedException {
        return d.showAllDocentes();
    }

    public String showAllSubs() throws CloneNotSupportedException {
        return d.showAllSubs();
    }

    public String showAllEfetivo() throws CloneNotSupportedException {
        return d.showAllEfetivo();
    }

    public String showFuncSalarioEspec(double de, double ate) throws CloneNotSupportedException {
        return d.showFuncSalarioEspec(de, ate);
    }

    public String showInfoDepartamento(String code) throws CloneNotSupportedException {
        return d.showInfoDepartamento(code);
    }

    public String showGeneralDep() {
        return d.showGeneralDep();
    }

    public String showInfoDepartamentoFaixaEspecifica(double de, double ate) throws CloneNotSupportedException {
        return d.showInfoDepartamentoFaixaEspecifica(de, ate);
    }

    public String showInfoDepartamentos(double de, double ate) throws CloneNotSupportedException {
        return d.showInfoDepartamentos(de, ate);
    }

    public String showFuncNome(String nome1) throws CloneNotSupportedException {
        return d.showFuncNome(nome1);
    }

    public String showFuncCode(String code1) throws CloneNotSupportedException {
        return d.showFuncCode(code1);

    }

}
