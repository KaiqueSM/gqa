/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author 82328535
 */
public class Usuario {
 private long id;
 private String login; 
 private String senha;
 private String cpf;
 private String email;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 
 public Usuario(String login, String senha) { 
    this.login = login; 
    this.senha = senha; 
 }

    public Usuario(String login, String senha, String cpf, String email) {
        this.login = login;
        this.senha = senha;
        this.cpf = cpf;
        this.email = email;
    }

    public Usuario(long id, String login, String senha, String cpf, String email) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.cpf = cpf;
        this.email = email;
    }
    

 
 public String getLogin() { 
    return login; 
 } 
 public void setLogin(String login) { 
    this.login = login; 
 } 
  
 public String getSenha() { 
    return senha; 
 } 
 public void setSenha(String senha) { 
    this.senha = senha; 
 }
     public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario login=" + login + ", senha=" + senha;
    }
 
}