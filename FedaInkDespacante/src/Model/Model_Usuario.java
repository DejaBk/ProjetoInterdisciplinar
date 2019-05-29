/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author deja
 */
public class Model_Usuario {
    private int cod_usu;
    private String nome_usu, cpf_usu, telefone_usu, login_usu, senha_usu;

    public Model_Usuario(int cod_usu, String nome_usu, String cpf_usu, String telefone_usu, String login_usu, String senha_usu) {
        this.cod_usu = cod_usu;
        this.nome_usu = nome_usu;
        this.cpf_usu = cpf_usu;
        this.telefone_usu = telefone_usu;
        this.login_usu = login_usu;
        this.senha_usu = senha_usu;
    }
    
    public Model_Usuario(){
    
    }

    public int getCod_usu() {
        return cod_usu;
    }

    public void setCod_usu(int cod_usu) {
        this.cod_usu = cod_usu;
    }

    public String getNome_usu() {
        return nome_usu;
    }

    public void setNome_usu(String nome_usu) {
        this.nome_usu = nome_usu;
    }

    public String getCpf_usu() {
        return cpf_usu;
    }

    public void setCpf_usu(String cpf_usu) {
        this.cpf_usu = cpf_usu;
    }

    public String getTelefone_usu() {
        return telefone_usu;
    }

    public void setTelefone_usu(String telefone_usu) {
        this.telefone_usu = telefone_usu;
    }

    public String getLogin_usu() {
        return login_usu;
    }

    public void setLogin_usu(String login_usu) {
        this.login_usu = login_usu;
    }

    public String getSenha_usu() {
        return senha_usu;
    }

    public void setSenha_usu(String senha_usu) {
        this.senha_usu = senha_usu;
    }
    
    
}
