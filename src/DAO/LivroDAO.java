/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.PreparedStatement;
import conexao.Conexao;
import model.LivroModel;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.SecaoModel;
import model.SubsecaoModel;

/**
 *
 * @author kiepe
 */
public class LivroDAO {
    Connection con = null;
    PreparedStatement pstm = null;
    ResultSet rset = null;
    public void CadastrarLivro(LivroModel livro){
        String sql = "insert into livro (titulo, autor, secaoId,subsecaoId) values (?,?,?,?) ";
              
        try {
            con = (Connection) Conexao.createConnection();
            pstm =  con.prepareStatement(sql);
            
            pstm.setString(1, livro.getTitulo());
            pstm.setString(2, livro.getAutor());
            pstm.setInt(3, livro.getSecaoId());
            pstm.setInt(4, livro.getSubsecaoId());
            
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Livro Cadastrado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro no cadastro:"+e);
        }
    }
    
    public List<LivroModel> RecuperarLivros(){
        String sql = "select * from livro";
        List<LivroModel> livros = new ArrayList<>();
        try {
            con = Conexao.createConnection();
            pstm = con.prepareStatement(sql);
            rset = pstm.executeQuery();
            while(rset.next()){
                LivroModel livro = new LivroModel();
                livro.setId(rset.getInt("livroID"));
                livro.setTitulo(rset.getString("titulo"));
                livro.setAutor(rset.getString("autor"));
                livro.setSecaoId(rset.getInt("secaoId"));
                livro.setSubsecaoId(rset.getInt("subsecaoId"));
                livro.setData(rset.getString("dataCadastro"));
                livros.add(livro);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Recuperar livros erro:"+e);
        }
        return livros;
    }
    
   /* public ResultSet Secao(){
        String sql = "select * from secoes";
        try {
            pstm = con.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }*/
    
    public List<SecaoModel> Secoes(){
        String sql = "select * from secoes";
        List<SecaoModel> secoes = new ArrayList<>();
        rset = null;
        try {
           con = Conexao.createConnection();
            pstm = con.prepareStatement(sql);
            rset = pstm.executeQuery();
            while(rset.next()){
                SecaoModel sec = new SecaoModel();
                sec.setId(rset.getInt("secaoId"));
                sec.setSecao(rset.getString("secao"));
                secoes.add(sec);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return secoes;
    }
    
    public List<SubsecaoModel> Subsecao(){
        String sql = "select * from subsecoes";
        List<SubsecaoModel> subsecoes = new ArrayList<>();
        rset = null;
        try {
           con = Conexao.createConnection();
            pstm = con.prepareStatement(sql);
            rset = pstm.executeQuery();
            while(rset.next()){
                SubsecaoModel sub = new SubsecaoModel();
                sub.setId(rset.getInt("subsecoesId"));
                sub.setSubsecao(rset.getString("subsecao"));
                subsecoes.add(sub);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return subsecoes;
    }
    
    public ResultSet InnerJoin(){
        String sql = "select livro.titulo,livro.autor,livro.dataCadastro,livro.livroId, secoes.secao, subsecoes.subsecao from livro \n" +
        "inner join secoes on livro.secaoId = secoes.secaoId inner join subsecoes on livro.subsecaoId = subsecoes.subsecoesId";
        try {
            con = Conexao.createConnection();
            pstm = con.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "inner join erro"+e);
            return null;
        }        
    }
    
    public void DeletarLivro(int id){
        String sql = "delete from livro where livroId=?";
        Connection con = null;
        PreparedStatement pstm = null;

        try {
            con = Conexao.createConnection();
            pstm = con.prepareCall(sql);

            pstm.setInt(1, id);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Livro deletado.");
        }catch (Exception e){
            System.out.println("Erro:"+e);
        }
    }
    
    public void AtualizarLivro(LivroModel livro){
        String sql = "update livro set titulo=?, autor =?, secaoId=?,subsecaoId=? where livroId=?;";
        Connection con = null;
        PreparedStatement pstm = null;

        try{
            con= Conexao.createConnection();
            pstm = con.prepareStatement(sql);

            pstm.setString(1,livro.getTitulo());
            pstm.setString(2,livro.getAutor()); 
            pstm.setInt(3, livro.getSecaoId());
            pstm.setInt(4, livro.getSubsecaoId());
            pstm.setInt(5,livro.getId());

            pstm.execute();
            JOptionPane.showMessageDialog(null,"Livro atualizado");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Livro atualizado erro: "+e);
        }
    }
    
    
}
