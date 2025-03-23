/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 82328535
 */
public class DAO { 
   public boolean existe (Usuario usuario) throws Exception{ 
     String sql = "SELECT * FROM tab_usuario WHERE nome = ? AND senha = ?"; 
     try (Connection conn = ConexaoDB.obtemConexao(); 
     PreparedStatement ps = conn.prepareStatement(sql)){ 
        ps.setString(1, usuario.getLogin()); 
        ps.setString(2, usuario.getSenha()); 
        try (ResultSet rs = ps.executeQuery()){ 
            return rs.next(); 
        } 
     } 
   }
   public void inserirUsuario(Usuario usuario) throws Exception{
       String sql = "INSERT INTO db_biblioteca.tab_usuario (nome,senha,cpf,email) values (?,?,?,?)";
       try (Connection conn = ConexaoDB.obtemConexao();
               PreparedStatement ps = conn.prepareStatement(sql)){
           ps.setString(1, usuario.getLogin());
           ps.setString(2, usuario.getSenha());
           ps.setString(3, usuario.getCpf());
           ps.setString(4, usuario.getEmail());
           ps.execute();
       }
    }
      public void inserirLivro(Acervo acervo) throws Exception{
       String sql = "INSERT INTO db_biblioteca.tab_acervo (nome,genero,autor,editora,valor) values (?,?,?,?,?)";
       try (Connection conn = ConexaoDB.obtemConexao();
               PreparedStatement ps = conn.prepareStatement(sql)){
           ps.setString(1, acervo.getNome());
           ps.setString(2, acervo.getGenero());
           ps.setString(3, acervo.getAutor());
           ps.setString(4, acervo.getEditora());
           ps.setString(5, acervo.getValor());
           ps.execute();
       }
    }
        public boolean excluirLivro(Acervo acervo) throws Exception {
        String sql = "DELETE FROM db_biblioteca.tab_acervo WHERE nome = ?";
        try (Connection conn = ConexaoDB.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, acervo.getNome());
            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        }
    }

    public Usuario buscarUsuarioPorLogin(String login) {
    Usuario usuario = null;
    String sql = "SELECT nome, senha, cpf, email FROM db_biblioteca.tab_usuario WHERE nome = ?";

    try (Connection conn = ConexaoDB.obtemConexao();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, login);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            String nome = rs.getString("nome");
            String senha = rs.getString("senha");
            String cpf = rs.getString("cpf");
            String email = rs.getString("email");

            usuario = new Usuario(nome, senha, cpf, email);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return usuario;
}
}

