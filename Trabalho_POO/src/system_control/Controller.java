/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system_control;

import system_model.Universidade;

/**
 *
 * @author maayk
 */
public class Controller {
    
    private Universidade u = new Universidade("ESCOLINHA");
    
    public void addEfetivo(String area, String nome, String codigo, String nivel, String titulacao) {
        u.d.addEfetivo(area, nome, codigo, nivel, titulacao);
    }
    
    public void addSubstituto(int cargahoraria, String area, String nome, String codigo, double salario, String nivel, String titulacao) {
        u.d.addSubstituto(cargahoraria, area, nome, codigo, salario, nivel, titulacao);
    }
    
    public void addTecnico(String funcao, String nome, String codigo, double salario, String nivel) {
        u.d.addTecnico(funcao, nome, codigo, salario, nivel);
    }
    
    public void addDepartments(String code, String name) {
        u.addDepartments(code, name);
    }
    
    public String showAllFunc() throws CloneNotSupportedException {
        return u.d.showAllFunc();
    }
    
    
    public String showAllTec() throws CloneNotSupportedException {
       return u.d.showAllTec();
    }

    public String showAllDocentes() throws CloneNotSupportedException {
      return u.d.showAllDocentes();
    }

    public String showAllSubs() throws CloneNotSupportedException {
       return u.d.showAllSubs();
    }

    public String showAllEfetivo() throws CloneNotSupportedException {
       return u.d.showAllEfetivo();
    }

    public String showFuncSalarioEspec(double de, double ate) throws CloneNotSupportedException {
      return u.d.showFuncSalarioEspec(de, ate);
    }

    public String showInfoDepartamento(String code) throws CloneNotSupportedException {
       return u.d.showInfoDepartamento(code);
    }

    public String showGeneralDep() throws CloneNotSupportedException {
       return u.d.showGeneralDep();
    }

    public String showInfoDepartamentoFaixaEspecifica(double de, double ate) throws CloneNotSupportedException {
        return u.d.showInfoDepartamentoFaixaEspecifica(de, ate);
    }

    public String showInfoDepartamentos(double de, double ate) throws CloneNotSupportedException {
        return u.d.showInfoDepartamentos(de, ate);
    }
    }
    
    

