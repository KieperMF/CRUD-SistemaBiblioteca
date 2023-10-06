/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import conexao.Conexao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.UsuarioModel;

public class UsuarioDAO {
    Connection con = null;
    PreparedStatement pstm = null;
    public void CadastrarUsuario(UsuarioModel usuario){
        String sql = "insert into usuario (nome,cpf) values (?,?)";
        
        try {
            con = Conexao.createConnection();
            pstm = con.prepareStatement(sql);
            
            pstm.setString(1, usuario.getNome());
            pstm.setString(2,usuario.getCpf());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Usuario Cadastrado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro Cadastro usuario:"+e);
        }
    }
    
     public void CadastrarEmprestimo(UsuarioModel usuario){
        String sql = "update usuario set livroNome = ? where usuarioId=?";
        
        try {
            con = Conexao.createConnection();
            pstm = con.prepareStatement(sql);
            
            pstm.setString(1,usuario.getLivroNome());
            pstm.setInt(2,usuario.getId());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Emprestimo Cadastrado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro Cadastro Emprestimo:"+e);
        }
    }
    
    public List<UsuarioModel> Mostrar(){
        String sql = "select * from usuario";

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        List<UsuarioModel> usuarios = new ArrayList<>();
        try {
            con = Conexao.createConnection();
            pstm = con.prepareStatement(sql);
            rset = pstm.executeQuery();
            while (rset.next()){
                UsuarioModel us = new UsuarioModel();
                us.setId(rset.getInt("usuarioId"));
                us.setNome(rset.getString("nome"));
                us.setCpf(rset.getString("cpf"));
                us.setLivroId(rset.getInt("fk_livro"));
                usuarios.add(us);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return usuarios;
    }
    
    public void Deletar(int id){
        String sql = "delete from usuario where usuarioId=?";
        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = Conexao.createConnection();
            pstm = con.prepareStatement(sql);

            pstm.setInt(1,id);
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Usuario deletado");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
    public void Atualizar(UsuarioModel usuario){
        String sql = "update usuario set nome=?,cpf=? where usuarioId=?";
        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = Conexao.createConnection();
            pstm = con.prepareStatement(sql);

            pstm.setString(1,usuario.getNome());
            pstm.setString(2,usuario.getCpf());
            pstm.setInt(3,usuario.getId());
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Usuario Atualizado");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
